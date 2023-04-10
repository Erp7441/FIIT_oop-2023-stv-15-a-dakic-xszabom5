package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.FavoritesModel;

/**
 * The type Favorites view.
 */
public class FavoritesView extends View{
    /**
     * Instantiates a new Favorites view.
     */
    public FavoritesView(){
        super(new FavoritesModel());
    }

    /**
     * Instantiates a new Favorites view.
     *
     * @param model the model
     */
    public FavoritesView(FavoritesModel model){
        super(model);
    }
}
