package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.file.Parser;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;

/**
 * The type Favorites model.
 */
public class FavoritesModel extends Model{
    private ArrayList<GymController> favorites;

    /**
     * Instantiates a new Favorites model.
     */
    public FavoritesModel(){
        this.favorites = new ArrayList<>();
    }

    /**
     * Instantiates a new Favorites model.
     *
     * @param transform the transform
     * @param texture   the texture
     */
    public FavoritesModel(Transform transform, Image texture){
        super(transform, texture);
        this.favorites = new ArrayList<>();
    }

    /**
     * Instantiates a new Favorites model.
     *
     * @param transform   the transform
     * @param texturePath the texture path
     */
    public FavoritesModel(Transform transform, String texturePath){
        super(transform, texturePath);
        this.favorites = new ArrayList<>();
    }

    /**
     * Instantiates a new Favorites model.
     *
     * @param transform the transform
     * @param texture   the texture
     * @param favorites the favorites
     */
    public FavoritesModel(Transform transform, Image texture, ArrayList<GymController> favorites){
        super(transform, texture);
        this.favorites = favorites;
    }

    /**
     * Instantiates a new Favorites model.
     *
     * @param transform   the transform
     * @param texturePath the texture path
     * @param favorites   the favorites
     */
    public FavoritesModel(Transform transform, String texturePath, ArrayList<GymController> favorites){
        super(transform, texturePath);
        this.favorites = favorites;
    }

    @Override
    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();

        builder.append(beginObjectProperty("FavoritesModel", tabSize));

        int count = 0;
        for(GymController gym : this.getFavorites()){
            builder.append(gym.getModel().serialize(tabSize + 1));
            builder.append(addEnding(true, count != this.getFavorites().size() - 1));
            count++;
        }

        builder.append(endObjectProperty(tabSize));
        return builder.toString();
    }

    /**
     * Deserialize favorites model.
     *
     * @return the favorites model
     */
    public static FavoritesModel deserialize(){
        Parser.consumeBeginObjectProperty("FavoritesModel");
        Parser.skipWhitespace();

        FavoritesModel model = new FavoritesModel();

        if(Parser.peek() == '"'){
            model.getFavorites().add(Parser.parseGymModel());
            while(Parser.peek() == ','){
                Parser.consume(',');
                Parser.skipWhitespace();
                model.getFavorites().add(Parser.parseGymModel());
            }
            Parser.skipWhitespace();
        }
        Parser.consumeEndObjectProperty();

        return model;
    }

    /**
     * Get favorites array list.
     *
     * @return the array list
     */
    public ArrayList<GymController> getFavorites(){
        return favorites;
    }

    /**
     * Set favorites.
     *
     * @param favorites the favorites
     */
    public void setFavorites(ArrayList<GymController> favorites){
        this.favorites = favorites;
    }
}
