package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.MapModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.MapView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.util.ArrayList;
import java.util.List;

public class MapController{

    private MapModel model = null;
    private MapView view = null;

    public MapController(){
        this.model = new MapModel();
        this.view = new MapView(this.model);
    }

    public MapController(MapModel model){
        this.model = model;
        this.view = new MapView(this.model);
    }

    public MapController(MapModel model, MapView view){
        this.model = model;
        this.view = view;
    }

    public void draw(){
        this.getView().draw();
        for(GymController gym: this.getGyms()){
            gym.draw();
        }
    }


    public void calculatePath(GymController gym, Vector2D currentVector2D){

    }


    //**** Getters ****//
    public List<GymController> getGyms(){
        return this.getModel().getGyms();
    }
    public double getHeight(){
        return this.getScale().getY();
    }
    public MapModel getModel(){
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
    public MapView getView(){
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
    public void setGyms(List<GymController> gyms){
        this.getModel().setGyms((ArrayList<GymController>) gyms);
    }
    public void setHeight(double height){
        this.getScale().setY(height);
    }
    public void setModel(MapModel model){
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
    public void setView(MapView view){
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
