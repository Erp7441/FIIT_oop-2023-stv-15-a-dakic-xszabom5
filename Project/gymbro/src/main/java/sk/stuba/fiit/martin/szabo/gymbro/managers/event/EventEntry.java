package sk.stuba.fiit.martin.szabo.gymbro.managers.event;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;

public class EventEntry<T extends Event>{

    private EventType<T> event;
    private EventHandler<? super T> handler;

    public EventEntry(EventType<T> event, EventHandler<? super T> handler){
        this.event = event;
        this.handler = handler;
    }

    public EventType<T> getEvent(){
        return event;
    }

    public void setEvent(EventType<T> event){
        this.event = event;
    }

    public EventHandler<? super T> getHandler(){
        return handler;
    }

    public void setHandler(EventHandler<? super T> handler){
        this.handler = handler;
    }
}
