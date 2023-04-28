package com.gymbro.city.model;

import com.gymbro.city.controller.GymController;
import com.gymbro.utils.Property;
import com.gymbro.utils.Transform;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Map model.
 */
public class MapModel extends Model{

    private ArrayList<GymController> gyms = new ArrayList<>();

    /**
     * Instantiates a new Map model.
     */
    public MapModel(){}

    /**
     * Instantiates a new Map model.
     *
     * @param gyms      the gyms
     * @param transform the transform
     * @param texture   the texture
     */
    public MapModel(ArrayList<GymController> gyms, Transform transform, Image texture){
        super(transform, texture);
        this.gyms = gyms;
    }

    /**
     * Instantiates a new Map model.
     *
     * @param gyms        the gyms
     * @param transform   the transform
     * @param texturePath the texture path
     */
    public MapModel(List<GymController> gyms, Transform transform, String texturePath){
        super(transform, texturePath);
        this.gyms = (ArrayList<GymController>) gyms;
    }

    @Override
    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    /**
     * Deserialize property.
     *
     * @return the property
     */
    public static Property deserialize(){


        return null;
    }

    /**
     * Get gyms list.
     *
     * @return the list
     */
    public List<GymController> getGyms(){
        return gyms;
    }

    /**
     * Set gyms.
     *
     * @param gyms the gyms
     */
    public void setGyms(ArrayList<GymController> gyms){
        this.gyms = gyms;
    }

}
