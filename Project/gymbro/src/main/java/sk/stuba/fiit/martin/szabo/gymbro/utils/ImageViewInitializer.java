package sk.stuba.fiit.martin.szabo.gymbro.utils;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageViewInitializer{

    private ImageView view;

    public ImageViewInitializer(){
        this.view = null;
    }

    public ImageView initialize(Image texture, Transform transform){
        this.setView(new ImageView(texture));
        this.getView().setTranslateX(transform.getPosition().getX());
        this.getView().setTranslateY(transform.getPosition().getY());
        this.getView().setFitWidth(transform.getScale().getX());
        this.getView().setFitHeight(transform.getScale().getY());
        this.getView().setPreserveRatio(false);
        return this.getView();
    }

    public ImageView getView(){
        return view;
    }

    public void setView(ImageView view){
        this.view = view;
    }
}
