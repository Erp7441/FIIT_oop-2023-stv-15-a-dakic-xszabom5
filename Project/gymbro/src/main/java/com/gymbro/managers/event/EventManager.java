package com.gymbro.managers.event;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Event manager.
 *
 * @param <T> the type parameter
 */
public class EventManager<T extends Event>{
    private final Scene owner;
    private final HashMap<String, EventEntry<T>> handlers;

    /**
     * Instantiates a new Event manager.
     *
     * @param owner the owner
     */
    public EventManager(Scene owner){
        handlers = new HashMap<>();
        this.owner = owner;
    }

    /**
     * Add event.
     *
     * @param id        the id
     * @param eventType the event type
     * @param handler   the handler
     */
    public void addEvent(String id, EventType<? super T> eventType, EventHandler<? super T> handler) {
        try {


            // Warning can be suppressed since we are try catching class cast exception
            @SuppressWarnings("unchecked")
            EventType<T> event = (EventType<T>) eventType;

            this.getOwner().addEventHandler(event, handler);
            this.getHandlers().put(id, new EventEntry<>(event, handler));

        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    private void removeEventEntry(EventEntry<T> entry){
        if (entry != null) {
            EventType<? extends T> eventType = entry.getEvent();
            EventHandler<? super T> handler = entry.getHandler();

            this.getOwner().removeEventHandler(eventType, handler);
            for(String key : this.getHandlers().keySet()){
                if(this.getHandlers().get(key).equals(entry)){
                    this.getHandlers().remove(key);
                    return;
                }
            }

        }
    }

    /**
     * Remove event.
     *
     * @param id the id
     */
    public void removeEvent(String id) {
        EventEntry<T> entry = this.getHandlers().get(id);
        this.removeEventEntry(entry);
    }

    /**
     * Remove event.
     *
     * @param handler the handler
     */
    public void removeEvent(EventHandler<? super T> handler) {
        for(String key : this.getHandlers().keySet()){
            if(this.getHandlers().get(key).getHandler().equals(handler)){
                this.removeEventEntry(this.getHandlers().get(key));
                return;
            }
        }
    }


    /**
     * Get handlers map.
     *
     * @return the map
     */
    public Map<String, EventEntry<T>> getHandlers(){
        return handlers;
    }

    /**
     * Get owner scene.
     *
     * @return the scene
     */
    public Scene getOwner(){
        return owner;
    }
}
