package sodukuModel;

import java.awt.Paint;
import java.util.Map;

import com.sun.prism.paint.Color;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class SodukuGame extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();

// Solve Button
		Button button1 = new Button("Solve");
		
// Clear Button
		Button button2 = new Button("Clear");

// Box to hold Buttons
		HBox hbox = new HBox(10, button1, button2);
		hbox.setPadding(new Insets(10));
		hbox.setStyle("-fx-background-color: lightblue; -fx-text-fill: white;");
		
		// Setting the grid as scene
		Scene scene = new Scene(root, 500, 600);
		
// Grid
//		double a = scene.getWidth();
//		double b = scene.getHeight();
		double a=500;
		double b=500;
		TilePane grid = new TilePane(9, 9);
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(10));
		grid.setMinSize(a, b);
		grid.setMaxSize(a, b);
				
// Adding textfields to the grid
		for(int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
			TextField text=new TextField();
			text.setAlignment(Pos.CENTER);
			text.setPrefSize(40, 40);
			if((i<3||j<3 && i>5||j>5) && (i>3||j<3 && i<5||j>5) && (i<3||j>3 && i>5||j<5) || ((i>2) && (i<6) && (j<6) && (j>2))) {
			text.setStyle("-fx-background-color: orange; -fx-text-fill: black;");
			}			
			else {
				text.setStyle("-fx-background-color: white; -fx-text-fill: black;");
			}
			grid.getChildren().add(text);
		}
		}
		root.setCenter(grid);
		root.setBottom(hbox);
		primaryStage.setTitle("Soduku Solver");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
