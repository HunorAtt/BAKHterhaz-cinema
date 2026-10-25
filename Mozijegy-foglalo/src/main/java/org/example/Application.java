package org.example;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.h2.tools.Server;
import javafx.scene.Parent;

public class Application extends javafx.application.Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("/META-INF/FXML-ek/FXMLMoziJegyFoglalas.fxml"));

            primaryStage.setTitle("Mozijegy Foglaló");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
