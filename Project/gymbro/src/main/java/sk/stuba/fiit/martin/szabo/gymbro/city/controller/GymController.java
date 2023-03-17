package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.GymModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.GymView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

public class GymController{

    private GymModel model;
    private GymView view;

    public GymController(){
        this.model = new GymModel();
        this.view = new GymView(this.model);
    }

    public GymController(GymModel model){
        this.model = model;
        this.view = new GymView(this.model);
    }

    public GymController(GymModel model, GymView view){
        this.model = model;
        this.view = view;
    }

    public void draw(){
        this.getView().draw();
    }


    //**** Getters ****//
    public double getHeight(){
        return this.getScale().getY();
    }
    public GymModel getModel(){
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
    public GymView getView(){
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


    //**** Setters ****//
    public void setHeight(double height){
        this.getScale().setY(height);
    }
    public void setModel(GymModel model){
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
    public void setView(GymView view){
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
