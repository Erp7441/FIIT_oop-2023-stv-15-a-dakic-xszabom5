package sk.stuba.fiit.martin.szabo.gymbro;

import javafx.application.Application;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

/**
 * Patterns:<br /><br />

 * 1. ✔ Builder to implement add methods that add values to object attributes. Can be used on Gym and Map classes.<br /><br />

 * 2. Observer Can be implemented when clicking. We can have multiple
 *    {@link sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController Gym}
 *    objects listening on click events and when user clicks on the object then we fire off multiple events.
 *    (Hide map, Show clicked gym menu, etc.)<br /><br />

 * 3. ✔ MVC can be implemented by separating the object: attributes, methods and drawming (viewing) methods into separate
 *    subclasses that will be connected together to create one object.<br /><br />

 * 4. State. I currently have no clue how to implement it. But it is supposed to replace for example a switch where
 *    if a class has atrribute where we need to do a lot of decisions on how to set it. Rather than that we can
 *    implement multiple classes for each state, and then we can auto decide the state of that attribute with the
 *    object that we assign it to.<br /><br />

 * 5. Factory, creates instance for you without need of specifying any attributes utilize factory to create multiple
 *    gyms with their diffrent attributes. Can be also used for Map but that seems to be reduntant, although it could be
 *    useful for parsing.<br /><br />

 * 6. ✔ Singleton since we want only one instance of a {@link Window}. We can limit the number of instances by creating static
 *    attribute {@link Window#window} inside {@link Window} class and implementing {@link Window#getInstance()} method which will check if the attribute
 *    object is created. If not create it and then return it. Else return it. Also, helpful for getting {@link Stage} and {@link javafx.scene.Scene Scene}
 *    references from places where they would otherwise be unavailable.<br /><br />
 *
 */


public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Window window = Window.getInstance();
        window.start(primaryStage);
    }

    public static void main(String[] args){
        Application.launch();
    }
}