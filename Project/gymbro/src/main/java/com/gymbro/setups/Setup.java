package com.gymbro.setups;


import com.gymbro.city.builder.MapBuilder;
import com.gymbro.city.builder.TransformBuilder;
import com.gymbro.city.controller.GymController;
import com.gymbro.city.controller.MapController;
import com.gymbro.city.factory.GymFactory;
import com.gymbro.utils.Places;
import com.gymbro.utils.Vector2D;
import com.gymbro.window.Window;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Setup.
 */
// TODO:: Refactor this class (package, name...)
public class Setup{
    private MapController map = null;

    /**
     * Instantiates a new Setup.
     */
    public Setup(){
    }

    /**
     * Instantiates a new Setup.
     *
     * @param map the map
     */
    public Setup(MapController map){
        this.map = map;
    }

    /**
     * Initialize map.
     */
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

    /**
     * Initialize gyms list.
     *
     * @return the list
     */
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

    /**
     * Get map map controller.
     *
     * @return the map controller
     */
    public MapController getMap(){
        return map;
    }

    /**
     * Set map.
     *
     * @param map the map
     */
    public void setMap(MapController map){
        this.map = map;
    }
}
