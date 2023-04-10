package sk.stuba.fiit.martin.szabo.gymbro.setups;

import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.FavoritesModel;
import sk.stuba.fiit.martin.szabo.gymbro.handlers.FavoritesHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The type Setup favorites.
 */
public class SetupFavorites extends Setup{

    @Override
    public List<GymController> initializeGyms(){
        if(FavoritesHandler.getFavorites() == null) return Collections.emptyList();
        return new ArrayList<>(((FavoritesModel) FavoritesHandler.getFavorites().getModel()).getFavorites());
    }
}
