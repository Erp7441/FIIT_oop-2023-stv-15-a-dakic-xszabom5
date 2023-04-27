package com.gymbro.city.factory;

import com.gymbro.city.controller.GymController;
import com.gymbro.utils.Places;
import com.gymbro.utils.Property;
import com.gymbro.utils.Vector2D;
import com.gymbro.window.Window;
import com.gymbro.city.builder.GymBuilder;
import com.gymbro.city.builder.PropertiesMenuBuilder;
import com.gymbro.city.builder.TransformBuilder;

/**
 * The type Gym factory.
 */
public class GymFactory{

    // TODO:: Implement this class in setups so it will create gym types that are most commonly used


    /**
     * Instantiates a new Gym factory.
     */
    public GymFactory(){}

    /**
     * Create life gym gym gym controller.
     *
     * @param location the location
     * @return the gym controller
     */
    public GymController createLifeGymGym(Places location){
        return new GymBuilder().
            addTransform(
                new TransformBuilder().
                    addScale(new Vector2D(75, 27)).
                    addPosition(location.getPosition()).
                    build()
            ).
            addPropertiesMenu(
                new PropertiesMenuBuilder().
                    addTransform(
                        new TransformBuilder().
                            addScale(new Vector2D(Window.getInstance().getWidth(), Window.getInstance().getHeight())).
                            build()
                    ).
                    addProperty(new Property("Name", "LifeGym")).
                    addProperty(new Property("Location", location)).
                    addTexture("assets/Bratislava_Map.png").
                    build()
            ).
            addTexture("assets/lifegym.png").
            addAmountOfEquipment(0).
            makeInteractive().
            build();
    }

    /**
     * Create fitinn gym gym controller.
     *
     * @param location the location
     * @return the gym controller
     */
    public GymController createFitinnGym(Places location){
        return new GymBuilder().
            addTransform(
                new TransformBuilder().
                    addScale(new Vector2D(75, 27)).
                    addPosition(location.getPosition()).
                    build()
            ).
            addPropertiesMenu(
                new PropertiesMenuBuilder().
                    addProperty(new Property("Name", "FITINN")).
                    addProperty(new Property("Location", location)).
                    build()
            ).
            addTexture("assets/fitinn.png").
            addAmountOfEquipment(0).
            makeInteractive().
            build();
    }
}
