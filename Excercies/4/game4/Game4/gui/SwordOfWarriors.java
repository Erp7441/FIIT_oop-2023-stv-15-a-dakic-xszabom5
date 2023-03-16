package gui;

import characters.Sword;
import game.ClashFollower;
import game.Game;
import javafx.scene.control.TextField;

public class SwordOfWarriors extends TextField implements ClashFollower{
    private Game game;
    private Sword sword;

    public SwordOfWarriors(Game game) {
        super();
        this.game = game;
    }

    public void inform() {

        for (int i = 0; i < game.getNumberOfWarriors(); ++i){
            sword = game.getKnight(i).getSword();
            setText(sword.toString());
        }
    }
}
