package sk.stuba.fiit.martin.szabo.gymbro.window.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

/**
 * The type Properties menu fxml controller.
 */
public class PropertiesMenuFxmlController{

    /**
     * Back.
     */
    @FXML
    protected void back(){
        if(Window.getInstance().getSceneManager().getActiveName().equals(Constants.ID_GYM_MENU_PANE)){
            Window.getInstance().getSceneManager().activate(Constants.ID_MAP_PANE);
            Window.getInstance().getSceneManager().removePane(Constants.ID_GYM_MENU_PANE);
            Window.getInstance().getEventManager().getKeys().removeEvent(Constants.ID_PROPERTY_REMOVE_ON_ESCAPE_EVENT);
            Window.getInstance().setFocusedGym(null);
        }
    }

    /**
     * Handle favorites.
     *
     * @param event the event
     */
    public void handleFavorites(ActionEvent event){
        Window.getInstance().handleFavorites();
        initializeFavoritesButtonState((Button) event.getSource());
    }

    /**
     * Initialize favorites button state.
     *
     * @param favoritesButton the favorites button
     */
    public static void initializeFavoritesButtonState(Button favoritesButton){
        if(favoritesButton == null) return;

        if(Window.getInstance().isFocusedGymFavorite()){
            favoritesButton.setText("Remove from favorites");
            favoritesButton.setLayoutX(680);
        }
        else{
            favoritesButton.setText("Add to favorites");
            favoritesButton.setLayoutX(710);
        }
    }
}
