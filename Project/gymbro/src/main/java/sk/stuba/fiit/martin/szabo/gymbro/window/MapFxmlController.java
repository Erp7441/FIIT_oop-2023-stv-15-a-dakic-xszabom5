package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.GymBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.MapBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.TransformBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.MapController;
import sk.stuba.fiit.martin.szabo.gymbro.menu.Setup;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.util.ArrayList;

public class MapFxmlController{

    public MapFxmlController(){
    }

    @FXML
    public void showMap(){
        Setup setup = new Setup();
        if(setup.getMap() == null) setup.initializeMap();
        setup.getMap().draw();

        for(GymController gym : setup.getMap().getGyms()){
            gym.draw();
        }
    }

}
