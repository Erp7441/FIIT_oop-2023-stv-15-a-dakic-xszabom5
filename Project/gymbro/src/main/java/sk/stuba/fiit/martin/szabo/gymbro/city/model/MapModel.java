package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;
import java.util.List;

public class MapModel extends Model implements Serialization{

    private ArrayList<GymController> gyms = new ArrayList<>();

    public MapModel(){}

    public MapModel(ArrayList<GymController> gyms, Transform transform, Image texture){
        super(transform, texture);
        this.gyms = gyms;
    }

    public MapModel(List<GymController> gyms, Transform transform, String texturePath){
        super(transform, texturePath);
        this.gyms = (ArrayList<GymController>) gyms;
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }

    public List<GymController> getGyms(){
        return gyms;
    }

    public void setGyms(ArrayList<GymController> gyms){
        this.gyms = gyms;
    }

}
