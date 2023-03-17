package sk.stuba.fiit.martin.szabo.gymbro.city.builder;

import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

public class TransformBuilder{
    private Transform transform;

    public TransformBuilder(){
        this.transform = new Transform();
    }

    public TransformBuilder(Vector2D position){
        this.transform = new Transform(position);
    }

    public TransformBuilder(Vector2D position, double rotation, Vector2D scale){
        this.transform = new Transform(position, rotation, scale);
    }

    public TransformBuilder(Transform transform){
        this.transform = transform;
    }

    public Transform build(){ return this.getTransform(); }

    public TransformBuilder addPosition(Vector2D position){
        this.getTransform().setPosition(position);
        return this;
    }

    public TransformBuilder addRotation(double rotation){
        this.getTransform().setRotation(rotation);
        return this;
    }

    public TransformBuilder addScale(Vector2D scale){
        this.getTransform().setScale(scale);
        return this;
    }

    public TransformBuilder addPositionX(double x){
        if(this.getTransform() != null){
            this.getTransform().getPosition().setX(x);
        }
        return this;
    }

    public TransformBuilder addPositionY(double y){
        if(this.getTransform() != null){
            this.getTransform().getPosition().setY(y);
        }
        return this;
    }

    public TransformBuilder addScaleX(double x){
        if(this.getTransform() != null){
            this.getTransform().getScale().setX(x);
        }
        return this;
    }

    public TransformBuilder addScaleY(double y){
        if(this.getTransform() != null){
            this.getTransform().getScale().setY(y);
        }
        return this;
    }

    public Transform getTransform(){
        return transform;
    }

    public void setTransform(Transform transform){
        this.transform = transform;
    }
}
