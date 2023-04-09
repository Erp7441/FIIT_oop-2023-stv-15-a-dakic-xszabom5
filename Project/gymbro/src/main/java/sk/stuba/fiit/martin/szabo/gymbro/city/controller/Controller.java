package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.Model;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.View;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

public abstract class Controller{

    private Model model;
    private View view;

    protected Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void draw(){
        this.getView().draw();
    }

    public double getHeight(){
        return this.getScale().getY();
    }
    public ImageView getImageView(){
        return this.getModel().getImageView();
    }
    public Model getModel(){
        return model;
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
        return this.getModel().getTexture();
    }
    public Transform getTransform(){
        return this.getModel().getTransform();
    }
    public View getView(){
        return view;
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
        this.getModel().setImageView(view);
    }
    public void setModel(Model model){
        this.model = model;
    }
    public void setPosition(Vector2D position){
        this.getModel().setPosition(position);
    }
    public void setRotation(double rotation){
        this.getTransform().setRotation(rotation);
    }
    public void setScale(Vector2D scale){
        this.getTransform().setScale(scale);
    }
    public void setTexture(Image texture){
        this.getModel().setTexture(texture);
    }
    public void setTexture(String texturePath){
        this.getModel().setTexture(texturePath);
    }
    public void setTransform(Transform transform){
        this.getModel().setTransform(transform);
    }
    public void setView(View view){
        this.view = view;
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
