package com.gymbro.managers.event;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;

/**
 * The type Event entry.
 *
 * @param <T> the type parameter
 */
public class EventEntry<T extends Event>{

    private EventType<T> event;
    private EventHandler<? super T> handler;

    /**
     * Instantiates a new Event entry.
     *
     * @param event   the event
     * @param handler the handler
     */
    public EventEntry(EventType<T> event, EventHandler<? super T> handler){
        this.event = event;
        this.handler = handler;
    }

    /**
     * Get event event type.
     *
     * @return the event type
     */
    public EventType<T> getEvent(){
        return event;
    }

    /**
     * Set event.
     *
     * @param event the event
     */
    public void setEvent(EventType<T> event){
        this.event = event;
    }

    /**
     * Get handler event handler.
     *
     * @return the event handler
     */
    public EventHandler<? super T> getHandler(){
        return handler;
    }

    /**
     * Set handler.
     *
     * @param handler the handler
     */
    public void setHandler(EventHandler<? super T> handler){
        this.handler = handler;
    }
}
