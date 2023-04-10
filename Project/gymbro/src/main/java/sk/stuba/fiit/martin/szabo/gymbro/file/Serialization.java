package sk.stuba.fiit.martin.szabo.gymbro.file;

/**
 * The interface Serialization.
 */
// TODO:: Refactor to interface with static/default methods?
public interface Serialization{

    /**
     * Add string property string.
     *
     * @param name    the name
     * @param value   the value
     * @param tabSize the tab size
     * @param newline the newline
     * @param comma   the comma
     * @return the string
     */
    default String addStringProperty(String name, String value, int tabSize, boolean newline, boolean comma) {
        return addTabs(tabSize) + "\"" + name + "\": \"" + value + "\"" + addEnding(newline, comma);
    }

    /**
     * Add int property string.
     *
     * @param name    the name
     * @param value   the value
     * @param tabSize the tab size
     * @param newline the newline
     * @param comma   the comma
     * @return the string
     */
    default String addIntProperty(String name, int value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + addEnding(newline, comma);
    }

    /**
     * Add float property string.
     *
     * @param name    the name
     * @param value   the value
     * @param tabSize the tab size
     * @param newline the newline
     * @param comma   the comma
     * @return the string
     */
    default String addFloatProperty(String name, float value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + "f" + addEnding(newline, comma);
    }

    /**
     * Add double property string.
     *
     * @param name    the name
     * @param value   the value
     * @param tabSize the tab size
     * @param newline the newline
     * @param comma   the comma
     * @return the string
     */
    default String addDoubleProperty(String name, double value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + addEnding(newline, comma);
    }

    /**
     * Add boolean property string.
     *
     * @param name    the name
     * @param value   the value
     * @param tabSize the tab size
     * @param newline the newline
     * @param comma   the comma
     * @return the string
     */
    default String addBooleanProperty(String name, boolean value, int tabSize, boolean newline, boolean comma){
        return addTabs(tabSize) + "\"" + name + "\": " + value + addEnding(newline, comma);
    }

    /**
     * Begin object property string.
     *
     * @param name    the name
     * @param tabSize the tab size
     * @return the string
     */
    default String beginObjectProperty(String name, int tabSize) {
        return addTabs(tabSize) + "\"" + name + "\": {" + addEnding(true, false);
    }

    /**
     * End object property string.
     *
     * @param tabSize the tab size
     * @return the string
     */
    default String endObjectProperty(int tabSize) {
        return addTabs(tabSize) + "}";
    }

    /**
     * Add tabs string.
     *
     * @param tabSize the tab size
     * @return the string
     */
    default String addTabs(int tabSize) {
        return "\t".repeat(Math.max(0, tabSize));
    }

    /**
     * Add ending string.
     *
     * @param newline the newline
     * @param comma   the comma
     * @return the string
     */
    default String addEnding(boolean newline, boolean comma){
        String str = "";
        if (comma) str += ",";
        if (newline) str += "\n";
        return str;
    }

    /**
     * Serialize string.
     *
     * @param tabSize the tab size
     * @return the string
     */
    String serialize(int tabSize);


}