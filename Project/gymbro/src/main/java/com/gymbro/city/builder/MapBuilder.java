package com.gymbro.city.builder;

import javafx.scene.image.Image;
import com.gymbro.city.controller.Controller;
import com.gymbro.city.controller.GymController;
import com.gymbro.city.controller.MapController;
import com.gymbro.city.model.MapModel;
import com.gymbro.city.model.Model;
import com.gymbro.city.view.MapView;
import com.gymbro.city.view.View;
import com.gymbro.utils.Transform;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Map builder.
 */
public class MapBuilder extends BuilderMVC{

    /**
     * Instantiates a new Map builder.
     */
    public MapBuilder(){
        super(new MapModel(), null, null);
        this.setView(new MapView(this.getModel()));
        this.setController(new MapController(this.getModel(), this.getView()));
    }

    /**
     * Instantiates a new Map builder.
     *
     * @param model the model
     */
    public MapBuilder(MapModel model){
        super(model, new MapView(model), null);
        this.setController(new MapController(this.getModel(), this.getView()));
    }

    /**
     * Add gyms map builder.
     *
     * @param gyms the gyms
     * @return the map builder
     */
    public MapBuilder addGyms(List<GymController> gyms){
        if(gyms instanceof ArrayList){
            this.getModel().setGyms((ArrayList<GymController>) gyms);
        }
        return this;
    }

    //* Mandatory casting overrides
    @Override
    public MapController build(){
        return (MapController) super.build();
    }

    @Override
    public MapBuilder addController(Controller controller){
        if(controller instanceof MapController){
            return (MapBuilder) super.addController(controller);
        }
        return this;
    }

    @Override
    public MapBuilder addModel(Model model){
        if(model instanceof MapModel){
            return (MapBuilder) super.addModel(model);
        }
        return this;
    }

    @Override
    public MapBuilder addView(View view){
        if(view instanceof MapView){
            return (MapBuilder) super.addView(view);
        }
        return this;
    }

    @Override
    public MapBuilder addTransform(Transform transform){
        return (MapBuilder) super.addTransform(transform);
    }

    @Override
    public MapBuilder addTexture(Image texture){
        return (MapBuilder) super.addTexture(texture);
    }

    @Override
    public MapBuilder addTexture(String texturePath){
        return (MapBuilder) super.addTexture(texturePath);
    }

    @Override
    public MapController getController(){
        return (MapController) super.getController();
    }

    @Override
    public MapModel getModel(){
        return (MapModel) super.getModel();
    }

    @Override
    public MapView getView(){
        return (MapView) super.getView();
    }
}
