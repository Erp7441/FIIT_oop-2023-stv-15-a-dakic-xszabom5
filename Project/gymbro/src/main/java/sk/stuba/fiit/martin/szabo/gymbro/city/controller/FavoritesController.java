package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.FavoritesModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.GymModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.Model;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.FavoritesView;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.View;

public class FavoritesController extends Controller{

    public FavoritesController(FavoritesModel model, FavoritesView view){
        super(model, view);
    }

    public GymController findGym(GymController gymToBeFound){

        if(gymToBeFound == null) return null;
        for(GymController gym : ((FavoritesModel) this.getModel()).getFavorites()){
            if(gym.getModel().equals(gymToBeFound.getModel())){
                return gym;
            }
        }
        return null;
    }
}
