package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.ModalMenuModel;

public class ModalMenuView{

    ModalMenuModel model = null;

    public ModalMenuView(){
        model = new ModalMenuModel();
    }

    public ModalMenuView(ModalMenuModel model){
        this.model = model;
    }

    public void draw(){}
}
