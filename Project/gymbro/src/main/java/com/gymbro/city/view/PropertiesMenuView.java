package com.gymbro.city.view;

import com.gymbro.city.model.PropertiesMenuModel;
import com.gymbro.managers.scene.SceneManager;
import com.gymbro.utils.Constants;
import com.gymbro.utils.Property;
import com.gymbro.window.Window;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

/**
 * The type Properties menu view.
 */
public class PropertiesMenuView extends View{

    /**
     * Instantiates a new Properties menu view.
     */
    public PropertiesMenuView(){
        super(new PropertiesMenuModel());
    }

    /**
     * Instantiates a new Properties menu view.
     *
     * @param model the model
     */
    public PropertiesMenuView(PropertiesMenuModel model){
        super(model);
    }

    @Override
    public void draw(){

        Pane root = SceneManager.loadFxml("fxml/propertiesMenu.fxml");
        PropertiesMenuModel model = ((PropertiesMenuModel) this.getModel());
        TextArea area = null;

        if(root != null){
            area = (TextArea) root.lookup("#propertiesArea");
            area.setFont(Constants.LABEL_FONT_TYPE);
        }

        if(root == null || model == null || model.getProperties() == null || model.getProperties().isEmpty()) return;

        for(Property property : model.getProperties()){
            area.appendText(property.toString() + "\n");
        }

        Window.getInstance().getSceneManager().addPane(Constants.ID_GYM_MENU_PANE, root);
        Window.getInstance().getSceneManager().activate(Constants.ID_GYM_MENU_PANE);

        this.addRemoveOnEscapeEvent();
    }

    /**
     * Remove from view.
     */
    public void removeFromView(){
        Window.getInstance().getSceneManager().activate(Constants.ID_MAP_PANE);
        Window.getInstance().getSceneManager().removePane(Constants.ID_GYM_MENU_PANE);
        Window.getInstance().setFocusedGym(null);
    }

    private void addRemoveOnEscapeEvent(){
        PropertiesMenuView view = this;
        EventHandler<KeyEvent> removeOnEscape = new EventHandler<>(){
            @Override
            public void handle(KeyEvent keyEvent){
                if(
                    keyEvent.getCode().equals(KeyCode.ESCAPE) &&
                    Window.getInstance().getSceneManager().getActiveName().equals(Constants.ID_GYM_MENU_PANE)
                ){
                    view.removeFromView();
                    Window.getInstance().getEventManager().getKeys().removeEvent(this);
                    keyEvent.consume();
                }
            }
        };

        Window.getInstance().getEventManager().getKeys().addEvent(
            Constants.ID_PROPERTY_REMOVE_ON_ESCAPE_EVENT,
            KeyEvent.KEY_PRESSED,
            removeOnEscape
        );
    }
}
