package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.ModalMenuController;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

public class GymModel extends Model implements Serialization{

    private int amountOfEquipment;
    private ModalMenuController modalMenu = null;

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

    public ModalMenuController getModalMenu(){
        return modalMenu;
    }

    public void setModalMenu(ModalMenuController modalMenu){
        this.modalMenu = modalMenu;
    }
}
