package extensions;
import gui.*;
import characters.*;
import game.*;
import javafx.application.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public privileged aspect AddingShieldsToKnights {
	ClashWindow window;
	
	boolean Knight.shield; // each knight will have an indicator of whether he is protected by a shield
	private CheckBox ClashWindow.shieldSwitch = new CheckBox("Add shields to knights"); // a checkbox will enable switching the protection by shields on and off - added only as a window field (attribute)
	
	// if a knight has his shield protection on, there will be no revenge
	void around(Knight k): call(* Ogre+.revenge(..)) && args(k) {
		if (!k.shield)
			proceed(k);
	}
	
	// the checkbox needs to be actually added to the window
	after() returning(ClashWindow o): call(ClashWindow.new(..)) {
		window = o;
		Platform.runLater(new Runnable(){
			public void run() {
				((FlowPane) ((ScrollPane) o.getScene().getRoot()).getContent()).getChildren().add(o.shieldSwitch);
			}
		});
	}
	
	// whether the shields are on is tracked after the initialization: if it is on, all knights get their shield protection indicators on
	after(Game game): call(void Game.createWarriors(..)) && target(game) {
		if (window.shieldSwitch.isSelected()) {
			for (Knight r : game.knights)
				r.shield = true;
		}
	}
}
