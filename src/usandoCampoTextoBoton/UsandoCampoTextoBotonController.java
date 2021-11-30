package usandoCampoTextoBoton;

import campotextoboton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class UsandoCampoTextoBotonController implements Initializable {

    @FXML
    private CampoTextoBoton ctbNombre;
    @FXML
    private CampoTextoBoton ctbApellido;
    @FXML
    private Label lbFinal;
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lbFinal.setText("Pulsa boton y muestra texto en esta etiqueta");
        ctbNombre.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
                lbFinal.setText("Se ha grabado: " + ctbNombre.getText());
            }
        });
        ctbApellido.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
                lbFinal.setText("Se ha grabado: " + ctbApellido.getText());
            }
        });
    }
    
    
}
