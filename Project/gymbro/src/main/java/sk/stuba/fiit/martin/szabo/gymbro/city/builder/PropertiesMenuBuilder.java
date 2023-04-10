package sk.stuba.fiit.martin.szabo.gymbro.city.builder;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.Controller;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.PropertiesMenuController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.PropertiesMenuModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.Model;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.PropertiesMenuView;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.View;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;

public class PropertiesMenuBuilder extends BuilderMVC{

    public PropertiesMenuBuilder(){
        super(new PropertiesMenuModel(), null, null);
        this.setView(new PropertiesMenuView(this.getModel()));
        this.setController(new PropertiesMenuController(this.getModel(), this.getView()));
    }

    public PropertiesMenuBuilder(PropertiesMenuModel model){
        super(model, new PropertiesMenuView(model), null);
        this.setController(new PropertiesMenuController(this.getModel(), this.getView()));
    }

    public PropertiesMenuBuilder addProperties(ArrayList<Property> properties){
        this.getModel().setProperties(properties);
        return this;
    }

    public PropertiesMenuBuilder addProperty(Property property){
        if(this.getModel().getProperties() == null){
            this.getModel().setProperties(new ArrayList<>());
        }
        this.getModel().getProperties().add(property);
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
