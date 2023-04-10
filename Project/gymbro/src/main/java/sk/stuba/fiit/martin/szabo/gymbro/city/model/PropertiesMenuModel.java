package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;

public class PropertiesMenuModel extends Model implements Serialization{
    private ArrayList<Property> properties = new ArrayList<>();
    private GymController owner = null;


    public PropertiesMenuModel(){}

    public PropertiesMenuModel(ArrayList<Property> properties, Transform transform, Image texture, GymController owner){
        super(transform, texture);
        this.properties = properties;
        this.owner = owner;
    }

    public PropertiesMenuModel(ArrayList<Property> properties, Transform transform, String texturePath, GymController owner){
        super(transform, texturePath);
        this.properties = properties;
        this.owner = owner;
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

    public GymController getOwner(){
        return owner;
    }

    public void setOwner(GymController owner){
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        PropertiesMenuModel that = (PropertiesMenuModel) o;

        if(this.getProperties().size() != that.getProperties().size()) return false;

        for(int i = 0; i < this.getProperties().size(); i++){
            if(
                !this.getProperties().get(i).getName().equals(that.getProperties().get(i).getName()) ||
                !this.getProperties().get(i).getValue().equals(that.getProperties().get(i).getValue())
            ) return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        int result = getProperties().hashCode();
        result = 31 * result + getOwner().hashCode();
        return result;
    }
}
