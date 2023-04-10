package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
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

    public ArrayList<GymController> getFavorites(){
        return favorites;
    }

    public void setFavorites(ArrayList<GymController> favorites){
        this.favorites = favorites;
    }
}
