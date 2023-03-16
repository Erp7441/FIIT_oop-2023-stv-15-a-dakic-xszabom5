package gui;

import game.*;
import characters.*;
import javafx.application.*;
import javafx.concurrent.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.layout.*;
import javafx.stage.*;
//import javafx.event.*;
import java.io.*;
import java.util.*;

public class ClashWindow extends Stage {
	private Button createWarriorsButton = new Button("Create Warriors");
	private Button initClashButton = new Button("Initiialize Clash");
	private Button nextClashButton = new Button("Next Clash");
	private Button clashButton = new Button("Full Clash");
	private Button saveButton = new Button("Save");
	private Button loadButton = new Button("Load");
	private TextField knights = new TextField();
	private TextField braveKnights = new TextField();
	private TextField badOgres = new TextField();
	private TextField warriorType = new TextField();
	private Label knightsLabel = new Label("Knights");
	private Label braveKnightsLabel = new Label("Brave knights");
	private Label badOgresLabel = new Label("Bad ogres");
	private TextArea output = new TextArea();
	private ScrollPane scroll = new ScrollPane();

	private EnergyOfWarriors energyOfWarriors;
	
	public ClashWindow() {
		super();
		
		setTitle("Clash");
		
		FlowPane pane = new FlowPane();
		
		Game game = new Game();
		
		pane.getChildren().add(createWarriorsButton);
		pane.getChildren().add(initClashButton);
		pane.getChildren().add(nextClashButton);
		pane.getChildren().add(clashButton);
		pane.getChildren().add(saveButton);
		pane.getChildren().add(loadButton);
		pane.getChildren().add(knights);
		pane.getChildren().add(knightsLabel);
		pane.getChildren().add(braveKnights);
		pane.getChildren().add(braveKnightsLabel);
		pane.getChildren().add(badOgres);
		pane.getChildren().add(badOgresLabel);
		pane.getChildren().add(output);
		pane.getChildren().add(warriorType);
		
		scroll.setContent(pane);		
		
		createWarriorsButton.setOnAction(e -> {
			game.createWarriors(Integer.parseInt(knights.getText()),
					Integer.parseInt(braveKnights.getText()),
					Integer.parseInt(badOgres.getText()),
					new AlternateSwordsSquadGameSetup());
			output.clear();
			output.appendText("Warriors created.\n");
		});

		initClashButton.setOnAction(e -> {
			output.appendText("\n" + "Ready for the next clash.\n\n");
			game.initClash();
		});
		
		nextClashButton.setOnAction(e -> {
				output.appendText(game.nextClash1on1());
 		});

 		clashButton.setOnAction(e -> {
		    Task<String> t = new Task<String>() {
 				protected String call() {
 					return game.clash();
 				}
 				protected void succeeded() {
 					Platform.runLater(() -> output.appendText(getValue()));
 				}
 			};
			
 			Thread th = new Thread(t);

 			th.setDaemon(true);
 			th.start();
 		});
 		
  		saveButton.setOnAction(e -> {
			try {
				game.save();
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
 		
 		loadButton.setOnAction(e -> {
			try {
				game.load();
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	
 		energyOfWarriors = new EnergyOfWarriors(game);
		game.followClash(energyOfWarriors);
		pane.getChildren().add(energyOfWarriors);

		setScene(new Scene(scroll, 500, 300));
		show();
	}
}
