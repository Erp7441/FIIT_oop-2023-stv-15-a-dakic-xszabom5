package com.gymbro.utils;

import com.gymbro.file.Serialization;

/**
 * The type Property.
 */
public class Property implements Serialization{
    private String name = null;
    private Object value = null;

    /**
     * Instantiates a new Property.
     */
    public Property(){}

    /**
     * Instantiates a new Property.
     *
     * @param name  the name
     * @param value the value
     */
    public Property(String name, Object value){
        this.name = name;
        this.value = value;
    }

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){
        return name;
    }

    /**
     * Set name.
     *
     * @param name the name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Get value object.
     *
     * @return the object
     */
    public Object getValue(){
        return value;
    }

    /**
     * Set value.
     *
     * @param value the value
     */
    public void setValue(Object value){
        this.value = value;
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();

        builder.append(beginObjectProperty("Property", tabSize));

        builder.append(addStringProperty("Name", this.getName(), tabSize + 1, true, true));
        builder.append(addStringProperty("Value", this.getValue().toString(), tabSize + 1, true, false));

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

    @Override
    public String toString(){
        return this.getName() + ": " + this.getValue();
    }
}
