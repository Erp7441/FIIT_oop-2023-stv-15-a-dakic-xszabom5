package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sk.stuba.fiit.martin.szabo.gymbro.handlers.ImageViewHandler;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.io.FileInputStream;

public abstract class Model{
    ImageView imageView = null;
    Transform transform = new Transform();
    Image texture = null;

    protected Model(){}

    protected Model(Transform transform, Image texture){
        this.transform = transform;
        this.setTexture(texture);
    }

    protected Model(Transform transform, String texturePath){
        this.transform = transform;
        this.setTexture(texturePath);
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

    public void setHeight(double height){
        this.getScale().setY(height);
    }
    public void setImageView(ImageView view){
        this.imageView = view;
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
        this.setImageView(new ImageViewHandler().initialize(
                this.getTexture(),
                this.getTransform()
        ));
    }
    public void setTexture(String texturePath){
        try{
            this.texture = new Image(new FileInputStream(texturePath));

            this.setImageView(new ImageViewHandler().initialize(
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
