package com.gymbro.city.controller;

import com.gymbro.city.model.GymModel;
import com.gymbro.city.view.GymView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import static java.lang.System.out;

/**
 * The type Gym controller.
 */
public class GymController extends Controller{

    /**
     * Instantiates a new Gym controller.
     *
     * @param model the model
     */
    public GymController(GymModel model){
        super(model, new GymView(model));
    }

    /**
     * Instantiates a new Gym controller.
     *
     * @param model the model
     * @param view  the view
     */
    public GymController(GymModel model, GymView view){
        super(model, view);
    }

    /**
     * Adds event listener for handling mouse click
     */
    public void makeClickable(){
        if(this.getImageView() == null) return;
        this.getImageView().addEventHandler(MouseEvent.MOUSE_CLICKED, this::handleClick);
    }

    /**
     * Make hoverable.
     */
    public void makeHoverable(){
        if(this.getImageView() == null) return;
        this.getImageView().addEventHandler(MouseEvent.MOUSE_ENTERED, this::handleStartHover);
        this.getImageView().addEventHandler(MouseEvent.MOUSE_EXITED, this::handleEndHover);
    }

    /**
     * Make interactive.
     */
    public void makeInteractive(){
        this.makeClickable();
        this.makeHoverable();
    }

    /**
     * Handles click event
     */
    private void handleClick(MouseEvent event){

        if(event.getButton().equals(MouseButton.PRIMARY)){
            ((GymView) this.getView()).showProperties();
        }
        else if(event.getButton().equals(MouseButton.SECONDARY)){
            // TODO:: Show context menu here
            out.println("Test right click");
        }

    }

    private void handleStartHover(MouseEvent event){
        if(this.getView() instanceof GymView){
            ((GymView) this.getView()).zoomIn();
        }
    }

    private void handleEndHover(MouseEvent event){
        if(this.getView() instanceof GymView){
            ((GymView) this.getView()).zoomOut();
        }
    }
}
