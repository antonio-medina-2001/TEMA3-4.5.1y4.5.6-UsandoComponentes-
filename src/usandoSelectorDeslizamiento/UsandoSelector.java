package usandoSelectorDeslizamiento;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UsandoSelector extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/usandoSelectorDeslizamiento/UsandoSelector.fxml"));
        VBox vbox = fxmlLoader.load();
        Scene scene = new Scene(vbox);
        
        
        stage.setTitle("Usando mis controles - Selector Deslizamiento");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
