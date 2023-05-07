package com.gymbro.city.model;

import com.gymbro.Main;
import com.gymbro.file.Serialization;
import com.gymbro.handlers.ImageViewHandler;
import com.gymbro.utils.Transform;
import com.gymbro.utils.Vector2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

/**
 * The type Model.
 */
public abstract class Model implements Serialization{
    /**
     * The Image view.
     */
    ImageView imageView = null;
    /**
     * The Transform.
     */
    Transform transform = new Transform();
    /**
     * The Texture.
     */
    Image texture = null;

    /**
     * Instantiates a new Model.
     */
    protected Model(){}

    /**
     * Instantiates a new Model.
     *
     * @param transform the transform
     * @param texture   the texture
     */
    protected Model(Transform transform, Image texture){
        this.transform = transform;
        this.setTexture(texture);
    }

    /**
     * Instantiates a new Model.
     *
     * @param transform   the transform
     * @param texturePath the texture path
     */
    protected Model(Transform transform, String texturePath){
        this.transform = transform;
        this.setTexture(texturePath);
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
        return imageView;
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
        return texture;
    }

    /**
     * Get transform transform.
     *
     * @return the transform
     */
    public Transform getTransform(){
        return transform;
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
        this.imageView = view;
    }

    /**
     * Set position.
     *
     * @param position the position
     */
    public void setPosition(Vector2D position){
        this.getTransform().setPosition(position);
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
        this.texture = texture;
        this.setImageView(new ImageViewHandler().initialize(
                this.getTexture(),
                this.getTransform()
        ));
    }

    /**
     * Set texture.
     *
     * @param resource the texture path
     */
    public void setTexture(String resource){
        try{
            String path = Objects.requireNonNull(Main.class.getResource(resource)).toExternalForm();
            this.texture = new Image(path);


            this.setImageView(new ImageViewHandler().initialize(
                this.getTexture(),
                this.getTransform()
            ));
        }
        catch(Exception e){
            //e.printStackTrace();
        }
    }

    /**
     * Set transform.
     *
     * @param transform the transform
     */
    public void setTransform(Transform transform){
        this.transform = transform;
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
