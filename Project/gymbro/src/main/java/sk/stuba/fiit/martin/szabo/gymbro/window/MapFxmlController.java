package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXML;
import sk.stuba.fiit.martin.szabo.gymbro.menu.Setup;

public class MapFxmlController{

    public MapFxmlController(){
    }

    @FXML
    public void showMap(){
        Setup setup = new Setup();
        if(setup.getMap() == null) setup.initializeMap();
        setup.getMap().draw();
    }

}
