package sk.stuba.fiit.martin.szabo.gymbro.city.factory;

import sk.stuba.fiit.martin.szabo.gymbro.city.builder.GymBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.ModalMenuBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.TransformBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Places;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

public class GymFactory{

    // TODO:: Implement this class in setup so it will create gym types that are most commonly used


    public GymFactory(){}

    public GymController createLifeGymGym(Places location){
        return new GymBuilder().
            addTransform(
                new TransformBuilder().
                    addScale(new Vector2D(75, 27)).
                    addPosition(location.getPosition()).
                    build()
            ).
            addModalMenu(
                new ModalMenuBuilder().
                    addProperty(new Property("Name", "LifeGym")).
                    addProperty(new Property("Location", location)).
                    build()
            ).
            addTexture("assets/lifegym.png").
            addAmountOfEquipment(0).
            makeInteractive().
            build();
    }

    public GymController createFitinnGym(Places location){
        return new GymBuilder().
            addTransform(
                new TransformBuilder().
                    addScale(new Vector2D(75, 27)).
                    addPosition(location.getPosition()).
                    build()
            ).
            addModalMenu(
                new ModalMenuBuilder().
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
