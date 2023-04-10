package sk.stuba.fiit.martin.szabo.gymbro.managers.event;

import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class SceneEventManager{
    private EventManager<? extends KeyEvent> keyEventManager;
    private EventManager<? extends MouseEvent> mouseEventManager;
    private Scene owner;

    public SceneEventManager(Scene owner){
        this.owner = owner;
        this.keyEventManager = new EventManager<>(owner);
        this.mouseEventManager = new EventManager<>(owner);
    }

    public EventManager<? extends KeyEvent> getKeys(){
        return keyEventManager;
    }

    public void setKeys(EventManager<? extends KeyEvent> keyEventManager){
        this.keyEventManager = keyEventManager;
    }

    public EventManager<? extends MouseEvent> getMouse(){
        return mouseEventManager;
    }

    public void setMouse(EventManager<? extends MouseEvent> mouseEventManager){
        this.mouseEventManager = mouseEventManager;
    }

    public Scene getOwner(){
        return owner;
    }

    public void setOwner(Scene owner){
        this.owner = owner;
    }
}
