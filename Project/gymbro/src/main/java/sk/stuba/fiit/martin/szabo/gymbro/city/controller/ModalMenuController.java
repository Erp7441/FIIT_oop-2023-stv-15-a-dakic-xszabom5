package sk.stuba.fiit.martin.szabo.gymbro.city.controller;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.ModalMenuModel;
import sk.stuba.fiit.martin.szabo.gymbro.city.view.ModalMenuView;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Renderable;

public class ModalMenuController implements Renderable{

    private ModalMenuModel model;
    private ModalMenuView view;

    public ModalMenuController(){
        this.model = new ModalMenuModel();
        this.view = new ModalMenuView(this.model);
    }

    public ModalMenuController(ModalMenuModel model){
        this.model = model;
        this.view = new ModalMenuView(this.model);
    }

    public ModalMenuController(ModalMenuModel model, ModalMenuView view){
        this.model = model;
        this.view = view;
    }

    @Override
    public void draw(){
        this.getView().draw();
    }

    @Override
    public void update(){
        // TODO:: Implement or remove
    }

    public ModalMenuModel getModel(){
        return model;
    }

    public void setModel(ModalMenuModel model){
        this.model = model;
    }

    public ModalMenuView getView(){
        return view;
    }

    public void setView(ModalMenuView view){
        this.view = view;
    }
}
