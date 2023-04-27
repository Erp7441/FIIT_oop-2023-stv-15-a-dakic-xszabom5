package com.gymbro.managers.event;

import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * The type Scene event manager.
 */
public class SceneEventManager{
    private EventManager<? extends KeyEvent> keyEventManager;
    private EventManager<? extends MouseEvent> mouseEventManager;
    private Scene owner;

    /**
     * Instantiates a new Scene event manager.
     *
     * @param owner the owner
     */
    public SceneEventManager(Scene owner){
        this.owner = owner;
        this.keyEventManager = new EventManager<>(owner);
        this.mouseEventManager = new EventManager<>(owner);
    }

    /**
     * Get keys event manager.
     *
     * @return the event manager
     */
    public EventManager<? extends KeyEvent> getKeys(){
        return keyEventManager;
    }

    /**
     * Set keys.
     *
     * @param keyEventManager the key event manager
     */
    public void setKeys(EventManager<? extends KeyEvent> keyEventManager){
        this.keyEventManager = keyEventManager;
    }

    /**
     * Get mouse event manager.
     *
     * @return the event manager
     */
    public EventManager<? extends MouseEvent> getMouse(){
        return mouseEventManager;
    }

    /**
     * Set mouse.
     *
     * @param mouseEventManager the mouse event manager
     */
    public void setMouse(EventManager<? extends MouseEvent> mouseEventManager){
        this.mouseEventManager = mouseEventManager;
    }

    /**
     * Get owner scene.
     *
     * @return the scene
     */
    public Scene getOwner(){
        return owner;
    }

    /**
     * Set owner.
     *
     * @param owner the owner
     */
    public void setOwner(Scene owner){
        this.owner = owner;
    }
}
