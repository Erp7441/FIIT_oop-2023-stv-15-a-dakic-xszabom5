package sk.stuba.fiit.martin.szabo.gymbro.city.builder;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.Controller;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.ModalMenuController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.ModalMenuModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.Model;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.ModalMenuView;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.View;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;

public class ModalMenuBuilder extends BuilderMVC{

    public ModalMenuBuilder(){
        super(new ModalMenuModel(), null, null);
        this.setView(new ModalMenuView(this.getModel()));
        this.setController(new ModalMenuController(this.getModel(), this.getView()));
    }

    public ModalMenuBuilder(ModalMenuModel model){
        super(model, new ModalMenuView(model), null);
        this.setController(new ModalMenuController(this.getModel(), this.getView()));
    }

    public ModalMenuBuilder addProperties(ArrayList<Property> properties){
        this.getModel().setProperties(properties);
        return this;
    }

    public ModalMenuBuilder addProperty(Property property){
        if(this.getModel().getProperties() == null){
            this.getModel().setProperties(new ArrayList<>());
        }
        this.getModel().getProperties().add(property);
        return this;
    }


    //* Mandatory casting overrides
    @Override
    public ModalMenuController build(){
        return (ModalMenuController) super.build();
    }

    @Override
    public ModalMenuBuilder addController(Controller controller){
        if(controller instanceof ModalMenuController){
            return (ModalMenuBuilder) super.addController(controller);
        }
        return this;
    }

    @Override
    public ModalMenuBuilder addModel(Model model){
        if(model instanceof ModalMenuModel){
            return (ModalMenuBuilder) super.addModel(model);
        }
        return this;
    }

    @Override
    public ModalMenuBuilder addView(View view){
        if(view instanceof ModalMenuView){
            return (ModalMenuBuilder) super.addView(view);
        }
        return this;
    }

    @Override
    public ModalMenuBuilder addTransform(Transform transform){
        return (ModalMenuBuilder) super.addTransform(transform);
    }

    @Override
    public ModalMenuBuilder addTexture(Image texture){
        return (ModalMenuBuilder) super.addTexture(texture);
    }

    @Override
    public ModalMenuBuilder addTexture(String texturePath){
        return (ModalMenuBuilder) super.addTexture(texturePath);
    }

    @Override
    public ModalMenuController getController(){
        return (ModalMenuController) super.getController();
    }

    @Override
    public ModalMenuModel getModel(){
        return (ModalMenuModel) super.getModel();
    }

    @Override
    public ModalMenuView getView(){
        return (ModalMenuView) super.getView();
    }
}
