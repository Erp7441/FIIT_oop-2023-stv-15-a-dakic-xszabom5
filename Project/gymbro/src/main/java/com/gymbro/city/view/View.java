package com.gymbro.city.view;

import com.gymbro.city.model.Model;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import com.gymbro.handlers.ImageViewHandler;
import com.gymbro.utils.Transform;
import com.gymbro.utils.Vector2D;
import com.gymbro.window.Window;

/**
 * The type View.
 */
public abstract class View{

    /**
     * The Model.
     */
    Model model = null;

    /**
     * Instantiates a new View.
     *
     * @param model the model
     */
    public View(Model model){
        this.model = model;
    }

    /**
     * Draw.
     */
    public void draw(){

        // If we don't have image view to place in the screen we create it
        if(this.getImageView() == null && this.getTexture() != null){
            this.setImageView(new ImageViewHandler().initialize(
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

    /**
     * Get height double.
     *
     * @return the double
     */
    public double getHeight(){
        return this.getScale().getY();
    }

    /**
     * Get model model.
     *
     * @return the model
     */
    public Model getModel(){
        return model;
    }

    /**
     * Get position vector 2 d.
     *
     * @return the vector 2 d
     */
    public Vector2D getPosition(){
        return this.getTransform().getPosition();
    }

    /**
     * Get rotation double.
     *
     * @return the double
     */
    public double getRotation(){
        return this.getTransform().getRotation();
    }

    /**
     * Get scale vector 2 d.
     *
     * @return the vector 2 d
     */
    public Vector2D getScale(){
        return this.getTransform().getScale();
    }

    /**
     * Get texture image.
     *
     * @return the image
     */
    public Image getTexture(){
        return this.getModel().getTexture();
    }

    /**
     * Get transform transform.
     *
     * @return the transform
     */
    public Transform getTransform(){
        return this.getModel().getTransform();
    }

    /**
     * Get x double.
     *
     * @return the double
     */
    public double getX(){
        return this.getPosition().getX();
    }

    /**
     * Get y double.
     *
     * @return the double
     */
    public double getY(){
        return this.getPosition().getY();
    }

    /**
     * Get width double.
     *
     * @return the double
     */
    public double getWidth(){
        return this.getScale().getX();
    }

    /**
     * Gets image view.
     *
     * @return the image view
     */
    public ImageView getImageView() { return this.getModel().getImageView(); }


    /**
     * Set height.
     *
     * @param height the height
     */
    public void setHeight(double height){
        this.getScale().setY(height);
    }

    /**
     * Set model.
     *
     * @param model the model
     */
    public void setModel(Model model){
        this.model = model;
    }

    /**
     * Set position.
     *
     * @param position the position
     */
    public void setPosition(Vector2D position){
        this.getModel().setPosition(position);
    }

    /**
     * Set rotation.
     *
     * @param rotation the rotation
     */
    public void setRotation(double rotation){
        this.getTransform().setRotation(rotation);
    }

    /**
     * Set scale.
     *
     * @param scale the scale
     */
    public void setScale(Vector2D scale){
        this.getTransform().setScale(scale);
    }

    /**
     * Set texture.
     *
     * @param texture the texture
     */
    public void setTexture(Image texture){
        this.getModel().setTexture(texture);
    }

    /**
     * Set texture.
     *
     * @param texturePath the texture path
     */
    public void setTexture(String texturePath){
        this.getModel().setTexture(texturePath);
    }

    /**
     * Set transform.
     *
     * @param transform the transform
     */
    public void setTransform(Transform transform){
        this.getModel().setTransform(transform);
    }

    /**
     * Set x.
     *
     * @param x the x
     */
    public void setX(double x){
        this.getPosition().setX(x);
    }

    /**
     * Set y.
     *
     * @param y the y
     */
    public void setY(double y){
        this.getPosition().setY(y);
    }

    /**
     * Set width.
     *
     * @param width the width
     */
    public void setWidth(double width){
        this.getScale().setX(width);
    }

    /**
     * Set image view.
     *
     * @param view the view
     */
    public void setImageView(ImageView view){ this.getModel().setImageView(view); }
}
