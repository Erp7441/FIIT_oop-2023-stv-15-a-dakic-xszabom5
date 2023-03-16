package extensions;
import java.util.ArrayList;
import java.util.List;
import javafx.application.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import gui.*;
import game.*;

public privileged aspect FollowWarriorEnergy {
	Game game;
	
	// we're adding a list of observers and methods for adding and notifying observers to the Game class 
	transient private List<ClashFollower> Game.clashFollowers = new ArrayList<>();

	public void Game.followClash(ClashFollower clashFollower) {
		clashFollowers.add(clashFollower);
	}
	public void Game.notifyObservers() {
		for (ClashFollower c : clashFollowers)
			c.inform();
	}
	
	// we're adding a field that will hold the observer of the energy of the warriors to the window
	public EnergyOfWarriors ClashWindow.energyOfWarriors;

	// we need to acquire the Game object connected to the given window
	after() returning(Game g): cflow(call(ClashWindow.new(..))) && call(Game.new()) {
		game = g;
	}
	
	// the energy observer itself needs to be actually added to the window
	after() returning(ClashWindow o): call(ClashWindow.new(..)) {
		o.energyOfWarriors = new EnergyOfWarriors(game);
		game.followClash(o.energyOfWarriors);
		
		Platform.runLater(new Runnable(){
			public void run() {
				((FlowPane) ((ScrollPane) o.getScene().getRoot()).getContent()).getChildren().add(o.energyOfWarriors);
			}
		});
	}

	// observers have to be notified after executing certain methods of the Game class
	after(Game game): this(game)
		&& (execution(void Game.createWarriors(..))
				|| execution(String Game.game(..))
				|| execution(String Game.nextClash1on1(..))
				|| execution(void Game.load(..))) {
			game.notifyObservers();
	}
}
