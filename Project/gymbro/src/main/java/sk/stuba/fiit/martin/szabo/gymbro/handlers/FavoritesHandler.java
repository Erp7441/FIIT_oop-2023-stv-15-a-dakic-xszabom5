package sk.stuba.fiit.martin.szabo.gymbro.handlers;

import sk.stuba.fiit.martin.szabo.gymbro.city.builder.FavoritesBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.FavoritesController;

public class FavoritesHandler{

    private static FavoritesController favorites = initalizeFavorites();

    private FavoritesHandler(){}

    public static FavoritesController initalizeFavorites(){
        // TODO:: Serialize this
        return new FavoritesBuilder().build();
    }

    public static FavoritesController getFavorites(){
        return favorites;
    }

    public static void setFavorites(FavoritesController favorites){
        FavoritesHandler.favorites = favorites;
    }
}
