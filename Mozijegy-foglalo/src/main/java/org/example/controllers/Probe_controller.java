package org.example.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;

import java.io.IOException;

public class Probe_controller {

        int lefoglaltSzekekSzama = 0;

        @FXML
        private Label pontok;


    @FXML
    void LefoglaltniAHelyet(ActionEvent event) throws IOException {
            // 1. Betöltjük a második FXML fájlt
            Parent ujNezezet = FXMLLoader.load(getClass().getResource("/META-INF/FXML-ek/Lefoglalas.fxml"));

            // 2. A "pontok" felirat segítségével megfogjuk a jelenlegi ablakot, és lecseréljük a tartalmát
            pontok.getScene().setRoot(ujNezezet);

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
