package sk.stuba.fiit.martin.szabo.gymbro.utils;

import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;

public class Property extends Serialization{
    private String name = null;
    private Object value = null;

    public Property(){}

    public Property(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }
}
