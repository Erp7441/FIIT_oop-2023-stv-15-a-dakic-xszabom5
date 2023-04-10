package sk.stuba.fiit.martin.szabo.gymbro.city.builder;

import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.Controller;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.PropertiesMenuController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.GymModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.Model;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.GymView;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.View;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

public class GymBuilder extends BuilderMVC{

    public GymBuilder(){
        super(new GymModel(), null, null);
        this.setView(new GymView(this.getModel()));
        this.setController(new GymController(this.getModel(), this.getView()));
    }

    public GymBuilder(GymModel model){
        super(model, new GymView(model), null);
        this.setController(new GymController(this.getModel(), this.getView()));
    }

    public GymBuilder addPropertiesMenu(PropertiesMenuController menu){
        this.getModel().setPropertiesMenu(menu);
        return this;
    }

    public GymBuilder addAmountOfEquipment(int amount){
        this.getModel().setAmountOfEquipment(amount);
        return this;
    }

    public GymBuilder makeClickable(){
        this.getController().makeClickable();
        return this;
    }

    public GymBuilder makeHoverable(){
        this.getController().makeHoverable();
        return this;
    }

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

