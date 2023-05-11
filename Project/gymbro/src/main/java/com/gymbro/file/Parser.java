package com.gymbro.file;

import com.gymbro.Main;
import com.gymbro.city.controller.FavoritesController;
import com.gymbro.city.controller.GymController;
import com.gymbro.city.controller.PropertiesMenuController;
import com.gymbro.city.model.FavoritesModel;
import com.gymbro.city.model.GymModel;
import com.gymbro.city.model.PropertiesMenuModel;
import com.gymbro.utils.FileNameException;
import com.gymbro.utils.Places;
import com.gymbro.utils.Property;
import com.gymbro.utils.Transform;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


/**
 * The type Parser.
 */
public class Parser{
    private static int offset = 0;
    private static int line = 1;
    private static byte[] bytes;

    /**
     * Get bytes byte [ ].
     *
     * @return the byte [ ]
     */
    public static byte[] getBytes(){
        return bytes;
    }

    private Parser() {}

    /**
     * Open file.
     *
     * @param fileName the file name
     * @throws FileNameException the file name exception
     */
    public static void openFile(String fileName) throws FileNameException{
        try {

            String path = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
            String folderPath = path.substring(0, path.lastIndexOf("/") + 1);

            // Checks if file exists. If it does then get its length.
            File temp = new File(folderPath + "/" + fileName + ".zip");
            if(!temp.exists()){ return; }

            ZipFile zip = new ZipFile(folderPath + "/" + fileName + ".zip");
            ZipEntry json = zip.getEntry(fileName + ".json");
            InputStream stream = zip.getInputStream(json);
            bytes = readAllBytes(stream);

            // Resets variables
            if(offset != 0){
                offset = 0;
            }
            if(line != 1){
                line = 1;
            }

            zip.close();
        }
        catch(IOException | URISyntaxException e){
            e.printStackTrace();
            throw new FileNameException("Could not open file for parsing!");
        }
    }

    /**
     * Open file path.
     *
     * @param filePath the file path
     * @throws FileNameException the file name exception
     */
    public static void openFilePath(String filePath) throws FileNameException{
        try {
            InputStream stream = Main.class.getResourceAsStream(filePath);
            assert stream != null;
            bytes = readAllBytes(stream);

            // Resets variables
            if(offset != 0){
                offset = 0;
            }
            if(line != 1){
                line = 1;
            }
        }
        catch(IOException e){
            e.printStackTrace();
            throw new FileNameException("Could not open file for parsing!");
        }
    }

    /**
     * Read all bytes byte [ ].
     *
     * @param stream the stream
     * @return the byte [ ]
     * @throws IOException the io exception
     */
    public static byte[] readAllBytes(InputStream stream) throws IOException{
        byte[] buffer = new byte[1000];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int tempByte;
        while((tempByte = stream.read(buffer)) != -1){
            bos.write(buffer, 0, tempByte);
        }
        return bos.toByteArray();
    }

    /**
     * Skip whitespace.
     */
    public static void skipWhitespace(){
        while(!atEnd() && (peek() == ' ' || peek() == '\n' || peek() == '\t' || peek() == '\r')){
            if(peek() == '\n') { line++; }
            advance();
        }
    }

    /**
     * Peek char.
     *
     * @return the char
     */
    public static char peek() {
        return (char)bytes[offset];
    }

    /**
     * Advance char.
     *
     * @return the char
     */
    public static char advance(){
        char current = peek();
        offset++;
        return current;
    }

    /**
     * Consume.
     *
     * @param character the character
     */
    public static void consume(char character){
        char current = peek();
        if(current != character){
            System.out.println("Expecting '" + character + "' but got '" + current + "' at line: " + line);
            System.exit(-1);
        }
        offset++;
    }

    /**
     * At end boolean.
     *
     * @return the boolean
     */
    public static boolean atEnd(){
        return offset == (bytes.length)-1;
    }

    /**
     * Parse int int.
     *
     * @return the int
     */
    public static int parseInt(){
        skipWhitespace();
        char character;
        StringBuilder builder = new StringBuilder();

        while(!atEnd() && isDigit(peek()) || peek() == '-'){
            character = advance();
            builder.append(character);
        }

        return Integer.parseInt(builder.toString());
    }

    /**
     * Parse double double.
     *
     * @return the double
     */
    public static double parseDouble(){
        skipWhitespace();
        char character;
        StringBuilder builder = new StringBuilder();

        while(!atEnd() && isDigit(peek()) || peek() == '-' || peek() == '.'){
            character = advance();
            builder.append(character);
        }

        return Double.parseDouble(builder.toString());
    }

    /**
     * Parse float float.
     *
     * @return the float
     */
    public static float parseFloat(){
        float value = (float)parseDouble();
        consume('f');
        return value;
    }

    /**
     * Parse string string.
     *
     * @return the string
     */
    public static String parseString(){
        skipWhitespace();
        char character;
        StringBuilder builder = new StringBuilder();

        consume('"');
        while(!atEnd() && peek() != '"'){
            character = advance();
            builder.append(character);
        }
        consume('"');
        return builder.toString();
    }

    /**
     * Parse boolean boolean.
     *
     * @return the boolean
     */
    public static boolean parseBoolean(){
        skipWhitespace();
        StringBuilder builder = new StringBuilder();

        if(!atEnd() && peek() == 't'){
            builder.append("true");
            consumeBoolean(true);
        }
        else if(!atEnd() && peek() == 'f'){
            builder.append("false");
            consumeBoolean(false);
        }
        else{
            System.out.println("Expecting 'true' or 'false'. Got '" + peek() + " at line: " + line);
            System.exit(-1);
        }

        return Boolean.parseBoolean(builder.toString());
    }

    private static boolean isDigit(char character){
        return character >= '0' && character <= '9';
    }

    /**
     * Consume begin object property.
     *
     * @param property the property
     */
    public static void consumeBeginObjectProperty(String property){
        consumeProperty(property);
        consume('{');
    }

    /**
     * Consume end object property.
     */
    public static void consumeEndObjectProperty(){
        skipWhitespace();
        consume('}');
    }

    /**
     * Consume string property string.
     *
     * @param property the property
     * @return the string
     */
    public static String consumeStringProperty(String property){
        consumeProperty(property);
        return parseString();
    }

    /**
     * Consume int property int.
     *
     * @param property the property
     * @return the int
     */
    public static int consumeIntProperty(String property){
        consumeProperty(property);
        return parseInt();
    }

    /**
     * Consume double property double.
     *
     * @param property the property
     * @return the double
     */
    public static double consumeDoubleProperty(String property){
        consumeProperty(property);
        return parseDouble();
    }

    /**
     * Consume float property float.
     *
     * @param property the property
     * @return the float
     */
    public static float consumeFloatProperty(String property){
        consumeProperty(property);
        return parseFloat();
    }

    /**
     * Consume boolean property boolean.
     *
     * @param property the property
     * @return the boolean
     */
    public static boolean consumeBooleanProperty(String property){
        consumeProperty(property);
        return parseBoolean();
    }

    private static void consumeProperty(String property){
        skipWhitespace();
        checkString(property);
        skipWhitespace();
        consume(':');
        skipWhitespace();
    }

    private static void checkString(String str){
        String parsed = Parser.parseString();
        if (parsed.compareTo(str) != 0){
            System.out.println("Expecting '" + str +"' got '" + parsed + "' at line: " + line);
            System.exit(-1);
        }
    }

    private static void consumeBoolean(boolean value){
        if(value){
            consume('t');
            consume('r');
            consume('u');
            consume('e');
        }
        else{
            consume('f');
            consume('a');
            consume('l');
            consume('s');
            consume('e');
        }
    }

    /**
     * Parse favorites favorites controller.
     *
     * @return the favorites controller
     */
    public static FavoritesController parseFavorites(){
        if(bytes.length == 0 || atEnd()) return null;

        if(peek() == ',') consume(',');
        skipWhitespace();
        if(atEnd()) return null;

        return new FavoritesController(FavoritesModel.deserialize());
    }

    /**
     * Parse gym model gym controller.
     *
     * @return the gym controller
     */
    public static GymController parseGymModel(){

        Parser.consumeBeginObjectProperty("GymModel");
        Parser.skipWhitespace();

        GymModel model = new GymModel();

        model.setTransform(Transform.deserialize());
        skipWhitespace();
        if(peek() == ',') consume(',');
        skipWhitespace();

        String path = Parser.consumeStringProperty("Texture");
        path = path.replaceAll(".*(/assets/.*)", "$1").substring(1);
        model.setTexture(path);
        if(peek() == ',') consume(',');
        skipWhitespace();

        PropertiesMenuModel propertiesMenuModel = PropertiesMenuModel.deserialize();
        if(peek() == ',') consume(',');
        skipWhitespace();
        model.setPropertiesMenu(new PropertiesMenuController(propertiesMenuModel));

        Parser.skipWhitespace();
        Parser.consumeEndObjectProperty();

        GymController controller = new GymController(model);
        model.getPropertiesMenu().setOwner(controller);

        return controller;
    }

    /**
     * Parse property property.
     *
     * @return the property
     */
    public static Property parseProperty(){
        Parser.consumeBeginObjectProperty("Property");
        Parser.skipWhitespace();

        Property property = new Property();

        property.setName(Parser.consumeStringProperty("Name"));
        if(Parser.peek() == ',') Parser.consume(',');
        Parser.skipWhitespace();

        // Converts location to enum value
        if(property.getName().equals("Location")){
            property.setValue(findPlace(Parser.consumeStringProperty("Value")));
        }
        else{
            property.setValue(Parser.consumeStringProperty("Value"));
        }

        if(Parser.peek() == ',') Parser.consume(',');
        Parser.skipWhitespace();

        Parser.consumeEndObjectProperty();

        return property;
    }

    private static Object findPlace(String value){
        for (Places place : Places.values()){
            if(place.getLabel().equals(value)){
                return place;
            }
        }
        return value;
    }
}