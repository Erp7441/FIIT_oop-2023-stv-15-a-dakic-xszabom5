package sk.stuba.fiit.martin.szabo.gymbro.utils;

import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;

public class Property implements Serialization{
    private String name = null;
    private Object value = null;

    public Property(){}

    public Property(String name, Object value){
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

        builder.append(beginObjectProperty("Property", tabSize));

        builder.append(addStringProperty("Name", this.getName(), tabSize + 1, true, true));
        builder.append(addStringProperty("Value", this.getValue().toString(), tabSize + 1, true, false));

        builder.append(endObjectProperty(tabSize));

        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }

    @Override
    public String toString(){
        return this.getName() + ": " + this.getValue();
    }
}
