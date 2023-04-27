package com.gymbro.city.controller;

import com.gymbro.city.model.Model;
import com.gymbro.city.view.View;
import com.gymbro.utils.Transform;
import com.gymbro.utils.Vector2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * The type Controller.
 */
public abstract class Controller{

    private Model model;
    private View view;

    /**
     * Creates a new Controller object with the given model and view.
     *
     * @param model the Model object to use
     * @param view  the View object to use
     */
    protected Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    /**
     * Draws the associated view.
     */
    public void draw(){
        this.getView().draw();
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
     * Get image view image view.
     *
     * @return the image view
     */
    public ImageView getImageView(){
        return this.getModel().getImageView();
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
     * Get view view.
     *
     * @return the view
     */
    public View getView(){
        return view;
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
     * Set height.
     *
     * @param height the height
     */
    public void setHeight(double height){
        this.getScale().setY(height);
    }

    /**
     * Set image view.
     *
     * @param view the view
     */
    public void setImageView(ImageView view){
        this.getModel().setImageView(view);
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
     * Set view.
     *
     * @param view the view
     */
    public void setView(View view){
        this.view = view;
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
}
