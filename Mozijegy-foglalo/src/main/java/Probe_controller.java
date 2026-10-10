import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

import java.awt.*;

public class Probe_controller {

        int lefoglaltSzekekSzama = 0;
        @FXML
        private Label Szoveg;

        @FXML
        private Label pontok;


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
                lefoglaltSzekekSzama++;
                pontok.setText(" "+lefoglaltSzekekSzama);
            }
            else {
                aktualisSzek.setEffect(null);
                lefoglaltSzekekSzama--;
                pontok.setText(" "+lefoglaltSzekekSzama);
                if(lefoglaltSzekekSzama == 0)
                {
                    Szoveg.setText("Nincs még lefoglalt széked");
                }

            }



        }

}
