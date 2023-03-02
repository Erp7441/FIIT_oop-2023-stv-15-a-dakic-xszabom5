package sk.stuba.fiit.martin.szabo.gymbro.menu;

import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;

public class ModalMenu extends Serialization{
    private ArrayList<Property> properties = new ArrayList<>();
    private Transform transform = new Transform();

    public ModalMenu(){}

    public ModalMenu(ArrayList<Property> properties, Transform transform){
        this.properties = properties;
        this.transform = transform;
    }

    public void show(){}

    public ArrayList<Property> getProperties(){
        return properties;
    }

    public void setProperties(ArrayList<Property> properties){
        this.properties = properties;
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }
}
