package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.GymModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.GymView;

import static java.lang.System.out;

public class GymController extends Controller{

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

    public void makeHoverable(){
        if(this.getImageView() == null) return;
        this.getImageView().addEventHandler(MouseEvent.MOUSE_ENTERED, this::handleStartHover);
        this.getImageView().addEventHandler(MouseEvent.MOUSE_EXITED, this::handleEndHover);
    }

    /**
     * Handles click event
     */
    private void handleClick(MouseEvent event){

        if(event.getButton().equals(MouseButton.PRIMARY)){
            ModalMenuController controller = ((GymModel) this.getModel()).getModalMenu();
            controller.getView().draw();
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
