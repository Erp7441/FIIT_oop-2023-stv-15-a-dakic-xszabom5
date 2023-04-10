package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.ModalMenuModel;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.window.SceneManager;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

public class ModalMenuView extends View{

    public ModalMenuView(){
        super(new ModalMenuModel());
    }

    public ModalMenuView(ModalMenuModel model){
        super(model);
    }

    @Override
    public void draw(){

        Pane root = SceneManager.loadFxml("fxml/modalMenu.fxml");
        ModalMenuModel model = ((ModalMenuModel) this.getModel());

        if(root == null || model == null || model.getProperties() == null || model.getProperties().isEmpty()) return;


        int row = 50;
        for(Property property : model.getProperties()){
            Text text = new Text(100, row, property.toString());
            text.setFont(new Font("Consolas", 25));
            root.getChildren().add(text);
            row += 50;
        }

        // TODO:: Add back button

        Window.getInstance().getSceneManager().addPane("GYM_MENU", root);
        Window.getInstance().getSceneManager().activate("GYM_MENU");

        this.removeOnEscapeEvent();
    }

    public void removeFromView(){
        Window.getInstance().getSceneManager().activate("Map");
        Window.getInstance().getSceneManager().removePane("GYM_MENU");
    }

    private void removeOnEscapeEvent(){
        ModalMenuView view = this;
        EventHandler<KeyEvent> removeOnEscape = new EventHandler<>(){
            @Override
            public void handle(KeyEvent keyEvent){
                if(keyEvent.getCode().equals(KeyCode.ESCAPE)){
                    view.removeFromView();
                    Window.getInstance().getEventManager().getKeys().removeEvent(this);
                    keyEvent.consume();
                }
            }
        };

        Window.getInstance().getEventManager().getKeys().addEvent(
            "MODAL_MENU_REMOVE_ON_ESCAPE",
            KeyEvent.KEY_PRESSED,
            removeOnEscape
        );
    }
}
