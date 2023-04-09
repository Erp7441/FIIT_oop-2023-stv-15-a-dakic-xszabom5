package sk.stuba.fiit.martin.szabo.gymbro.city.view;

import sk.stuba.fiit.martin.szabo.gymbro.city.model.GymModel;

public class GymView extends View{

    public GymView(){
        super(new GymModel());
    }

    public GymView(GymModel model){
        super(model);
    }

    public void zoomIn(){
        this.getImageView().setFitWidth(this.getImageView().getFitWidth() * 2);
        this.getImageView().setFitHeight(this.getImageView().getFitHeight() * 2);
    }

    public void zoomOut(){
        this.getImageView().setFitWidth(this.getImageView().getFitWidth() / 2);
        this.getImageView().setFitHeight(this.getImageView().getFitHeight() / 2);
    }

}
