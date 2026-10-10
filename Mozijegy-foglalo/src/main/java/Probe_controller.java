import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Probe_controller {
        @FXML
        private Label Szoveg;

        @FXML
        void SzekLefoglalas(ActionEvent event) {
            Szoveg.setText("Lefoglaltad az xy. széket");

        }

}
