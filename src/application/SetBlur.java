package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SetBlur {


	public void cambiarVentana() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista.fxml"));
			// BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root,700,700);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public void cerrarVentana() {
		System.exit(0);
	}
	
}
