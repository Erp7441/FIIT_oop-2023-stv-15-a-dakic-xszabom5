package com.gymbro.city.factory;

import com.gymbro.city.builder.GymBuilder;
import com.gymbro.city.builder.PropertiesMenuBuilder;
import com.gymbro.city.builder.TransformBuilder;
import com.gymbro.city.controller.GymController;
import com.gymbro.utils.Places;
import com.gymbro.utils.Property;
import com.gymbro.utils.Vector2D;
import com.gymbro.window.Window;

import java.net.URL;

/**
 * The type Gym factory.
 */
public class GymFactory{

    /**
     * Instantiates a new Gym factory.
     */
    public GymFactory(){}

    /**
     * Create life gym gym gym controller.
     *
     * @param location          the location
     * @param amountOfEquipment the amount of equipment
     * @param website           the website
     * @return the gym controller
     */
    public GymController createLifeGymGym(Places location, Integer amountOfEquipment, URL website){
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
                    addProperty(new Property("Amount of equipment", amountOfEquipment)).
                    addProperty(new Property("Website", website)).
                    addTexture("assets/Bratislava_Map.png").
                    build()
            ).
            addTexture("assets/lifegym.png").
            makeInteractive().
            build();
    }

    /**
     * Create fitinn gym gym controller.
     *
     * @param location          the location
     * @param amountOfEquipment the amount of equipment
     * @param website           the website
     * @return the gym controller
     */
    public GymController createFitinnGym(Places location, Integer amountOfEquipment, URL website){
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
                    addProperty(new Property("Amount of equipment", amountOfEquipment)).
                    addProperty(new Property("Website", website)).
                    build()
            ).
            addTexture("assets/fitinn.png").
            makeInteractive().
            build();
    }

    /**
     * Create golem gym gym controller.
     *
     * @param location          the location
     * @param amountOfEquipment the amount of equipment
     * @param website           the website
     * @return the gym controller
     */
    public GymController createGolemGym(Places location, Integer amountOfEquipment, URL website){
        return new GymBuilder().
                addTransform(
                        new TransformBuilder().
                                addScale(new Vector2D(75, 27)).
                                addPosition(location.getPosition()).
                                build()
                ).
                addPropertiesMenu(
                        new PropertiesMenuBuilder().
                                addProperty(new Property("Name", "GolemGym")).
                                addProperty(new Property("Location", location)).
                                addProperty(new Property("Amount of equipment", amountOfEquipment)).
                                addProperty(new Property("Website", website)).
                                build()
                ).
                addTexture("assets/golem.png").
                makeInteractive().
                build();
    }

    /**
     * Create nobel gym gym gym controller.
     *
     * @param location          the location
     * @param amountOfEquipment the amount of equipment
     * @param website           the website
     * @return the gym controller
     */
    public GymController createNobelGymGym(Places location, Integer amountOfEquipment, URL website){
        return new GymBuilder().
                addTransform(
                        new TransformBuilder().
                                addScale(new Vector2D(75, 27)).
                                addPosition(location.getPosition()).
                                build()
                ).
                addPropertiesMenu(
                        new PropertiesMenuBuilder().
                                addProperty(new Property("Name", "NobelGym")).
                                addProperty(new Property("Location", location)).
                                addProperty(new Property("Amount of equipment", amountOfEquipment)).
                                addProperty(new Property("Website", website)).
                                build()
                ).
                addTexture("assets/nobelgym.png").
                makeInteractive().
                build();
    }
}
