package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.MapModel;

public class MapView extends View{

    private MapModel model;

    public MapView(){
        super(new MapModel());
    }

    public MapView(MapModel model){
        super(model);
    }


}
