package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.Main;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Constants;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;

import java.io.IOException;

public class Window{

    private static Window instance = null;
    private Stage stage = null;
    private Scene scene = null;
    private Transform transform;

    private Window(){
        this.transform = new Transform(
            null,
            0,
            new Vector2D(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT)
        );
    }

    public void start(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/mainMenu.fxml"));

        this.setStage(stage);
        this.setScene(new Scene(fxmlLoader.load(), this.getWidth(), this.getHeight()));
        stage.setScene(this.getScene());
        this.getStage().setResizable(Constants.SCREEN_RESIZABLE);

        stage.setTitle(Constants.SCREEN_TITLE);
        stage.show();
    }

    //* Getters
    public static Window getInstance(){
        if(Window.instance == null) Window.instance = new Window();
        return Window.instance;
    }
    public Stage getStage(){
        return stage;
    }
    public Scene getScene(){
        return scene;
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

    //* Setters
    public void setStage(Stage stage){
        this.stage = stage;
    }
    public void setScene(Scene scene){
        this.scene = scene;
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
