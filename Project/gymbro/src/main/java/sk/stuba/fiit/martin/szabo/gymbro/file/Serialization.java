package sk.stuba.fiit.martin.szabo.gymbro.file;

public abstract class Serialization{

    public String addStringProperty(String name, String value, int tabSize, boolean newline, boolean comma) {
        return addTabs(tabSize) + "\"" + name + "\": \"" + value + "\"" + addEnding(newline, comma);
    }

    public String addIntProperty(String name, int value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + addEnding(newline, comma);
    }

    public String addFloatProperty(String name, float value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + "f" + addEnding(newline, comma);
    }

    public String addDoubleProperty(String name, double value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + addEnding(newline, comma);
    }

    public String addBooleanProperty(String name, boolean value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + addEnding(newline, comma);
    }

    public String beginObjectProperty(String name, int tabSize) {
        return addTabs(tabSize) + "\"" + name + "\": {" + addEnding(true, false);
    }

    public String endObjectProperty(int tabSize) {
        return addTabs(tabSize) + "}";
    }

    public String addTabs(int tabSize) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < tabSize; i++){
            builder.append("\t");
        }
        return builder.toString();
    }

    public String addEnding(boolean newline, boolean comma){
        String str = "";
        if (comma) str += ",";
        if (newline) str += "\n";
        return str;
    }


}