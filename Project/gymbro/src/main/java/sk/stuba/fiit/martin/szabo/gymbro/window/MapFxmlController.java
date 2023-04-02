package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXML;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.GymBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.MapBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.TransformBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.MapController;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.util.ArrayList;

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

        for(GymController gym : this.getMap().getGyms()){
            gym.draw();
        }
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
        ArrayList<GymController> gyms = new ArrayList<>();
        gyms.add(
            new GymBuilder().
                addTransform(
                    new TransformBuilder().
                        addScale(new Vector2D(200, 76)).
                        addPosition(new Vector2D(100, 200)).
                        build()
                ).
                addTexture("assets/lifegym.png").
                build()
        );

        // Creating map
        this.setMap(
            new MapBuilder().
                addGyms(gyms).
                addTransform(new TransformBuilder().addScale(new Vector2D(window.getWidth(), window.getHeight())).build()).
                addTexture("assets/Bratislava_Map.png").
                build()
        );
    }
}
