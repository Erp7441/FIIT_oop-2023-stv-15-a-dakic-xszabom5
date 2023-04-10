package sk.stuba.fiit.martin.szabo.gymbro.city.builder;


import javafx.scene.image.Image;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.Controller;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.FavoritesController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.FavoritesModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.Model;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.FavoritesView;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.View;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

/**
 * The type Favorites builder.
 */
public class FavoritesBuilder extends BuilderMVC{

    /**
     * Instantiates a new Favorites builder.
     */
    public FavoritesBuilder(){
        super(new FavoritesModel(), null, null);
        this.setView(new FavoritesView(this.getModel()));
        this.setController(new FavoritesController(this.getModel(), this.getView()));
    }

    /**
     * Instantiates a new Favorites builder.
     *
     * @param model the model
     */
    public FavoritesBuilder(FavoritesModel model){
        super(model, new FavoritesView(model), null);
        this.setController(new FavoritesController(this.getModel(), this.getView()));
    }

    /**
     * Add gym favorites builder.
     *
     * @param gym the gym
     * @return the favorites builder
     */
    public FavoritesBuilder addGym(GymController gym){
        ((FavoritesModel) this.getController().getModel()).getFavorites().add(gym);
        return this;
    }

    //* Mandatory casting overrides
    @Override
    public FavoritesController build(){
        return (FavoritesController) super.build();
    }

    @Override
    public FavoritesBuilder addController(Controller controller){
        if(controller instanceof FavoritesController){
            return (FavoritesBuilder) super.addController(controller);
        }
        return this;
    }

    @Override
    public FavoritesBuilder addModel(Model model){
        if(model instanceof FavoritesModel){
            return (FavoritesBuilder) super.addModel(model);
        }
        return this;
    }

    @Override
    public FavoritesBuilder addView(View view){
        if(view instanceof FavoritesView){
            return (FavoritesBuilder) super.addView(view);
        }
        return this;
    }

    @Override
    public FavoritesBuilder addTransform(Transform transform){
        return (FavoritesBuilder) super.addTransform(transform);
    }

    @Override
    public FavoritesBuilder addTexture(Image texture){
        return (FavoritesBuilder) super.addTexture(texture);
    }

    @Override
    public FavoritesBuilder addTexture(String texturePath){
        return (FavoritesBuilder) super.addTexture(texturePath);
    }

    @Override
    public FavoritesController getController(){
        return (FavoritesController) super.getController();
    }

    @Override
    public FavoritesModel getModel(){
        return (FavoritesModel) super.getModel();
    }

    @Override
    public FavoritesView getView(){
        return (FavoritesView) super.getView();
    }
}
