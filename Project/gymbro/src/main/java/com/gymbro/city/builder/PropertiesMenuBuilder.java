package com.gymbro.city.builder;

import com.gymbro.city.controller.Controller;
import com.gymbro.city.controller.GymController;
import com.gymbro.city.controller.PropertiesMenuController;
import com.gymbro.city.model.Model;
import com.gymbro.city.model.PropertiesMenuModel;
import com.gymbro.city.view.PropertiesMenuView;
import com.gymbro.city.view.View;
import com.gymbro.utils.Property;
import com.gymbro.utils.Transform;
import javafx.scene.image.Image;
<<<<<<< HEAD
=======
import com.gymbro.city.controller.Controller;
import com.gymbro.city.controller.GymController;
import com.gymbro.city.controller.PropertiesMenuController;
import com.gymbro.city.model.Model;
import com.gymbro.city.model.PropertiesMenuModel;
import com.gymbro.city.view.PropertiesMenuView;
import com.gymbro.city.view.View;
import com.gymbro.utils.Property;
import com.gymbro.utils.Transform;
>>>>>>> 9079eeaea8be65203256d1a56dedc2d96de92a57

import java.util.ArrayList;

/**
 * The type Properties menu builder.
 */
public class PropertiesMenuBuilder extends BuilderMVC{

    /**
     * Instantiates a new Properties menu builder.
     */
    public PropertiesMenuBuilder(){
        super(new PropertiesMenuModel(), null, null);
        this.setView(new PropertiesMenuView(this.getModel()));
        this.setController(new PropertiesMenuController(this.getModel(), this.getView()));
    }

    /**
     * Instantiates a new Properties menu builder.
     *
     * @param model the model
     */
    public PropertiesMenuBuilder(PropertiesMenuModel model){
        super(model, new PropertiesMenuView(model), null);
        this.setController(new PropertiesMenuController(this.getModel(), this.getView()));
    }

    /**
     * Add properties properties menu builder.
     *
     * @param properties the properties
     * @return the properties menu builder
     */
    public PropertiesMenuBuilder addProperties(ArrayList<Property> properties){
        this.getModel().setProperties(properties);
        return this;
    }

    /**
     * Add property properties menu builder.
     *
     * @param property the property
     * @return the properties menu builder
     */
    public PropertiesMenuBuilder addProperty(Property property){
        if(this.getModel().getProperties() == null){
            this.getModel().setProperties(new ArrayList<>());
        }
        this.getModel().getProperties().add(property);
        return this;
    }

    /**
     * Add owner properties menu builder.
     *
     * @param owner the owner
     * @return the properties menu builder
     */
    public PropertiesMenuBuilder addOwner(GymController owner){
        this.getModel().setOwner(owner);
        return this;
    }

    //* Mandatory casting overrides
    @Override
    public PropertiesMenuController build(){
        return (PropertiesMenuController) super.build();
    }

    @Override
    public PropertiesMenuBuilder addController(Controller controller){
        if(controller instanceof PropertiesMenuController){
            return (PropertiesMenuBuilder) super.addController(controller);
        }
        return this;
    }

    @Override
    public PropertiesMenuBuilder addModel(Model model){
        if(model instanceof PropertiesMenuModel){
            return (PropertiesMenuBuilder) super.addModel(model);
        }
        return this;
    }

    @Override
    public PropertiesMenuBuilder addView(View view){
        if(view instanceof PropertiesMenuView){
            return (PropertiesMenuBuilder) super.addView(view);
        }
        return this;
    }

    @Override
    public PropertiesMenuBuilder addTransform(Transform transform){
        return (PropertiesMenuBuilder) super.addTransform(transform);
    }

    @Override
    public PropertiesMenuBuilder addTexture(Image texture){
        return (PropertiesMenuBuilder) super.addTexture(texture);
    }

    @Override
    public PropertiesMenuBuilder addTexture(String texturePath){
        return (PropertiesMenuBuilder) super.addTexture(texturePath);
    }

    @Override
    public PropertiesMenuController getController(){
        return (PropertiesMenuController) super.getController();
    }

    @Override
    public PropertiesMenuModel getModel(){
        return (PropertiesMenuModel) super.getModel();
    }

    @Override
    public PropertiesMenuView getView(){
        return (PropertiesMenuView) super.getView();
    }
}
