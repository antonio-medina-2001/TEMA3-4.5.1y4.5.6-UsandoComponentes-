
package usandoTemporizador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import temporizador.Temporizador;

public class UsandoTemporizadorController implements Initializable {

    @FXML
    private Temporizador temporizadorPrueba;
    @FXML
    private Label estado;

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        temporizadorPrueba.setTiempo(5);
        temporizadorPrueba.iniciar();
    }
    
    @FXML
    private void escribe(ActionEvent event) {
        estado.setText("Estado temporizador. FIN");
    }

   
   
}
