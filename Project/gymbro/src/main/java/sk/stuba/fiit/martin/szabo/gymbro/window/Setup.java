package sk.stuba.fiit.martin.szabo.gymbro.window;

import sk.stuba.fiit.martin.szabo.gymbro.city.builder.MapBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.TransformBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.MapController;
import sk.stuba.fiit.martin.szabo.gymbro.city.factory.GymFactory;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.MapModel;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

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

    /**
     * Main method that generates frames
     */
    public void run(){
        this.getMap().update();
    }

    public List<GymController> initializeGyms(){
        ArrayList<GymController> gyms = new ArrayList<>();

        // TODO:: Add more gyms
        // TODO:: Add gym type using Factory

        GymFactory gymFactory = new GymFactory();

        gyms.add(gymFactory.createLifeGymGym(MapModel.NOVE_MESTO));
        gyms.add(gymFactory.createLifeGymGym(MapModel.DEVIN));
        gyms.add(gymFactory.createLifeGymGym(MapModel.KARLOVA_VES));
        gyms.add(gymFactory.createLifeGymGym(MapModel.CUNOVO));
        gyms.add(gymFactory.createLifeGymGym(MapModel.JAROVCE));
        gyms.add(gymFactory.createLifeGymGym(MapModel.DUBRAVKA));
        gyms.add(gymFactory.createLifeGymGym(MapModel.LAMAC));
        gyms.add(gymFactory.createLifeGymGym(MapModel.PETRZALKA));
        gyms.add(gymFactory.createLifeGymGym(MapModel.DEVINSKA_NOVA_VES));
        gyms.add(gymFactory.createLifeGymGym(MapModel.RACA));
        gyms.add(gymFactory.createLifeGymGym(MapModel.RUSOVCE));
        gyms.add(gymFactory.createLifeGymGym(MapModel.ZAHORSKA_BYSTRICA));
        gyms.add(gymFactory.createLifeGymGym(MapModel.STARE_MESTO));
        gyms.add(gymFactory.createLifeGymGym(MapModel.RUZINOV));
        gyms.add(gymFactory.createLifeGymGym(MapModel.VAJNORY));
        gyms.add(gymFactory.createLifeGymGym(MapModel.VRAKUNA));
        gyms.add(gymFactory.createLifeGymGym(MapModel.PODDUNAJSKE_BISKUPICE));

        return gyms;
    }

    public MapController getMap(){
        return map;
    }

    public void setMap(MapController map){
        this.map = map;
    }
}
