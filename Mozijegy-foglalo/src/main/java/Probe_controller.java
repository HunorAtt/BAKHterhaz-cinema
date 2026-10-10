import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;

import java.awt.*;

public class Probe_controller {

    void szekFoglalasMetodus()
    {
        ColorAdjust foglalt = new ColorAdjust();
        foglalt.setHue(-0.69);
        foglalt.setBrightness(0.21);
        foglalt.setSaturation(0.47);
        if (szekKep.getEffect() != null)
        {
            szekKep.setEffect(null);
            Szoveg.setText("Nincs még lefoglalt széked");
        }
        else {
            Szoveg.setText("Lefoglaltad az xy. széket");
            szekKep.setEffect(foglalt);
        }
    }

        @FXML
        private Label Szoveg;

        @FXML
        private ImageView szekKep;
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
            szekFoglalasMetodus();



        }

}
