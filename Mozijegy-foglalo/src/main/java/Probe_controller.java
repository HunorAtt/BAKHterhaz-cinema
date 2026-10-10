import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;

public class Probe_controller {
        @FXML
        private Label Szoveg;

        @FXML
        private ImageView szekKep;

        @FXML
        void SzekLefoglalas(ActionEvent event) {
           if (szekKep.getEffect() != null)
           {
               szekKep.setEffect(null);
               Szoveg.setText("Nincs még lefoglalt széked");
           }
           else {
                   Szoveg.setText("Lefoglaltad az xy. széket");
                   ColorAdjust kijelolt = new ColorAdjust();
                   kijelolt.setHue(-0.8);
                   szekKep.setEffect(kijelolt);
           }



        }

}
