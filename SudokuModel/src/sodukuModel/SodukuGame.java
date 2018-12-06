package sodukuModel;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SodukuGame extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		
		Scene scene = new Scene(root, 600, 600);
		primaryStage.setTitle("Soduko");
		primaryStage.setScene(scene);
		Button button1 = new Button("Solve");
		Button button2 = new Button("Clear");
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
