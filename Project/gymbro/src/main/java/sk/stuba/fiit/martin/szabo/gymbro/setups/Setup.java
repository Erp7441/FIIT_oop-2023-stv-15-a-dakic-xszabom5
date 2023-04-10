package sk.stuba.fiit.martin.szabo.gymbro.setups;

import sk.stuba.fiit.martin.szabo.gymbro.city.builder.MapBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.TransformBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.MapController;
import sk.stuba.fiit.martin.szabo.gymbro.city.factory.GymFactory;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Places;
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
        window.setWindowSetup(this);

        // Creating map
        this.setMap(
            new MapBuilder().
                addTransform(new TransformBuilder().addScale(new Vector2D(window.getWidth(), window.getHeight())).build()).
                addGyms(this.initializeGyms()).
                addTexture("assets/Bratislava_Map.png").
                build()
        );
    }

    public List<GymController> initializeGyms(){
        ArrayList<GymController> gyms = new ArrayList<>();

        // TODO:: Add more gyms
        // TODO:: Add gym type using Factory

        GymFactory gymFactory = new GymFactory();

        gyms.add(gymFactory.createLifeGymGym(Places.NOVE_MESTO));
        gyms.add(gymFactory.createLifeGymGym(Places.DEVIN));
        gyms.add(gymFactory.createLifeGymGym(Places.KARLOVA_VES));
        gyms.add(gymFactory.createLifeGymGym(Places.CUNOVO));
        gyms.add(gymFactory.createLifeGymGym(Places.JAROVCE));
        gyms.add(gymFactory.createLifeGymGym(Places.DUBRAVKA));
        gyms.add(gymFactory.createLifeGymGym(Places.LAMAC));
        gyms.add(gymFactory.createLifeGymGym(Places.PETRZALKA));
        gyms.add(gymFactory.createLifeGymGym(Places.DEVINSKA_NOVA_VES));
        gyms.add(gymFactory.createLifeGymGym(Places.RACA));
        gyms.add(gymFactory.createLifeGymGym(Places.RUSOVCE));
        gyms.add(gymFactory.createLifeGymGym(Places.ZAHORSKA_BYSTRICA));
        gyms.add(gymFactory.createLifeGymGym(Places.STARE_MESTO));
        gyms.add(gymFactory.createLifeGymGym(Places.RUZINOV));
        gyms.add(gymFactory.createLifeGymGym(Places.VAJNORY));
        gyms.add(gymFactory.createLifeGymGym(Places.VRAKUNA));
        gyms.add(gymFactory.createLifeGymGym(Places.PODUNAJSKE_BISKUPICE));

        return gyms;
    }

    public MapController getMap(){
        return map;
    }

    public void setMap(MapController map){
        this.map = map;
    }
}
