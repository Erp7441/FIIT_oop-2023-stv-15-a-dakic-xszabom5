package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.file.Parser;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;

public class FavoritesModel extends Model{
    private ArrayList<GymController> favorites;

    public FavoritesModel(){
        this.favorites = new ArrayList<>();
    }

    public FavoritesModel(Transform transform, Image texture){
        super(transform, texture);
        this.favorites = new ArrayList<>();
    }

    public FavoritesModel(Transform transform, String texturePath){
        super(transform, texturePath);
        this.favorites = new ArrayList<>();
    }

    public FavoritesModel(Transform transform, Image texture, ArrayList<GymController> favorites){
        super(transform, texture);
        this.favorites = favorites;
    }

    public FavoritesModel(Transform transform, String texturePath, ArrayList<GymController> favorites){
        super(transform, texturePath);
        this.favorites = favorites;
    }

    @Override
    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();

        builder.append(beginObjectProperty("FavoritesModel", tabSize + 1));
        builder.append(addEnding(true, true));

        int count = 0;
        for(GymController gym : this.getFavorites()){
            String str = gym.getModel().serialize(tabSize + 2);
            if(str.compareTo("") != 0){
                builder.append(str);
                builder.append(addEnding(true, count != this.getFavorites().size() - 1));
            }
            count++;
        }

        return null;
    }

    public static FavoritesModel deserialize(){
        Parser.consumeBeginObjectProperty("FavoritesModel");

        FavoritesModel model = new FavoritesModel();

        if(Parser.peek() == ','){
            Parser.consume(',');
            Parser.consumeBeginObjectProperty("Gym model");
            model.getFavorites().add(Parser.parseGymModel());

            while(Parser.peek() == ','){
                Parser.consume(',');
                model.getFavorites().add(Parser.parseGymModel());
            }
            Parser.consumeEndObjectProperty();
        }

        Parser.consumeEndObjectProperty();
        return model;
    }

    public ArrayList<GymController> getFavorites(){
        return favorites;
    }

    public void setFavorites(ArrayList<GymController> favorites){
        this.favorites = favorites;
    }
}
