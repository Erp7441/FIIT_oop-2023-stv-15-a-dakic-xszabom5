package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.PropertiesMenuController;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

public class GymModel extends Model implements Serialization{

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
    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



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
        return getPropertiesMenu().equals(gymModel.getPropertiesMenu());
    }

    @Override
    public int hashCode(){
        int result = getAmountOfEquipment();
        result = 31 * result + getPropertiesMenu().hashCode();
        return result;
    }
}
