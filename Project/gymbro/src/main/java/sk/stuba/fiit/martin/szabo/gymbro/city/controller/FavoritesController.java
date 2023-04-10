/**
 * The FavoritesController class represents a controller for the user's favorite gyms.
 */

package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.FavoritesModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.FavoritesView;

public class FavoritesController extends Controller{

    /**
     * Creates a new FavoritesController object with the given model and a new view.
     * @param model the FavoritesModel object to use
     */
    public FavoritesController(FavoritesModel model) { super(model, new FavoritesView(model)); }

    /**
     * Creates a new FavoritesController object with the given model and view.
     * @param model the FavoritesModel object to use
     * @param view the FavoritesView object to use
     */
    public FavoritesController(FavoritesModel model, FavoritesView view){
        super(model, view);
    }

    /**
     * Finds a gym in the list of favorite gyms.
     * @param gymToBeFound the GymController object to search for
     * @return the GymController object if found, null otherwise
     */
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
