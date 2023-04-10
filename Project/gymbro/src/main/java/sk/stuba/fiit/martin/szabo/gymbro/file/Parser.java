package sk.stuba.fiit.martin.szabo.gymbro.file;

import sk.stuba.fiit.martin.szabo.gymbro.city.builder.FavoritesBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.FavoritesController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.PropertiesMenuController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.FavoritesModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.GymModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.PropertiesMenuModel;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Places;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


public class Parser{
    private static int offset = 0;
    private static int line = 1;
    private static byte[] bytes;

    public static byte[] getBytes(){
        return bytes;
    }

    private Parser() {}

    public static void openFile(String fileName){
        // Checks if file exists. If it does then get its length.
        File temp = new File(fileName + ".zip");
        if(!temp.exists()){ return; }

        try {
            ZipFile zip = new ZipFile(fileName + ".zip");
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
        catch(IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static byte[] readAllBytes(InputStream stream) throws IOException{
        byte[] buffer = new byte[1000];
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int tempByte;
        while((tempByte = stream.read(buffer)) != -1){
            bos.write(buffer, 0, tempByte);
        }
        return bos.toByteArray();
    }

    public static void skipWhitespace(){
        while(!atEnd() && (peek() == ' ' || peek() == '\n' || peek() == '\t' || peek() == '\r')){
            if(peek() == '\n') { line++; }
            advance();
        }
    }

    public static char peek() {
        return (char)bytes[offset];
    }

    public static char advance(){
        char current = peek();
        offset++;
        return current;
    }

    public static void consume(char character){
        char current = peek();
        if(current != character){
            System.out.println("Expecting '" + character + "' but got '" + current + "' at line: " + line);
            System.exit(-1);
        }
        offset++;
    }

    public static boolean atEnd(){
        return offset == (bytes.length)-1;
    }

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

    public static float parseFloat(){
        float value = (float)parseDouble();
        consume('f');
        return value;
    }

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

    public static void consumeBeginObjectProperty(String property){
        consumeProperty(property);
        consume('{');
    }
    public static void consumeEndObjectProperty(){
        skipWhitespace();
        consume('}');
    }
    public static String consumeStringProperty(String property){
        consumeProperty(property);
        return parseString();
    }
    public static int consumeIntProperty(String property){
        consumeProperty(property);
        return parseInt();
    }
    public static double consumeDoubleProperty(String property){
        consumeProperty(property);
        return parseDouble();
    }
    public static float consumeFloatProperty(String property){
        consumeProperty(property);
        return parseFloat();
    }

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

    public static FavoritesController parseFavorites(){
        if(bytes.length == 0 || atEnd()) return null;

        if(peek() == ',') consume(',');
        skipWhitespace();
        if(atEnd()) return null;

        return new FavoritesController(FavoritesModel.deserialize());
    }

    public static GymController parseGymModel(){

        Parser.consumeBeginObjectProperty("GymModel");
        Parser.skipWhitespace();

        GymModel model = new GymModel();

        model.setTransform(Transform.deserialize());
        skipWhitespace();
        if(peek() == ',') consume(',');
        skipWhitespace();

        model.setAmountOfEquipment(Parser.consumeIntProperty("AmountOfEquipment"));
        if(peek() == ',') consume(',');
        skipWhitespace();

        model.setTexture(Parser.consumeStringProperty("Texture"));
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