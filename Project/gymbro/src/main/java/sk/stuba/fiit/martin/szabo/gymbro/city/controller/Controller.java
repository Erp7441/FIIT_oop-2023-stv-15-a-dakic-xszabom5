/**
 * The Controller abstract class represents a base controller for game objects.
 */

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

    /**
     * Creates a new Controller object with the given model and view.
     * @param model the Model object to use
     * @param view the View object to use
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
     * Gets the height of the associated model.
     * @return the height of the model
     */
    public double getHeight(){
        return this.getScale().getY();
    }

    /**
     * Gets the ImageView of the associated model.
     * @return the ImageView object of the model
     */
    public ImageView getImageView(){
        return this.getModel().getImageView();
    }

    /**
     * Gets the associated model.
     * @return the Model object associated with this controller
     */
    public Model getModel(){
        return model;
    }

    /**
     * Gets the position of the associated model.
     * @return the position of the model
     */
    public Vector2D getPosition(){
        return this.getTransform().getPosition();
    }

    /**
     * Gets the rotation of the associated model.
     * @return the rotation of the model
     */
    public double getRotation(){
        return this.getTransform().getRotation();
    }

    /**
     * Gets the scale of the associated model.
     * @return the scale of the model
     */
    public Vector2D getScale(){
        return this.getTransform().getScale();
    }

    /**
     * Gets the texture of the associated model.
     * @return the texture of the model
     */
    public Image getTexture(){
        return this.getModel().getTexture();
    }

    /**
     * Gets the transform of the associated model.
     * @return the transform of the model
     */
    public Transform getTransform(){
        return this.getModel().getTransform();
    }

    /**
     * Gets the associated view.
     * @return the View object associated with this controller
     */
    public View getView(){
        return view;
    }

    /**
     * Gets the X coordinate of the associated model.
     * @return the X coordinate of the model
     */
    public double getX(){
        return this.getPosition().getX();
    }

    /**
     * Gets the Y coordinate of the associated model.
     * @return the Y coordinate of the model
     */
    public double getY(){
        return this.getPosition().getY();
    }

    /**
     * Gets the width of the associated model.
     * @return the width of the model
     */
    public double getWidth(){
        return this.getScale().getX();
    }

    /**
     * Sets the height of the associated model.
     * @param height the new height of the model
     */
    public void setHeight(double height){
        this.getScale().setY(height);
    }

    /**
     * Sets the ImageView of the associated model.
     * @param view the new ImageView object for the model
     */
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
