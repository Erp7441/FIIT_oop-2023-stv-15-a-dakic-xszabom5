package sk.stuba.fiit.martin.szabo.gymbro.window;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import sk.stuba.fiit.martin.szabo.gymbro.city.Map;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Vector2D;
import sk.stuba.fiit.martin.szabo.gymbro.Main;

public class MainMenuController{
    @FXML
    protected void startMap(){
        Vector2D mapPosition = new Vector2D(0,0);
        Vector2D mapSize = new Vector2D(Main.getStage().getWidth(), Main.getStage().getHeight());
        Transform mapTransform = new Transform(mapPosition, 0, mapSize);
        Map map = new Map(null, mapTransform, "assets/Bratislava_Map.png");

        MapController controller = new MapController(map);
        controller.showMap(Main.getStage());

    }
}
