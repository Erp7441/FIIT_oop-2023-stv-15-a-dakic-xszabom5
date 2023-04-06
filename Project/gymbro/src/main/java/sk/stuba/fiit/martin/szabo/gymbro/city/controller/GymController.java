package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.GymModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.GymView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Renderable;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import static java.lang.System.*;

public class GymController implements Renderable{

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

    @Override
    public void draw(){
        this.getView().draw();
    }

    @Override
    public void update(){}

    /**
     * Adds event listener for handling mouse click
     */
    public void makeClickable(){
        if(this.getImageView() == null) return;
        this.getImageView().addEventHandler(MouseEvent.MOUSE_CLICKED, this::handleClick);
    }

    public void makeHoverable(){
        if(this.getImageView() == null) return;
        this.getImageView().addEventHandler(MouseEvent.MOUSE_ENTERED, this::handleStartHover);
        this.getImageView().addEventHandler(MouseEvent.MOUSE_EXITED, this::handleEndHover);
    }

    /**
     * Handles click event
     */
    private void handleClick(MouseEvent event){

        if(event.getButton().equals(MouseButton.PRIMARY)){
            // TODO:: show modal menu here
            this.getModel().getModalMenu().getModel().getProperties().forEach(out::println);
        }
        else if(event.getButton().equals(MouseButton.SECONDARY)){
            // TODO:: Show context menu here
            out.println("Test right click");
        }

    }

    private void handleStartHover(MouseEvent event){
        this.getView().zoomIn();
    }

    private void handleEndHover(MouseEvent event){
        this.getView().zoomOut();
    }
















































    //**** Getters ****//
    public double getHeight(){
        return this.getScale().getY();
    }
    public ImageView getImageView(){
        return this.getModel().getImageView();
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
    public void setImageView(ImageView view){
        this.getModel().setImageView(view);
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
