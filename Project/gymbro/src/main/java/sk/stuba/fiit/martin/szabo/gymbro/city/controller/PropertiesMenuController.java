package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.PropertiesMenuModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.PropertiesMenuView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;

import java.util.ArrayList;

/**
 * The type Properties menu controller.
 */
public class PropertiesMenuController extends Controller{

    /**
     * Instantiates a new Properties menu controller.
     *
     * @param model the model
     */
    public PropertiesMenuController(PropertiesMenuModel model){
        super(model, new PropertiesMenuView(model));
    }

    /**
     * Instantiates a new Properties menu controller.
     *
     * @param model the model
     * @param view  the view
     */
    public PropertiesMenuController(PropertiesMenuModel model, PropertiesMenuView view){
        super(model, view);
    }

    /**
     * Get properties array list.
     *
     * @return the array list
     */
    public ArrayList<Property> getProperties(){
        return ((PropertiesMenuModel) this.getModel()).getProperties();
    }

    /**
     * Set properties.
     *
     * @param properties the properties
     */
    public void setProperties(ArrayList<Property> properties){
        ((PropertiesMenuModel) this.getModel()).setProperties(properties);
    }

    /**
     * Get owner gym controller.
     *
     * @return the gym controller
     */
    public GymController getOwner(){
        return ((PropertiesMenuModel) this.getModel()).getOwner();
    }

    /**
     * Set owner.
     *
     * @param owner the owner
     */
    public void setOwner(GymController owner){
        ((PropertiesMenuModel) this.getModel()).setOwner(owner);
    }
}
