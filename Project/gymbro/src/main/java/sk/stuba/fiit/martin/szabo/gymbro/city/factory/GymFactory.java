package sk.stuba.fiit.martin.szabo.gymbro.city.factory;

import sk.stuba.fiit.martin.szabo.gymbro.city.builder.GymBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.TransformBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

public class GymFactory{

    // TODO:: Implement this class in setup so it will create gym types that are most commonly used


    public GymFactory(){}

    public GymController createLifeGymGym(Vector2D position){
        return new GymBuilder().
            addTransform(
                new TransformBuilder().
                    //addScale(new Vector2D(75, 27)).
                    addScale(new Vector2D(10, 10)).
                    addPosition(position).
                    build()
            ).
            addTexture("assets/lifegym.png").
            makeClickable().
            build();
    }
}
