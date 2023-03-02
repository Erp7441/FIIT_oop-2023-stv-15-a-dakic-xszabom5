package sk.stuba.fiit.martin.szabo.gymbro.city;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.util.ArrayList;

public class Map extends Serialization{
    private ArrayList<Gym> gyms = new ArrayList<>();
    private Transform transform = new Transform();
    private Image texture = null;

    public Map(){}

    public Map(ArrayList<Gym> gyms, Transform transform, String texturePath){
        this.gyms = gyms;
        this.transform = transform;
        this.texture = new Image(texturePath);
    }

    public void calculatePath(Gym gym, Vector2D currentVector2D){

    }

    public void draw(){

    }

    public void addGym(Gym gym){
        this.getGyms().add(gym);
    }

    public void removeGym(Gym gym){
        this.getGyms().remove(gym);
    }

    public ArrayList<Gym> getGyms(){
        return gyms;
    }

    public void setGyms(ArrayList<Gym> gyms){
        this.gyms = gyms;
    }

    public Transform getTransform(){
        return transform;
    }

    public void setTransform(Transform transform){
        this.transform = transform;
    }

    public Image getTexture(){
        return texture;
    }

    public void setTexture(Image texture){
        this.texture = texture;
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }
}
