package com.gymbro.city.builder;

import com.gymbro.city.controller.Controller;
import com.gymbro.city.controller.GymController;
import com.gymbro.city.controller.PropertiesMenuController;
import com.gymbro.city.model.GymModel;
import com.gymbro.city.model.Model;
import com.gymbro.city.view.GymView;
import com.gymbro.city.view.View;
import com.gymbro.utils.Transform;
import javafx.scene.image.Image;

/**
 * The type Gym builder.
 */
public class GymBuilder extends BuilderMVC{

    /**
     * Instantiates a new Gym builder.
     */
    public GymBuilder(){
        super(new GymModel(), null, null);
        this.setView(new GymView(this.getModel()));
        this.setController(new GymController(this.getModel(), this.getView()));
    }

    /**
     * Instantiates a new Gym builder.
     *
     * @param model the model
     */
    public GymBuilder(GymModel model){
        super(model, new GymView(model), null);
        this.setController(new GymController(this.getModel(), this.getView()));
    }

    /**
     * Add properties menu gym builder.
     *
     * @param menu the menu
     * @return the gym builder
     */
    public GymBuilder addPropertiesMenu(PropertiesMenuController menu){
        this.getModel().setPropertiesMenu(menu);
        menu.setOwner(this.getController());
        return this;
    }

    /**
     * Add amount of equipment gym builder.
     *
     * @param amount the amount
     * @return the gym builder
     */
    public GymBuilder addAmountOfEquipment(int amount){
        this.getModel().setAmountOfEquipment(amount);
        return this;
    }

    /**
     * Make clickable gym builder.
     *
     * @return the gym builder
     */
    public GymBuilder makeClickable(){
        this.getController().makeClickable();
        return this;
    }

    /**
     * Make hoverable gym builder.
     *
     * @return the gym builder
     */
    public GymBuilder makeHoverable(){
        this.getController().makeHoverable();
        return this;
    }

    /**
     * Make interactive gym builder.
     *
     * @return the gym builder
     */
    public GymBuilder makeInteractive(){
        return this.makeClickable().makeHoverable();
    }

    //* Mandatory casting overrides
    @Override
    public GymController build(){
        return (GymController) super.build();
    }

    @Override
    public GymBuilder addController(Controller controller){
        if(controller instanceof GymController){
            return (GymBuilder) super.addController(controller);
        }
        return this;
    }

    @Override
    public GymBuilder addModel(Model model){
        if(model instanceof GymModel){
            return (GymBuilder) super.addModel(model);
        }
        return this;
    }

    @Override
    public GymBuilder addView(View view){
        if(view instanceof GymView){
            return (GymBuilder) super.addView(view);
        }
        return this;
    }

    @Override
    public GymBuilder addTransform(Transform transform){
        return (GymBuilder) super.addTransform(transform);
    }

    @Override
    public GymBuilder addTexture(Image texture){
        return (GymBuilder) super.addTexture(texture);
    }

    @Override
    public GymBuilder addTexture(String texturePath){
        return (GymBuilder) super.addTexture(texturePath);
    }

    @Override
    public GymController getController(){
        return (GymController) super.getController();
    }

    @Override
    public GymModel getModel(){
        return (GymModel) super.getModel();
    }

    @Override
    public GymView getView(){
        return (GymView) super.getView();
    }

}

