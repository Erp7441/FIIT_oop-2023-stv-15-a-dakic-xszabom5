package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.ModalMenuModel;

public class ModalMenuView extends View{

    ModalMenuModel model = null;

    public ModalMenuView(){
        super(new ModalMenuModel());
    }

    public ModalMenuView(ModalMenuModel model){
        super(model);
    }

}
