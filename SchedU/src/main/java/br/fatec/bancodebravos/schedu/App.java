package br.fatec.bancodebravos.schedu;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/br/fatec/bancodebravos/schedu/Painel.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/br/fatec/bancodebravos/css/Painel.css").toExternalForm());
			primaryStage.setTitle("API FATEC 2ºBD - Banco de Bravos APP Solution");
			Image icon = new Image(getClass().getResourceAsStream("/br/fatec/bancodebravos/imagens/logo.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
