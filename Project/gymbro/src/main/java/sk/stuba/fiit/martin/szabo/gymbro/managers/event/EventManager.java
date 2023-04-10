package sk.stuba.fiit.martin.szabo.gymbro.managers.event;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import sk.stuba.fiit.martin.szabo.gymbro.managers.event.EventEntry;

import java.util.HashMap;
import java.util.Map;

public class EventManager<T extends Event>{
    private final Scene owner;
    private final HashMap<String, EventEntry<T>> handlers;

    public EventManager(Scene owner){
        handlers = new HashMap<>();
        this.owner = owner;
    }

    public void addEvent(String id, EventType<? super T> eventType, EventHandler<? super T> handler) {
        try {
            // TODO:: Maybe refactor to avoid suppressing this unchecked cast?

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

    public void removeEvent(String id) {
        EventEntry<T> entry = this.getHandlers().get(id);
        this.removeEventEntry(entry);
    }

    public void removeEvent(EventHandler<? super T> handler) {
        for(String key : this.getHandlers().keySet()){
            if(this.getHandlers().get(key).getHandler().equals(handler)){
                this.removeEventEntry(this.getHandlers().get(key));
                return;
            }
        }
    }


    public Map<String, EventEntry<T>> getHandlers(){
        return handlers;
    }

    public Scene getOwner(){
        return owner;
    }
}
