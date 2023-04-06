package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.ImageViewInitializer;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class MapModel extends Serialization{

    private ArrayList<GymController> gyms = new ArrayList<>();
    private Transform transform = new Transform();
    private Image texture = null;
    private ImageView imageView = null;

    public MapModel(){}

    public MapModel(ArrayList<GymController> gyms, Transform transform, Image texture){
        this.gyms = gyms;
        this.transform = transform;
        this.setTexture(texture);
    }

    public MapModel(List<GymController> gyms, Transform transform, String texturePath){
        this.gyms = (ArrayList<GymController>) gyms;
        this.transform = transform;
        this.setTexture(texturePath);
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }































    //**** Getters ****//
    public List<GymController> getGyms(){
        return gyms;
    }
    public double getHeight(){
        return this.getScale().getY();
    }
    public ImageView getImageView(){
        return imageView;
    }
    public Vector2D getPosition(){
        return this.getTransform().getPosition();
    }
    public double getRotation(){
        return this.getTransform().getRotation();
    }
    public Vector2D getScale(){
        return this.getTransform().getScale();
    }
    public Image getTexture(){
        return texture;
    }
    public Transform getTransform(){
        return transform;
    }
    public double getX(){
        return this.getPosition().getX();
    }
    public double getY(){
        return this.getPosition().getY();
    }
    public double getWidth(){
        return this.getScale().getX();
    }


    //**** Setters ****//
    public void setGyms(ArrayList<GymController> gyms){
        this.gyms = gyms;
    }
    public void setHeight(double height){
        this.getScale().setY(height);
    }
    public void setImageView(ImageView imageView){
        this.imageView = imageView;
    }
    public void setPosition(Vector2D position){
        this.getTransform().setPosition(position);
    }
    public void setRotation(double rotation){
        this.getTransform().setRotation(rotation);
    }
    public void setScale(Vector2D scale){
        this.getTransform().setScale(scale);
    }
    public void setTexture(Image texture){
        this.texture = texture;
        this.setImageView(new ImageViewInitializer().initialize(
                this.getTexture(),
                this.getTransform()
        ));
    }
    public void setTexture(String texturePath){
        try{
            this.texture = new Image(new FileInputStream(texturePath));

            this.setImageView(new ImageViewInitializer().initialize(
                this.getTexture(),
                this.getTransform()
            ));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void setTransform(Transform transform){
        this.transform = transform;
    }
    public void setX(double x){
        this.getPosition().setX(x);
    }
    public void setY(double y){
        this.getPosition().setY(y);
    }
    public void setWidth(double width){
        this.getScale().setX(width);
    }

}
