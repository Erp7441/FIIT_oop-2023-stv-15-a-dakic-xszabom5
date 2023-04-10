package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.Main;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.FavoritesController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.FavoritesModel;
import sk.stuba.fiit.martin.szabo.gymbro.file.Parser;
import sk.stuba.fiit.martin.szabo.gymbro.handlers.FavoritesHandler;
import sk.stuba.fiit.martin.szabo.gymbro.managers.event.SceneEventManager;
import sk.stuba.fiit.martin.szabo.gymbro.managers.scene.SceneManager;
import sk.stuba.fiit.martin.szabo.gymbro.setups.Setup;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.io.IOException;

/**
 * The type Window.
 */
public class Window{

    private static Window instance = null;
    private SceneManager sceneManager = null;
    private SceneEventManager eventManager = null;
    private Transform transform;
    private Setup windowSetup = null;
    private GymController focusedGym = null;

    private Window(){
        this.transform = new Transform(
            null,
            0,
            new Vector2D(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT)
        );
    }

    /**
     * Start.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public void start(Stage stage) throws IOException{

        FavoritesHandler.load();

        Pane root = new FXMLLoader(Main.class.getResource("fxml/mainMenu.fxml")).load();
        this.sceneManager = new SceneManager(new Scene(root, this.getWidth(), this.getHeight()));
        this.getSceneManager().addPane(Constants.ID_MAIN_MENU_PANE, root);

        stage.setScene(this.getSceneManager().getScene());
        stage.setResizable(Constants.SCREEN_RESIZABLE);
        stage.setTitle(Constants.SCREEN_TITLE);
        stage.show();

        this.getSceneManager().setStage(stage);
        this.eventManager = new SceneEventManager(this.getSceneManager().getScene());

        // TODO:: add back button
        this.setupBackToMainMenuEvent();
    }

    private void setupBackToMainMenuEvent(){
        EventHandler<KeyEvent> backToMainMenu = keyEvent -> {
            if(
                keyEvent.getCode().equals(KeyCode.ESCAPE) &&
                this.getSceneManager().getActiveName().equals(Constants.ID_MAP_PANE)
            ){
                this.handleBackToMainMenu();
            }
        };

        this.getEventManager().getKeys().addEvent(
            Constants.ID_BACK_TO_MAIN_MENU_EVENT,
            KeyEvent.KEY_PRESSED,
            backToMainMenu
        );
    }

    /**
     * Handle back to main menu.
     */
    public void handleBackToMainMenu(){
        String current = this.getSceneManager().getActiveName();
        this.getSceneManager().activate(Constants.ID_MAIN_MENU_PANE);
        this.getSceneManager().removePane(current);
    }

    /**
     * Handle favorites.
     */
    public void handleFavorites(){
        if(this.getFocusedGym() == null) return;

        FavoritesController favoritesController = FavoritesHandler.getFavorites();
        FavoritesModel favoritesModel = ((FavoritesModel) favoritesController.getModel());

        if(this.isFocusedGymFavorite()){

            // TODO:: change handling of equality between object to just generated ID
            // Since the gym objects does not have to be 100% equal (only their properties have to)
            // we need to find the specific instance from the list that matches current instance of focused gym
            favoritesModel.getFavorites().remove(favoritesController.findGym(this.getFocusedGym()));
        }
        else{
            favoritesModel.getFavorites().add(this.getFocusedGym());

        }
    }

    /**
     * Is focused gym favorite boolean.
     *
     * @return the boolean
     */
    public boolean isFocusedGymFavorite(){
        if(this.getFocusedGym() == null) return false;
        return (FavoritesHandler.getFavorites().findGym(this.getFocusedGym()) != null);
    }

    /**
     * Handle quit.
     */
    public void handleQuit(){
        Platform.exit();
    }

    /**
     * Lookup node.
     *
     * @param s the s
     * @return the node
     */
    public Node lookup(String s){
        return this.getScene().lookup(s);
    }

    /**
     * Get focused gym gym controller.
     *
     * @return the gym controller
     */
// TODO:: sort out positions of setters and getters
    public GymController getFocusedGym(){
        return focusedGym;
    }

    /**
     * Set focused gym.
     *
     * @param focusedGym the focused gym
     */
    public void setFocusedGym(GymController focusedGym){
        this.focusedGym = focusedGym;
    }

    /**
     * Get event manager scene event manager.
     *
     * @return the scene event manager
     */
    public SceneEventManager getEventManager(){
        return eventManager;
    }

    /**
     * Get instance window.
     *
     * @return the window
     */
    public static Window getInstance(){
        if(Window.instance == null) Window.instance = new Window();
        return Window.instance;
    }

    /**
     * Get stage stage.
     *
     * @return the stage
     */
    public Stage getStage(){
        return this.getSceneManager().getStage();
    }

    /**
     * Get scene scene.
     *
     * @return the scene
     */
    public Scene getScene(){
        return this.getSceneManager().getScene();
    }

    /**
     * Get scene manager scene manager.
     *
     * @return the scene manager
     */
    public SceneManager getSceneManager(){
        return sceneManager;
    }

    /**
     * Get transform transform.
     *
     * @return the transform
     */
    public Transform getTransform(){
        return transform;
    }

    /**
     * Get position vector 2 d.
     *
     * @return the vector 2 d
     */
    public Vector2D getPosition(){
        return this.getTransform().getPosition();
    }

    /**
     * Get rotation double.
     *
     * @return the double
     */
    public double getRotation(){
        return this.getTransform().getRotation();
    }

    /**
     * Get scale vector 2 d.
     *
     * @return the vector 2 d
     */
    public Vector2D getScale(){
        return this.getTransform().getScale();
    }

    /**
     * Get x double.
     *
     * @return the double
     */
    public double getX(){
        return this.getPosition().getX();
    }

    /**
     * Get y double.
     *
     * @return the double
     */
    public double getY(){
        return this.getPosition().getY();
    }

    /**
     * Get width double.
     *
     * @return the double
     */
    public double getWidth(){
        return this.getScale().getX();
    }

    /**
     * Get height double.
     *
     * @return the double
     */
    public double getHeight(){
        return this.getScale().getY();
    }

    /**
     * Get window setup setup.
     *
     * @return the setup
     */
    public Setup getWindowSetup(){
        return windowSetup;
    }

    /**
     * Set event manager.
     *
     * @param eventManager the event manager
     */
    public void setEventManager(SceneEventManager eventManager){
        this.eventManager = eventManager;
    }

    /**
     * Set scene manager.
     *
     * @param sceneManager the scene manager
     */
    public void setSceneManager(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }

    /**
     * Set transform.
     *
     * @param transform the transform
     */
    public void setTransform(Transform transform){
        this.transform = transform;
    }

    /**
     * Set position.
     *
     * @param position the position
     */
    public void setPosition(Vector2D position){
        this.getTransform().setPosition(position);
    }

    /**
     * Set rotation.
     *
     * @param rotation the rotation
     */
    public void setRotation(double rotation){
        this.getTransform().setRotation(rotation);
    }

    /**
     * Set scale.
     *
     * @param scale the scale
     */
    public void setScale(Vector2D scale){
        this.getTransform().setScale(scale);
    }

    /**
     * Set x.
     *
     * @param x the x
     */
    public void setX(double x){
        this.getPosition().setX(x);
    }

    /**
     * Set y.
     *
     * @param y the y
     */
    public void setY(double y){
        this.getPosition().setY(y);
    }

    /**
     * Set width.
     *
     * @param width the width
     */
    public void setWidth(double width){
        this.getScale().setX(width);
    }

    /**
     * Set height.
     *
     * @param height the height
     */
    public void setHeight(double height){
        this.getScale().setY(height);
    }

    /**
     * Set window setup.
     *
     * @param windowSetup the window setup
     */
    public void setWindowSetup(Setup windowSetup){
        this.windowSetup = windowSetup;
    }
}
