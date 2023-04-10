package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.Main;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;
import sk.stuba.fiit.martin.szabo.gymbro.window.eventmanager.SceneEventManager;

import java.io.IOException;

public class Window{

    private static Window instance = null;
    private SceneManager sceneManager = null;
    private SceneEventManager eventManager = null;
    private Transform transform;

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
        this.getSceneManager().addPane("MainMenu", root);

        stage.setScene(this.getSceneManager().getScene());
        stage.setResizable(Constants.SCREEN_RESIZABLE);
        stage.setTitle(Constants.SCREEN_TITLE);
        stage.show();
        this.getSceneManager().setStage(stage);
        this.eventManager = new SceneEventManager(this.getSceneManager().getScene());
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
}
