package org.example.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.Parent;

import java.io.IOException;

public class LefoglalasController {

    @FXML
    private Label JegySzam;
    @FXML
    private Label JegySzam1;

    @FXML
    private Label JegySzam2;

    public void adatAtadas(int jegyekSzama) {
        JegySzam1.setText(jegyekSzama + " db");
        JegySzam2.setText(jegyekSzama+" x 2490 Ft");

        int ar = jegyekSzama * 2490;
        JegySzam.setText(" "+ar + " Ft");
    }
    @FXML
    void VisszaGomb(ActionEvent event) throws IOException {
        Parent regiKep = FXMLLoader.load(getClass().getResource("/META-INF/FXML-ek/FXMLMoziJegyFoglalas.fxml"));

        JegySzam.getScene().setRoot(regiKep);
    }

}
