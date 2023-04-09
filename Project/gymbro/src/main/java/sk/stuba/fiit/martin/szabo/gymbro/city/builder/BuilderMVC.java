package sk.stuba.fiit.martin.szabo.gymbro.city.builder;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.Controller;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.Model;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.View;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

public abstract class BuilderMVC{
    private Controller controller;
    private Model model;
    private View view;

    public BuilderMVC(Model model, View view, Controller controller){
        this.model = model;
        this.view = view;
        this.controller = controller;
    }

    public Controller build(){
        return this.getController();
    }

    public BuilderMVC addController(Controller controller){
        if(controller != null && this.getController() == null){
            this.setController(controller);
        }
        return this;
    }

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

    public BuilderMVC addTransform(Transform transform){
        this.getModel().setTransform(transform);
        return this;
    }

    public BuilderMVC addTexture(Image texture){
        this.getModel().setTexture(texture);
        return this;
    }

    public BuilderMVC addTexture(String texturePath){
        this.getModel().setTexture(texturePath);
        return this;
    }

    public Controller getController(){
        return controller;
    }

    public void setController(Controller controller){
        this.controller = controller;
    }

    public Model getModel(){
        return model;
    }

    public void setModel(Model model){
        this.model = model;
    }

    public View getView(){
        return view;
    }

    public void setView(View view){
        this.view = view;
    }
}
