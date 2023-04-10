package sk.stuba.fiit.martin.szabo.gymbro.handlers;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

/**
 * The type Image view handler.
 */
public class ImageViewHandler{

    private ImageView view;

    /**
     * Instantiates a new Image view handler.
     */
    public ImageViewHandler(){
        this.view = null;
    }

    /**
     * Initialize image view.
     *
     * @param texture   the texture
     * @param transform the transform
     * @return the image view
     */
    public ImageView initialize(Image texture, Transform transform){
        this.setView(new ImageView(texture));
        this.getView().setTranslateX(transform.getPosition().getX());
        this.getView().setTranslateY(transform.getPosition().getY());
        this.getView().setFitWidth(transform.getScale().getX());
        this.getView().setFitHeight(transform.getScale().getY());
        this.getView().setPreserveRatio(false);
        return this.getView();
    }

    /**
     * Get view image view.
     *
     * @return the image view
     */
    public ImageView getView(){
        return view;
    }

    /**
     * Set view.
     *
     * @param view the view
     */
    public void setView(ImageView view){
        this.view = view;
    }
}
