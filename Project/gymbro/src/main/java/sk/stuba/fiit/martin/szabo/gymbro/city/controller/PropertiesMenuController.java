package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.PropertiesMenuModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.PropertiesMenuView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;

import java.util.ArrayList;

public class PropertiesMenuController extends Controller{

    public PropertiesMenuController(PropertiesMenuModel model){
        super(model, new PropertiesMenuView(model));
    }
    public PropertiesMenuController(PropertiesMenuModel model, PropertiesMenuView view){
        super(model, view);
    }

    public ArrayList<Property> getProperties(){
        return ((PropertiesMenuModel) this.getModel()).getProperties();
    }

    public void setProperties(ArrayList<Property> properties){
        ((PropertiesMenuModel) this.getModel()).setProperties(properties);
    }

    public GymController getOwner(){
        return ((PropertiesMenuModel) this.getModel()).getOwner();
    }

    public void setOwner(GymController owner){
        ((PropertiesMenuModel) this.getModel()).setOwner(owner);
    }
}
