package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.city.Map;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

public class MapController{

    private Map map = null;

    public MapController(){
    }

    public MapController(Map map){
        this.map = map;
    }

    @FXML
    public void showMap(){
        if(this.getMap() == null) initializeMap();
        this.getMap().draw();
    }

    public Map getMap(){
        return map;
    }

    public void setMap(Map map){
        this.map = map;
    }

    public void initializeMap(){
        Window window = Window.getInstance();

        // TODO:: Create Gyms here


        Transform mapTransform = new Transform(
            new Vector2D(),
            0,
            new Vector2D(window.getWidth(), window.getHeight())
        );

        // Creating map
        this.setMap(
            new Map(
                null,
                mapTransform,
                "assets/Bratislava_Map.png"
            )
        );
    }
}
