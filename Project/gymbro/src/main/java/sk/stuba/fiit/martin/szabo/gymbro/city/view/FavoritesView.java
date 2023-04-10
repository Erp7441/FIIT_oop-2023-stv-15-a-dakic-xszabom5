package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.FavoritesModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.Model;

public class FavoritesView extends View{
    public FavoritesView(){
        super(new FavoritesModel());
    }

    public FavoritesView(FavoritesModel model){
        super(model);
    }
}
