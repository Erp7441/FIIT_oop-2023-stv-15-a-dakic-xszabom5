package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.MapModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.MapView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.util.ArrayList;
import java.util.List;

public class MapController extends Controller{

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

    public void calculatePath(GymController gym, Vector2D currentVector2D){

    }

    public List<GymController> getGyms(){
        if(this.getModel() instanceof MapModel){
            return ((MapModel) this.getModel()).getGyms();
        } else return null;
    }

    public void setGyms(List<GymController> gyms){
        if(this.getModel() instanceof MapModel){
            ((MapModel) this.getModel()).setGyms((ArrayList<GymController>) gyms);
        }
    }
}
