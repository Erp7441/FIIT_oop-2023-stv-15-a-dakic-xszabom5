package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.Model;
import sk.stuba.fiit.martin.szabo.gymbro.utils.ImageViewInitializer;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

public abstract class View{

    Model model = null;

    public View(Model model){
        this.model = model;
    }

    public void draw(){

        // If we don't have image view to place in the screen we create it
        if(this.getImageView() == null && this.getTexture() != null){
            this.setImageView(new ImageViewInitializer().initialize(
                    this.getTexture(),
                    this.getTransform()
            ));
        }
        else if(this.getImageView() == null && this.getTexture() == null) return;

        Parent parent = Window.getInstance().getSceneManager().getScene().getRoot();
        if(parent instanceof Pane){
            ((Pane) parent).getChildren().add(this.getImageView());
        }
    }

    public double getHeight(){
        return this.getScale().getY();
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
    public double getX(){
        return this.getPosition().getX();
    }
    public double getY(){
        return this.getPosition().getY();
    }
    public double getWidth(){
        return this.getScale().getX();
    }
    public ImageView getImageView() { return this.getModel().getImageView(); }


    public void setHeight(double height){
        this.getScale().setY(height);
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
    public void setX(double x){
        this.getPosition().setX(x);
    }
    public void setY(double y){
        this.getPosition().setY(y);
    }
    public void setWidth(double width){
        this.getScale().setX(width);
    }
    public void setImageView(ImageView view){ this.getModel().setImageView(view); }
}
