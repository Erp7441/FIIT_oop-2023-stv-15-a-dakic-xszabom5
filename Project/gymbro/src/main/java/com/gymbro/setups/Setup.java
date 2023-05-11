package com.gymbro.setups;


import com.gymbro.city.builder.MapBuilder;
import com.gymbro.city.builder.TransformBuilder;
import com.gymbro.city.controller.GymController;
import com.gymbro.city.controller.MapController;
import com.gymbro.handlers.GymsHandler;
import com.gymbro.utils.Vector2D;
import com.gymbro.window.Window;

import java.util.List;

/**
 * The type Setup.
 */

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
        return GymsHandler.load();
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
