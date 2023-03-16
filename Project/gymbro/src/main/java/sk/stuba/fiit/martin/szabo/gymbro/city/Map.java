package sk.stuba.fiit.martin.szabo.gymbro.city;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Map extends Serialization{
    private ArrayList<Gym> gyms = new ArrayList<>();
    private Transform transform = new Transform();
    private Image texture = null;

    public Map(){}

    public Map(List<Gym> gyms, Transform transform, String texturePath){
        this.gyms = (ArrayList<Gym>) gyms;
        this.transform = transform;

        try{
            this.texture = new Image(new FileInputStream(texturePath));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void calculatePath(Gym gym, Vector2D currentVector2D){

    }

    public void draw(Stage stage){
        ImageView view = new ImageView(this.getTexture());

        view.setX(this.getTransform().getPosition().getX());
        view.setY(this.getTransform().getPosition().getY());
        view.setFitWidth(this.getTransform().getScale().getX());
        view.setFitHeight(this.getTransform().getScale().getY());
        view.setPreserveRatio(false);

        Group root = new Group(view);
        Scene scene = new Scene(root, this.getTransform().getScale().getX(), this.getTransform().getScale().getY());
        stage.setScene(scene);
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

    public void setTexture(String texturePath){
        try{
            this.texture = new Image(new FileInputStream(texturePath));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }
}
