package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
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


        //! DEBUG: playing with handlers start


        // TODO:: SETUP OBSERVER FOR THIS
        // TODO:: MOVE EVERYTHIG TO EXTRA CLASS TO SEPARATE UI FROM LOGIC
        // TODO:: Extract adding handlers to extra class

        /*
         * The way I imagine it is. On each mouse event clicked we will go through Gyms and check if mouse colides
         * with gym position if so we will display apropriate gym menu
         */

        window.getStage().addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
            System.out.println("Test");
        });

        //! DEBUG: playing with handlers end
    }
}
