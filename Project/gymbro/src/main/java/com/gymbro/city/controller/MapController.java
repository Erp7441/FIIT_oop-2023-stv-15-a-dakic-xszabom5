package com.gymbro.city.controller;

import com.gymbro.city.model.MapModel;
import com.gymbro.city.view.MapView;
import com.gymbro.utils.Vector2D;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Map controller.
 */
public class MapController extends Controller{

    /**
     * Instantiates a new Map controller.
     *
     * @param model the model
     * @param view  the view
     */
    public MapController(MapModel model, MapView view){
        super(model, view);
    }

    @Override
    public void draw(){
        this.getView().draw();
        for(GymController gym : this.getGyms()){
            gym.draw();
        }
    }

    /**
     * Calculate path.
     *
     * @param gym             the gym
     * @param currentVector2D the current vector 2 d
     */
    public void calculatePath(GymController gym, Vector2D currentVector2D){

    }

    /**
     * Get gyms list.
     *
     * @return the list
     */
    public List<GymController> getGyms(){
        if(this.getModel() instanceof MapModel){
            return ((MapModel) this.getModel()).getGyms();
        } else return null;
    }

    /**
     * Set gyms.
     *
     * @param gyms the gyms
     */
    public void setGyms(List<GymController> gyms){
        if(this.getModel() instanceof MapModel){
            ((MapModel) this.getModel()).setGyms((ArrayList<GymController>) gyms);
        }
    }
}
