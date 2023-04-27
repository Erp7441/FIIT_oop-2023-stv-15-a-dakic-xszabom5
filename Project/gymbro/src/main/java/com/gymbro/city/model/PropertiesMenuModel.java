package com.gymbro.city.model;

import javafx.scene.image.Image;
import com.gymbro.city.controller.GymController;
import com.gymbro.file.Parser;
import com.gymbro.utils.Property;
import com.gymbro.utils.Transform;

import java.util.ArrayList;

/**
 * The type Properties menu model.
 */
public class PropertiesMenuModel extends Model{
    private ArrayList<Property> properties = new ArrayList<>();
    private GymController owner = null;


    /**
     * Instantiates a new Properties menu model.
     */
    public PropertiesMenuModel(){}

    /**
     * Instantiates a new Properties menu model.
     *
     * @param properties the properties
     * @param transform  the transform
     * @param texture    the texture
     * @param owner      the owner
     */
    public PropertiesMenuModel(ArrayList<Property> properties, Transform transform, Image texture, GymController owner){
        super(transform, texture);
        this.properties = properties;
        this.owner = owner;
    }

    /**
     * Instantiates a new Properties menu model.
     *
     * @param properties  the properties
     * @param transform   the transform
     * @param texturePath the texture path
     * @param owner       the owner
     */
    public PropertiesMenuModel(ArrayList<Property> properties, Transform transform, String texturePath, GymController owner){
        super(transform, texturePath);
        this.properties = properties;
        this.owner = owner;
    }

    @Override
    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();

        builder.append(beginObjectProperty("Properties", tabSize));

        int count = 0;
        for(Property property : this.getProperties()){
            builder.append(property.serialize(tabSize + 1));
            builder.append(addEnding(true, count != this.getProperties().size() - 1));
            count++;
        }

        builder.append(endObjectProperty(tabSize));
        return builder.toString();
    }

    /**
     * Deserialize properties menu model.
     *
     * @return the properties menu model
     */
    public static PropertiesMenuModel deserialize(){
        Parser.consumeBeginObjectProperty("Properties");
        Parser.skipWhitespace();

        PropertiesMenuModel model = new PropertiesMenuModel();

        if(Parser.peek() == '"'){
            model.getProperties().add(Parser.parseProperty());
            while(Parser.peek() == ','){
                Parser.consume(',');
                Parser.skipWhitespace();
                model.getProperties().add(Parser.parseProperty());
            }
            Parser.skipWhitespace();
        }
        Parser.consumeEndObjectProperty();

        return model;
    }


    /**
     * Get properties array list.
     *
     * @return the array list
     */
    public ArrayList<Property> getProperties(){
        return properties;
    }

    /**
     * Set properties.
     *
     * @param properties the properties
     */
    public void setProperties(ArrayList<Property> properties){
        this.properties = properties;
    }

    /**
     * Get owner gym controller.
     *
     * @return the gym controller
     */
    public GymController getOwner(){
        return owner;
    }

    /**
     * Set owner.
     *
     * @param owner the owner
     */
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
