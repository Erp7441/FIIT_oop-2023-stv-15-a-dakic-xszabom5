package com.gymbro.city.builder;

import com.gymbro.city.controller.Controller;
import com.gymbro.city.model.Model;
import com.gymbro.city.view.View;
import com.gymbro.utils.Transform;
import javafx.scene.image.Image;


/**
 * The type Builder mvc.
 */
public abstract class BuilderMVC{
    private Controller controller;
    private Model model;
    private View view;

    /**
     * Instantiates a new Builder mvc.
     *
     * @param model      the model
     * @param view       the view
     * @param controller the controller
     */
    public BuilderMVC(Model model, View view, Controller controller){
        this.model = model;
        this.view = view;
        this.controller = controller;
    }

    /**
     * Build controller.
     *
     * @return the controller
     */
    public Controller build(){
        return this.getController();
    }

    /**
     * Add controller builder mvc.
     *
     * @param controller the controller
     * @return the builder mvc
     */
    public BuilderMVC addController(Controller controller){
        if(controller != null && this.getController() == null){
            this.setController(controller);
        }
        return this;
    }

    /**
     * Add model builder mvc.
     *
     * @param model the model
     * @return the builder mvc
     */
    public BuilderMVC addModel(Model model){
        if(model == null) return this;

        if(this.getModel() == null && this.getController().getModel() == null){
            this.setModel(model);
            this.getController().setModel(model);
        }
        else if(this.getModel() == null && this.getController().getModel() != null){
            this.setModel(this.getController().getModel());
        }
        return this;
    }

    /**
     * Add view builder mvc.
     *
     * @param view the view
     * @return the builder mvc
     */
    public BuilderMVC addView(View view){
        if(view == null) return this;

        if(this.getView() == null && this.getController().getView() == null){
            this.setView(view);
            this.getController().setView(view);
        }
        else if(this.getView() == null && this.getController().getView() != null){
            this.setView(this.getController().getView());
        }
        return this;
    }

    /**
     * Add transform builder mvc.
     *
     * @param transform the transform
     * @return the builder mvc
     */
    public BuilderMVC addTransform(Transform transform){
        this.getModel().setTransform(transform);
        return this;
    }

    /**
     * Add texture builder mvc.
     *
     * @param texture the texture
     * @return the builder mvc
     */
    public BuilderMVC addTexture(Image texture){
        this.getModel().setTexture(texture);
        return this;
    }

    /**
     * Add texture builder mvc.
     *
     * @param texturePath the texture path
     * @return the builder mvc
     */
    public BuilderMVC addTexture(String texturePath){
        this.getModel().setTexture(texturePath);
        return this;
    }

    /**
     * Get controller controller.
     *
     * @return the controller
     */
    public Controller getController(){
        return controller;
    }

    /**
     * Set controller.
     *
     * @param controller the controller
     */
    public void setController(Controller controller){
        this.controller = controller;
    }

    /**
     * Get model model.
     *
     * @return the model
     */
    public Model getModel(){
        return model;
    }

    /**
     * Set model.
     *
     * @param model the model
     */
    public void setModel(Model model){
        this.model = model;
    }

    /**
     * Get view view.
     *
     * @return the view
     */
    public View getView(){
        return view;
    }

    /**
     * Set view.
     *
     * @param view the view
     */
    public void setView(View view){
        this.view = view;
    }
}
