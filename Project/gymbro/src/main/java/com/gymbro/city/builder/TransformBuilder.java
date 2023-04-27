package com.gymbro.city.builder;

import com.gymbro.utils.Transform;
import com.gymbro.utils.Vector2D;

/**
 * The type Transform builder.
 */
public class TransformBuilder{
    private Transform transform;

    /**
     * Instantiates a new Transform builder.
     */
    public TransformBuilder(){
        this.transform = new Transform();
    }

    /**
     * Instantiates a new Transform builder.
     *
     * @param position the position
     */
    public TransformBuilder(Vector2D position){
        this.transform = new Transform(position);
    }

    /**
     * Instantiates a new Transform builder.
     *
     * @param position the position
     * @param rotation the rotation
     * @param scale    the scale
     */
    public TransformBuilder(Vector2D position, double rotation, Vector2D scale){
        this.transform = new Transform(position, rotation, scale);
    }

    /**
     * Instantiates a new Transform builder.
     *
     * @param transform the transform
     */
    public TransformBuilder(Transform transform){
        this.transform = transform;
    }

    /**
     * Build transform.
     *
     * @return the transform
     */
    public Transform build(){ return this.getTransform(); }

    /**
     * Add position transform builder.
     *
     * @param position the position
     * @return the transform builder
     */
    public TransformBuilder addPosition(Vector2D position){
        this.getTransform().setPosition(position);
        return this;
    }

    /**
     * Add rotation transform builder.
     *
     * @param rotation the rotation
     * @return the transform builder
     */
    public TransformBuilder addRotation(double rotation){
        this.getTransform().setRotation(rotation);
        return this;
    }

    /**
     * Add scale transform builder.
     *
     * @param scale the scale
     * @return the transform builder
     */
    public TransformBuilder addScale(Vector2D scale){
        this.getTransform().setScale(scale);
        return this;
    }

    /**
     * Add position x transform builder.
     *
     * @param x the x
     * @return the transform builder
     */
    public TransformBuilder addPositionX(double x){
        if(this.getTransform() != null){
            this.getTransform().getPosition().setX(x);
        }
        return this;
    }

    /**
     * Add position y transform builder.
     *
     * @param y the y
     * @return the transform builder
     */
    public TransformBuilder addPositionY(double y){
        if(this.getTransform() != null){
            this.getTransform().getPosition().setY(y);
        }
        return this;
    }

    /**
     * Add scale x transform builder.
     *
     * @param x the x
     * @return the transform builder
     */
    public TransformBuilder addScaleX(double x){
        if(this.getTransform() != null){
            this.getTransform().getScale().setX(x);
        }
        return this;
    }

    /**
     * Add scale y transform builder.
     *
     * @param y the y
     * @return the transform builder
     */
    public TransformBuilder addScaleY(double y){
        if(this.getTransform() != null){
            this.getTransform().getScale().setY(y);
        }
        return this;
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
     * Set transform.
     *
     * @param transform the transform
     */
    public void setTransform(Transform transform){
        this.transform = transform;
    }
}
