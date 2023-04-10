package sk.stuba.fiit.martin.szabo.gymbro.handlers;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

public class ImageViewHandler{

    private ImageView view;

    public ImageViewHandler(){
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
