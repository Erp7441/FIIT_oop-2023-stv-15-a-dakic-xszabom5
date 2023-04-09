package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;

public class ModalMenuModel extends Model implements Serialization{
    private ArrayList<Property> properties = new ArrayList<>();


    public ModalMenuModel(){}

    public ModalMenuModel(ArrayList<Property> properties, Transform transform, Image texture){
        super(transform, texture);
        this.properties = properties;
    }

    public ModalMenuModel(ArrayList<Property> properties, Transform transform, String texturePath){
        super(transform, texturePath);
        this.properties = properties;
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }


    public ArrayList<Property> getProperties(){
        return properties;
    }

    public void setProperties(ArrayList<Property> properties){
        this.properties = properties;
    }

}
