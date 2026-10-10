import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

import java.awt.*;

public class Probe_controller {

        @FXML
        private Label Szoveg;

        @FXML
        private ImageView szekKep0;
        @FXML
        private ImageView szekKep1;

        @FXML
        private ImageView szekKep2;

        @FXML
        private ImageView szekKep3;

        @FXML
        private ImageView szekKep4;

        @FXML
        private ImageView szekKep41;

        @FXML
        private ImageView szekKep42;

        @FXML
        private ImageView szekKep43;

        @FXML
        private ImageView szekKep44;

        @FXML
        private ImageView szekKep5;


        @FXML
        void SzekLefoglalas(ActionEvent event) {
            Button melyikGomb = (Button) event.getSource();
            ImageView aktualisSzek = (ImageView) melyikGomb.getGraphic();
            if (aktualisSzek.getEffect() == null)
            {
                Szoveg.setText("Lefoglaltad az xy. széket");
                ColorAdjust foglalt = new ColorAdjust();
                foglalt.setHue(-0.69);
                foglalt.setBrightness(0.21);
                foglalt.setSaturation(0.47);
                aktualisSzek.setEffect(foglalt);

            }
            else {
                aktualisSzek.setEffect(null);
                Szoveg.setText("Nincs még lefoglalt széked");
            }



        }

}
