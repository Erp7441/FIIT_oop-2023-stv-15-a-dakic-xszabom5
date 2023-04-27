package com.gymbro.city.view;

import com.gymbro.city.model.MapModel;

/**
 * The type Map view.
 */
public class MapView extends View{

    /**
     * Instantiates a new Map view.
     */
    public MapView(){
        super(new MapModel());
    }

    /**
     * Instantiates a new Map view.
     *
     * @param model the model
     */
    public MapView(MapModel model){
        super(model);
    }


}
