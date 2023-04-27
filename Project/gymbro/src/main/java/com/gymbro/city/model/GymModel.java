package com.gymbro.city.model;

import javafx.scene.image.Image;
import com.gymbro.city.controller.PropertiesMenuController;
import com.gymbro.utils.Property;
import com.gymbro.utils.Transform;

/**
 * The type Gym model.
 */
public class GymModel extends Model{

    private int amountOfEquipment;
    private PropertiesMenuController propertiesMenu = null;

    /**
     * Instantiates a new Gym model.
     */
    public GymModel(){ super(); }

    /**
     * Instantiates a new Gym model.
     *
     * @param transform         the transform
     * @param amountOfEquipment the amount of equipment
     * @param texture           the texture
     */
    public GymModel(Transform transform, int amountOfEquipment, Image texture){
        super(transform, texture);
        this.amountOfEquipment = amountOfEquipment;
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
        this.amountOfEquipment = amountOfEquipment;
    }

    // TODO:: Move to controller
    @Override
    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();

        builder.append(beginObjectProperty("GymModel", tabSize));

        builder.append(this.getTransform().serialize(tabSize + 1));
        builder.append(addEnding(true, true));

        builder.append(addIntProperty("AmountOfEquipment", this.getAmountOfEquipment(), tabSize + 1, true, true));
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
     * Get amount of equipment int.
     *
     * @return the int
     */
    public int getAmountOfEquipment(){
        return amountOfEquipment;
    }

    /**
     * Set amount of equipment.
     *
     * @param amountOfEquipment the amount of equipment
     */
    public void setAmountOfEquipment(int amountOfEquipment){
        this.amountOfEquipment = amountOfEquipment;
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

        if(getAmountOfEquipment() != gymModel.getAmountOfEquipment()) return false;
        return getPropertiesMenu().getModel().equals(gymModel.getPropertiesMenu().getModel());
    }

    @Override
    public int hashCode(){
        int result = getAmountOfEquipment();
        result = 31 * result + getPropertiesMenu().hashCode();
        return result;
    }
}
