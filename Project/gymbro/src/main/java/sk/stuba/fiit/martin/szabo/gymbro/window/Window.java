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
import sk.stuba.fiit.martin.szabo.gymbro.managers.scene.SceneManager;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.handlers.FavoritesHandler;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;
import sk.stuba.fiit.martin.szabo.gymbro.managers.event.SceneEventManager;
import sk.stuba.fiit.martin.szabo.gymbro.setups.Setup;

import java.io.IOException;

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

    public void start(Stage stage) throws IOException{

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

    public void handleBackToMainMenu(){
        this.getSceneManager().activate(Constants.ID_MAIN_MENU_PANE);
        this.getSceneManager().removePane(Constants.ID_MAP_PANE);
    }

    public void handleFavorites(){
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

    public boolean isFocusedGymFavorite(){
        if(this.getFocusedGym() == null) return false;
        return (FavoritesHandler.getFavorites().findGym(this.getFocusedGym()) != null);
    }

    public void handleQuit(){
        Platform.exit();
    }
    
    public Node lookup(String s){
        return this.getScene().lookup(s);
    }

    // TODO:: sort out positions of setters and getters
    public GymController getFocusedGym(){
        return focusedGym;
    }

    public void setFocusedGym(GymController focusedGym){
        this.focusedGym = focusedGym;
    }

    public SceneEventManager getEventManager(){
        return eventManager;
    }

    public static Window getInstance(){
        if(Window.instance == null) Window.instance = new Window();
        return Window.instance;
    }
    public Stage getStage(){
        return this.getSceneManager().getStage();
    }
    public Scene getScene(){
        return this.getSceneManager().getScene();
    }
    public SceneManager getSceneManager(){
        return sceneManager;
    }
    public Transform getTransform(){
        return transform;
    }
    public Vector2D getPosition(){
        return this.getTransform().getPosition();
    }
    public double getRotation(){
        return this.getTransform().getRotation();
    }
    public Vector2D getScale(){
        return this.getTransform().getScale();
    }
    public double getX(){
        return this.getPosition().getX();
    }
    public double getY(){
        return this.getPosition().getY();
    }
    public double getWidth(){
        return this.getScale().getX();
    }
    public double getHeight(){
        return this.getScale().getY();
    }

    public Setup getWindowSetup(){
        return windowSetup;
    }

    public void setEventManager(SceneEventManager eventManager){
        this.eventManager = eventManager;
    }
    public void setSceneManager(SceneManager sceneManager){
        this.sceneManager = sceneManager;
    }
    public void setTransform(Transform transform){
        this.transform = transform;
    }
    public void setPosition(Vector2D position){
        this.getTransform().setPosition(position);
    }
    public void setRotation(double rotation){
        this.getTransform().setRotation(rotation);
    }
    public void setScale(Vector2D scale){
        this.getTransform().setScale(scale);
    }
    public void setX(double x){
        this.getPosition().setX(x);
    }
    public void setY(double y){
        this.getPosition().setY(y);
    }
    public void setWidth(double width){
        this.getScale().setX(width);
    }
    public void setHeight(double height){
        this.getScale().setY(height);
    }

    public void setWindowSetup(Setup windowSetup){
        this.windowSetup = windowSetup;
    }
}
