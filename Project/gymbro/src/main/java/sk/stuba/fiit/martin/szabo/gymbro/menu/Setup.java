package sk.stuba.fiit.martin.szabo.gymbro.menu;

import sk.stuba.fiit.martin.szabo.gymbro.city.builder.GymBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.MapBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.TransformBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.MapController;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

import java.util.ArrayList;
import java.util.List;

// TODO:: Refactor this class (package, name...)
public class Setup{
    private MapController map = null;

    public Setup(){
    }

    public Setup(MapController map){
        this.map = map;
    }

    public void initializeMap(){
        Window window = Window.getInstance();

        // Creating map
        this.setMap(
            new MapBuilder().
                addTransform(new TransformBuilder().addScale(new Vector2D(window.getWidth(), window.getHeight())).build()).
                addGyms((ArrayList<GymController>) this.initializeGyms()).
                addTexture("assets/Bratislava_Map.png").
                build()
        );

    }

    public List<GymController> initializeGyms(){
        ArrayList<GymController> gyms = new ArrayList<>();

        // TODO:: Add more gyms
        // TODO:: Add gym type using Factory


        gyms.add(
            new GymBuilder().
                addTransform(
                    new TransformBuilder().
                        addScale(new Vector2D(75, 27)).
                        addPosition(new Vector2D(-200, -200)).
                        build()
                ).
                addParent(this.getMap()).
                addTexture("assets/lifegym.png").
                makeClickable().
                build()
        );

        return gyms;
    }


    public MapController getMap(){
        return map;
    }

    public void setMap(MapController map){
        this.map = map;
    }
}
