package com.gymbro.city.view;

import com.gymbro.city.model.GymModel;
import javafx.scene.control.Button;
import com.gymbro.city.controller.PropertiesMenuController;
import com.gymbro.window.Window;
import com.gymbro.window.fxml.PropertiesMenuFxmlController;

/**
 * The type Gym view.
 */
public class GymView extends View{

    /**
     * Instantiates a new Gym view.
     */
    public GymView(){
        super(new GymModel());
    }

    /**
     * Instantiates a new Gym view.
     *
     * @param model the model
     */
    public GymView(GymModel model){
        super(model);
    }

    /**
     * Zoom in.
     */
    public void zoomIn(){
        this.getImageView().setFitWidth(this.getImageView().getFitWidth() * 2);
        this.getImageView().setFitHeight(this.getImageView().getFitHeight() * 2);
    }

    /**
     * Zoom out.
     */
    public void zoomOut(){
        this.getImageView().setFitWidth(this.getImageView().getFitWidth() / 2);
        this.getImageView().setFitHeight(this.getImageView().getFitHeight() / 2);
    }

    /**
     * Show properties.
     */
    public void showProperties(){
        PropertiesMenuController controller = ((GymModel) this.getModel()).getPropertiesMenu();
        controller.getView().draw();
        Window.getInstance().setFocusedGym(controller.getOwner());

        // Initalize favorite button state
        PropertiesMenuFxmlController.initializeFavoritesButtonState((Button) Window.getInstance().lookup("#favorites"));
    }
}
