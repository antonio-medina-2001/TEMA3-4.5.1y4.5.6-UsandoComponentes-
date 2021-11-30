package usandoCampoTextoBoton;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class UsandoCampoTextoBoton extends Application {
    @Override
    public void start(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UsandoCampoTextoBoton.fxml"));
        Parent root = fxmlLoader.load();

        // La añadimos a la escena
        Scene scene = new Scene(root);
        
        stage.setTitle("Usando mis controles - Campo Texto Boton");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
