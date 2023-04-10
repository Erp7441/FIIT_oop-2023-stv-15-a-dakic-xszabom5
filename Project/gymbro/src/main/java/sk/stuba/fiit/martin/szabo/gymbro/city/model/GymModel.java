package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.PropertiesMenuController;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

public class GymModel extends Model{

    private int amountOfEquipment;
    private PropertiesMenuController propertiesMenu = null;

    public GymModel(){ super(); }

    public GymModel(Transform transform, int amountOfEquipment, Image texture){
        super(transform, texture);
        this.amountOfEquipment = amountOfEquipment;
    }

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

    public static Property deserialize(){


        return null;
    }

    public int getAmountOfEquipment(){
        return amountOfEquipment;
    }

    public void setAmountOfEquipment(int amountOfEquipment){
        this.amountOfEquipment = amountOfEquipment;
    }

    public PropertiesMenuController getPropertiesMenu(){
        return propertiesMenu;
    }

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
