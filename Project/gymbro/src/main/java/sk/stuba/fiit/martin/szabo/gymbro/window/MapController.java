package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.city.Map;

public class MapController{

    private Map map = new Map();

    public MapController(){
    }

    public MapController(Map map){
        this.map = map;
    }

    @FXML
    public void showMap(Stage stage){
        this.getMap().draw(stage);
    }

    public Map getMap(){
        return map;
    }

    public void setMap(Map map){
        this.map = map;
    }
}
