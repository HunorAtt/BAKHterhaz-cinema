package org.example.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

public class Probe_controller {

        int lefoglaltSzekekSzama = 0;

        @FXML
        private Label pontok;


    @FXML
    void LefoglaltniAHelyet(ActionEvent event) {

    }

        @FXML
        void SzekLefoglalas(ActionEvent event) {

            Button melyikGomb = (Button) event.getSource();
            ImageView aktualisSzek = (ImageView) melyikGomb.getGraphic();
            if (aktualisSzek.getEffect() == null)
            {
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


            }



        }

}
