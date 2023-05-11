package com.gymbro.city.model;

import com.gymbro.city.controller.PropertiesMenuController;
import com.gymbro.utils.Property;
import com.gymbro.utils.Transform;
import javafx.scene.image.Image;

/**
 * The type Gym model.
 */
public class GymModel extends Model{

    private PropertiesMenuController propertiesMenu = null;

    /**
     * Instantiates a new Gym model.
     */
    public GymModel(){ super(); }

    /**
     * Instantiates a new Gym model.
     *
     * @param transform the transform
     * @param texture   the texture
     */
    public GymModel(Transform transform, Image texture){
        super(transform, texture);
    }

    /**
     * Instantiates a new Gym model.
     *
     * @param transform         the transform
     * @param amountOfEquipment the amount of equipment
     * @param texturePath       the texture path
     */
    public GymModel(Transform transform, int amountOfEquipment, String texturePath){
        super(transform, texturePath);
    }

    @Override
    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();

        builder.append(beginObjectProperty("GymModel", tabSize));

        builder.append(this.getTransform().serialize(tabSize + 1));
        builder.append(addEnding(true, true));

        builder.append(addStringProperty("Texture", this.getTexture().getUrl(), tabSize + 1, true, true));

        if(this.getPropertiesMenu() != null){
            builder.append(this.getPropertiesMenu().getModel().serialize(tabSize + 1));
        }

        builder.append(addEnding(true, false));
        builder.append(endObjectProperty(tabSize));
        return builder.toString();
    }

    /**
     * Deserialize property.
     *
     * @return the property
     */
    public static Property deserialize(){


        return null;
    }


    /**
     * Get properties menu properties menu controller.
     *
     * @return the properties menu controller
     */
    public PropertiesMenuController getPropertiesMenu(){
        return propertiesMenu;
    }

    /**
     * Set properties menu.
     *
     * @param propertiesMenu the properties menu
     */
    public void setPropertiesMenu(PropertiesMenuController propertiesMenu){
        this.propertiesMenu = propertiesMenu;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        GymModel gymModel = (GymModel) o;

        return getPropertiesMenu().getModel().equals(gymModel.getPropertiesMenu().getModel());
    }

    @Override
    public int hashCode(){
        return getPropertiesMenu() != null ? getPropertiesMenu().hashCode() : 0;
    }
}
