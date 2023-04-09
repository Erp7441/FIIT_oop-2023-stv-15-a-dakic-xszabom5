package sk.stuba.fiit.martin.szabo.gymbro.city.builder;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.ModalMenuController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.ModalMenuModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.ModalMenuView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.util.ArrayList;

public class ModalMenuBuilder{

    private ModalMenuController controller;
    private ModalMenuModel model;
    private ModalMenuView view;

    public ModalMenuBuilder(){
        this.model = new ModalMenuModel();
        this.view = new ModalMenuView(this.model);
        this.controller = new ModalMenuController(this.model, this.view);
    }

    public ModalMenuBuilder(ModalMenuModel model){
        this.model = model;
        this.view = new ModalMenuView(this.model);
        this.controller = new ModalMenuController(this.model, this.view);
    }

    public ModalMenuBuilder(ModalMenuModel model, ModalMenuView view, ModalMenuController controller){
        this.model = model;
        this.view = view;
        this.controller = controller;
    }

    public ModalMenuController build(){
        return this.getController();
    }

    public ModalMenuBuilder addController(ModalMenuController controller){
        if(controller != null && this.getController() == null){
            this.setController(controller);
        }
        return this;
    }

    public ModalMenuBuilder addModel(ModalMenuModel model){
        if(model == null) return this;

        if(this.getModel() == null && this.getController().getModel() == null){
            this.setModel(model);
            this.getController().setModel(model);
        }
        else if(
            this.getModel() == null &&
            this.getController().getModel() != null &&
            this.getController().getModel() instanceof ModalMenuModel
        ){
            this.setModel((ModalMenuModel) this.getController().getModel());
        }
        return this;
    }

    public ModalMenuBuilder addView(ModalMenuView view){
        if(view == null) return this;

        if(this.getView() == null && this.getController().getView() == null){
            this.setView(view);
            this.getController().setView(view);
        }
        else if(
            this.getView() == null &&
            this.getController().getView() != null &&
            this.getController().getView() instanceof ModalMenuView
        ){
            this.setView((ModalMenuView) this.getController().getView());
        }
        return this;
    }

    public ModalMenuBuilder addTransform(Transform transform){
        this.getModel().setTransform(transform);
        return this;
    }

    public ModalMenuBuilder addTexture(Image texture){
        this.getModel().setTexture(texture);
        return this;
    }

    public ModalMenuBuilder addTexture(String texturePath){
        this.getModel().setTexture(texturePath);
        return this;
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

    public ModalMenuController getController(){
        return controller;
    }
    public ModalMenuModel getModel(){
        return model;
    }
    public ModalMenuView getView(){
        return view;
    }

    private void setModel(ModalMenuModel model){
        this.model = model;
    }
    private void setView(ModalMenuView view){
        this.view = view;
    }
    private void setController(ModalMenuController controller){
        this.controller = controller;
    }
}
