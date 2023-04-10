package sk.stuba.fiit.martin.szabo.gymbro.window.fxml;

import javafx.fxml.FXML;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

public class PropertiesMenuFxmlController{

    @FXML
    protected void back(){
        if(Window.getInstance().getSceneManager().getActiveName().equals(Constants.ID_GYM_MENU)){
            Window.getInstance().getSceneManager().activate(Constants.ID_MAP);
            Window.getInstance().getSceneManager().removePane(Constants.ID_GYM_MENU);
            Window.getInstance().getEventManager().getKeys().removeEvent(Constants.ID_PROPERTY_REMOVE_ON_ESCAPE);
        }
    }
}
