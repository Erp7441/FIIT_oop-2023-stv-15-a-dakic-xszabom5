package sk.stuba.fiit.martin.szabo.gymbro.city.builder;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.MapController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.GymModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.GymView;
import sk.stuba.fiit.martin.szabo.gymbro.menu.ModalMenu;
import sk.stuba.fiit.martin.szabo.gymbro.utils.ImageViewInitializer;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

public class GymBuilder{
    private GymController controller;
    private GymModel model;
    private GymView view;

    public GymBuilder(){
        this.model = new GymModel();
        this.view = new GymView(this.model);
        this.controller = new GymController(this.model, this.view);
    }

    public GymBuilder(GymModel model){
        this.model = model;
        this.view = new GymView(this.model);
        this.controller = new GymController(this.model, this.view);
    }

    public GymBuilder(GymModel model, GymView view, GymController controller){
        this.model = model;
        this.view = view;
        this.controller = controller;
    }

    public GymController build(){
        return this.getController();
    }

    public GymBuilder addController(GymController controller){
        if(controller != null && this.getController() == null){
            this.setController(controller);
        }
        return this;
    }

    public GymBuilder addModel(GymModel model){
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

    public GymBuilder addView(GymView view){
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

    public GymBuilder addTransform(Transform transform){
        this.getModel().setTransform(transform);
        return this;
    }

    public GymBuilder addTexture(Image texture){
        this.getModel().setTexture(texture);

        // Image view for texture

        this.getModel().setImageView(new ImageViewInitializer().initialize(
                this.getModel().getTexture(),
                this.getModel().getTransform()
            )
        );
        return this;
    }

    public GymBuilder addTexture(String texturePath){
        this.getModel().setTexture(texturePath);

        // Image view for texture
        this.getModel().setImageView(new ImageViewInitializer().initialize(
                this.getModel().getTexture(),
                this.getModel().getTransform()
            )
        );
        return this;
    }

    public GymBuilder addAmountOfEquipment(int amount){
        this.getModel().setAmountOfEquipment(amount);
        return this;
    }

    public GymBuilder addMenu(ModalMenu menu){
        this.getModel().setMenu(menu);
        return this;
    }

    public GymBuilder makeClickable(){
        this.getController().makeClickable();
        return this;
    }

    //**** Getters ****//
    public GymController getController(){
        return controller;
    }
    public GymModel getModel(){
        return model;
    }
    public GymView getView(){
        return view;
    }

    //**** Setters ****//
    private void setModel(GymModel model){
        this.model = model;
    }
    private void setView(GymView view){
        this.view = view;
    }
    private void setController(GymController controller){
        this.controller = controller;
    }
}
