package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.GymModel;
import sk.stuba.fiit.martin.szabo.gymbro.utils.ImageViewInitializer;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

public class GymView{

    private GymModel model;

    public GymView(){
        model = new GymModel();
    }

    public GymView(GymModel model){
        this.model = model;
    }

    public void draw(){

        // If we don't have image view to place in the screen we create it
        if(this.getModel().getImageView() == null){
            this.getModel().setImageView(new ImageViewInitializer().initialize(
                this.getTexture(),
                this.getTransform()
            ));
        }

        Stage stage = Window.getInstance().getStage();
        Parent parent = stage.getScene().getRoot();
        ((Pane) parent).getChildren().add(this.getModel().getImageView());
    }

    public void zoomIn(){
        this.getModel().getImageView().setFitWidth(this.getModel().getImageView().getFitWidth() * 2);
        this.getModel().getImageView().setFitHeight(this.getModel().getImageView().getFitHeight() * 2);
    }

    public void zoomOut(){
        this.getModel().getImageView().setFitWidth(this.getModel().getImageView().getFitWidth() / 2);
        this.getModel().getImageView().setFitHeight(this.getModel().getImageView().getFitHeight() / 2);
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
