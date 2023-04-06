package sk.stuba.fiit.martin.szabo.gymbro.menu;

import javafx.scene.input.MouseEvent;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.GymBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.MapBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.builder.TransformBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.MapController;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;
import sk.stuba.fiit.martin.szabo.gymbro.window.Window;

import java.util.ArrayList;

// TODO:: Refactor this class (package, name...)
public class Setup{
    private MapController map = null;

    public Setup(){
    }

    public Setup(MapController map){
        this.map = map;
    }

    public void initializeMap(){
        Window window = Window.getInstance();

        // Creating map
        this.setMap(
            new MapBuilder().
                addTransform(new TransformBuilder().addScale(new Vector2D(window.getWidth(), window.getHeight())).build()).
                addTexture("assets/Bratislava_Map.png").
                build()
        );

        this.getMap().setGyms(this.createGyms());

        this.getMap().getGyms().get(0).getImageView().setOnMouseClicked(e -> {
            System.out.println("Test");
        });


        //this.initializeEventListeners();


    }

    public ArrayList<GymController> createGyms(){
        ArrayList<GymController> gyms = new ArrayList<>();

        // TODO:: Add more gyms
        gyms.add(
            new GymBuilder().
                addTransform(
                    new TransformBuilder().
                        addScale(new Vector2D(100, 37)).
                        addPosition(new Vector2D(0, 0)).
                        build()
                ).
                addParent(this.getMap()).
                addTexture("assets/lifegym.png").
                build()
        );



        return gyms;
    }

    public void initializeEventListeners(){
        Window window = Window.getInstance();

        //! DEBUG: playing with handlers start


        // TODO:: SETUP OBSERVER FOR THIS
        // TODO:: Maybe extract adding handlers to extra class

        /*
         * The way I imagine it is. On each mouse event clicked we will go through Gyms and check if mouse colides
         * with gym position if so we will display apropriate gym menu
         */

        window.getStage().addEventFilter(MouseEvent.MOUSE_CLICKED, mouse -> {

            // Loop through (gyms) observers of this event.
            // On each iteration check if it colides with cursor
            // For now print out the name of the gym to terminal
            // Later open up modal menu containing the gym information

            this.getMap().getGyms().forEach(gym -> {

                //System.out.println("Condition: " + this.gymColidesWithCursor(gym, mouse) + " for gym " + gym.getTexture().toString());
                if(this.gymColidesWithCursor(gym, mouse)){
                    System.out.println("Collides");
                }
                else{
                    System.out.println("Not colliding");
                }
            });

        });

        //! DEBUG: playing with handlers end
    }

    private boolean gymColidesWithCursor(GymController gym, MouseEvent mouse) {

        //! GYM has 0,0 in middle
        //! Mouse has 0,0 in left top

        return (
            (gym.getX() + 420.0) < mouse.getSceneX() + Constants.MOUSE_WIDTH &&
            (gym.getX() + 420.0) + gym.getWidth() > mouse.getSceneX() &&
            (gym.getY() + 420.0) < mouse.getSceneY() + Constants.MOUSE_HEIGHT &&
            (gym.getY() + 420.0) + gym.getHeight() > mouse.getSceneY()
        );
    }

    public MapController getMap(){
        return map;
    }

    public void setMap(MapController map){
        this.map = map;
    }
}
