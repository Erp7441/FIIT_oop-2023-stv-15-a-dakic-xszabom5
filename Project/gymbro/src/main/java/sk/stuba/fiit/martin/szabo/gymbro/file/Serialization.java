package sk.stuba.fiit.martin.szabo.gymbro.file;

// TODO:: Refactor to interface with static/default methods?
public interface Serialization{

    default String addStringProperty(String name, String value, int tabSize, boolean newline, boolean comma) {
        return addTabs(tabSize) + "\"" + name + "\": \"" + value + "\"" + addEnding(newline, comma);
    }

    default String addIntProperty(String name, int value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + addEnding(newline, comma);
    }

    default String addFloatProperty(String name, float value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + "f" + addEnding(newline, comma);
    }

    default String addDoubleProperty(String name, double value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + addEnding(newline, comma);
    }

    default String addBooleanProperty(String name, boolean value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + addEnding(newline, comma);
    }

    default String beginObjectProperty(String name, int tabSize) {
        return addTabs(tabSize) + "\"" + name + "\": {" + addEnding(true, false);
    }

    default String endObjectProperty(int tabSize) {
        return addTabs(tabSize) + "}";
    }

    default String addTabs(int tabSize) {
        return "\t".repeat(Math.max(0, tabSize));
    }

    default String addEnding(boolean newline, boolean comma){
        String str = "";
        if (comma) str += ",";
        if (newline) str += "\n";
        return str;
    }


}