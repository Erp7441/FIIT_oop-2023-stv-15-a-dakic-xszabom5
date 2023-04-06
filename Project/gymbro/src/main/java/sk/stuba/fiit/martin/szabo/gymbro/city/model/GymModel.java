package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.ModalMenuController;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.ImageViewInitializer;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.io.FileInputStream;

public class GymModel extends Serialization{
    private Transform transform = new Transform();
    private Image texture = null;
    private int amountOfEquipment;
    private ModalMenuController menu = null;
    private ImageView imageView = null;

    public GymModel(){}

    public GymModel(Transform transform, int amountOfEquipment, Image texture){
        this.transform = transform;
        this.amountOfEquipment = amountOfEquipment;
        this.setTexture(texture);
    }

    public GymModel(Transform transform, int amountOfEquipment, String texturePath){
        this.transform = transform;
        this.amountOfEquipment = amountOfEquipment;
        this.setTexture(texturePath);
    }

    // TODO:: Move to controller
    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }



































    //**** Getters ****//
    public int getAmountOfEquipment(){
        return amountOfEquipment;
    }
    public double getHeight(){
        return this.getScale().getY();
    }
    public ModalMenuController getModalMenu(){
        return menu;
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
    public void setAmountOfEquipment(int amountOfEquipment){
        this.amountOfEquipment = amountOfEquipment;
    }
    public void setHeight(double height){
        this.getScale().setY(height);
    }
    public void setModalMenu(ModalMenuController menu){
        this.menu = menu;
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


    public ImageView getImageView(){
        return imageView;
    }

    public void setImageView(ImageView view){
        this.imageView = view;
    }
}
