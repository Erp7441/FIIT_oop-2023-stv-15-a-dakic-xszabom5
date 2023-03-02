package sk.stuba.fiit.martin.szabo.gymbro.city;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.menu.ModalMenu;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

public class Gym extends Serialization{

    private Transform transform = new Transform();
    private Image texture = null;
    private Integer amountOfEquipment = null;
    private ModalMenu menu = null;

    public Gym(){}

    public Gym(Transform transform, Integer amountOfEquipment, String texturePath){
        this.transform = transform;
        this.amountOfEquipment = amountOfEquipment;
        this.texture = new Image(texturePath);
    }

    public Transform getTransform(){
        return transform;
    }

    public void setTransform(Transform transform){
        this.transform = transform;
    }

    public Image getTexture(){
        return texture;
    }

    public void setTexture(Image texture){
        this.texture = texture;
    }

    public ModalMenu getMenu(){
        return menu;
    }

    public void setMenu(ModalMenu menu){
        this.menu = menu;
    }
    public Integer getAmountOfEquipment(){
        return amountOfEquipment;
    }

    public void setAmountOfEquipment(Integer amountOfEquipment){
        this.amountOfEquipment = amountOfEquipment;
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }
}
