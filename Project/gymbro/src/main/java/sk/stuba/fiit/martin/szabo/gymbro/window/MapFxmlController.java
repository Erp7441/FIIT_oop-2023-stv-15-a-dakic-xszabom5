package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXML;

public class MapFxmlController{

    public MapFxmlController(){
    }

    @FXML
    public void showMap(){
        Setup setup = new Setup();
        if(setup.getMap() == null) setup.initializeMap();
        setup.run();
    }

}
