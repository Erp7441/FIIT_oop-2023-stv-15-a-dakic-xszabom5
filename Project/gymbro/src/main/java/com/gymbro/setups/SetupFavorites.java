package com.gymbro.setups;

import com.gymbro.city.controller.GymController;
import com.gymbro.city.model.FavoritesModel;
import com.gymbro.handlers.FavoritesHandler;

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
