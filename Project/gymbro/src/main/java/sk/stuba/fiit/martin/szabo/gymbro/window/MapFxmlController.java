package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXML;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.MapBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.TransformBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.MapController;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

public class MapFxmlController{

    private MapController map = null;

    public MapFxmlController(){
    }

    public MapFxmlController(MapController map){
        this.map = map;
    }

    @FXML
    public void showMap(){
        if(this.getMap() == null) initializeMap();
        this.getMap().draw();
    }

    public MapController getMap(){
        return map;
    }

    public void setMap(MapController map){
        this.map = map;
    }

    public void initializeMap(){
        Window window = Window.getInstance();

        // TODO:: Create Gyms here

        // Creating map
        this.setMap(
            new MapBuilder().
                addGyms(null).
                addTransform(new TransformBuilder().addScale(new Vector2D(window.getWidth(), window.getHeight())).build()).
                addTexture("assets/Bratislava_Map.png").
                build()
        );
    }
}
