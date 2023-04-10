package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.PropertiesMenuModel;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.managers.scene.SceneManager;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

public class PropertiesMenuView extends View{

    public PropertiesMenuView(){
        super(new PropertiesMenuModel());
    }

    public PropertiesMenuView(PropertiesMenuModel model){
        super(model);
    }

    @Override
    public void draw(){

        Pane root = SceneManager.loadFxml("fxml/propertiesMenu.fxml");
        PropertiesMenuModel model = ((PropertiesMenuModel) this.getModel());

        if(root == null || model == null || model.getProperties() == null || model.getProperties().isEmpty()) return;

        double row = Constants.LABLE_LAYOUT_Y;
        for(Property property : model.getProperties()){
            Label text = new Label(property.toString());
            text.setLayoutX(Constants.LABLE_LAYOUT_X);
            text.setLayoutY(row);
            text.setFont(new Font(Constants.LABLE_FONT_TYPE, Constants.LABLE_FONT_SIZE));
            root.getChildren().add(text);
            row += Constants.LABLE_LAYOUT_Y;
        }

        Window.getInstance().getSceneManager().addPane(Constants.ID_GYM_MENU_PANE, root);
        Window.getInstance().getSceneManager().activate(Constants.ID_GYM_MENU_PANE);

        this.addRemoveOnEscapeEvent();
    }

    public void removeFromView(){
        Window.getInstance().getSceneManager().activate(Constants.ID_MAP_PANE);
        Window.getInstance().getSceneManager().removePane(Constants.ID_GYM_MENU_PANE);
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
