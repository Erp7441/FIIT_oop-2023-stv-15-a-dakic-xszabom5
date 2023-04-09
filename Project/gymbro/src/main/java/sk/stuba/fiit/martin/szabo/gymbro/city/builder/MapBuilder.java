package sk.stuba.fiit.martin.szabo.gymbro.city.builder;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.MapController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.MapModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.MapView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;

public class MapBuilder{
    private MapController controller;
    private MapModel model;
    private MapView view;

    public MapBuilder(){
        this.model = new MapModel();
        this.view = new MapView(this.model);
        this.controller = new MapController(this.model, this.view);
    }

    public MapBuilder(MapModel model){
        this.model = model;
        this.view = new MapView(this.model);
        this.controller = new MapController(this.model, this.view);
    }
    public MapBuilder(MapModel model, MapView view, MapController controller){
        this.model = model;
        this.view = view;
        this.controller = controller;
    }

    public MapController build(){
        return this.getController();
    }

    public MapBuilder addController(MapController controller){
        if(controller != null && this.getController() == null){
            this.setController(controller);
        }
        return this;
    }

    public MapBuilder addModel(MapModel model){
        if(model == null) return this;

        if(this.getModel() == null && this.getController().getModel() == null){
            this.setModel(model);
            this.getController().setModel(model);
        }
        else if(
            this.getModel() == null &&
            this.getController().getModel() != null &&
            this.getController().getModel() instanceof MapModel
        ){
            this.setModel((MapModel) this.getController().getModel());
        }
        return this;
    }

    public MapBuilder addView(MapView view){
        if(view == null) return this;

        if(this.getView() == null && this.getController().getView() == null){
            this.setView(view);
            this.getController().setView(view);
        }
        else if(
            this.getView() == null &&
            this.getController().getView() != null &&
            this.getController().getView() instanceof MapView
        ){
            this.setView((MapView) this.getController().getView());
        }
        return this;
    }

    public MapBuilder addTransform(Transform transform){
        this.getModel().setTransform(transform);
        return this;
    }

    public MapBuilder addTexture(Image texture){
        this.getModel().setTexture(texture);
        return this;
    }

    public MapBuilder addTexture(String texturePath){
        this.getModel().setTexture(texturePath);
        return this;
    }

    public MapBuilder addGyms(ArrayList<GymController> gyms){
        this.getModel().setGyms(gyms);
        return this;
    }

    public MapController getController(){
        return controller;
    }
    public MapModel getModel(){
        return model;
    }
    public MapView getView(){
        return view;
    }

    private void setController(MapController controller){
        this.controller = controller;
    }
    private void setModel(MapModel model){
        this.model = model;
    }
    private void setView(MapView view){
        this.view = view;
    }

}
