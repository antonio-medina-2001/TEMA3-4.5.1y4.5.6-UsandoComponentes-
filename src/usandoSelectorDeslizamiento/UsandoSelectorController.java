
package usandoSelectorDeslizamiento;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;

public class UsandoSelectorController implements Initializable {

    @FXML
    private Label lbFinal;
    @FXML
    private SelectorDeslizamiento selector1;
    @FXML
    private SelectorDeslizamiento selector2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selector1.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                lbFinal.setText("Pulsado el selector de arriba");
            }
        });
        
        selector2.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                lbFinal.setText("Pulsado el selector de abajo");
            }
        });
   
        
    }    
    
}
