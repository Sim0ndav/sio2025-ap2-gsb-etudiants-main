package fr.pgah.Controllers;

import fr.pgah.AccesBdd.AccesBdd;
import fr.pgah.Logger.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PageConnexionController {

    @FXML
    private Button btn_connexion;

    @FXML
    private TextField id_login;

    @FXML
    private TextField id_password;

    @FXML
    void btnConnexion(ActionEvent event) {

        String identifiant = id_login.getText();
        String motDePasse = id_password.getText();

        boolean identifiantsValides = AccesBdd.verifierIdentifiants(identifiant, motDePasse);

        if (identifiantsValides) {
            Logger.log("Connexion réussie !");
        } else {
            Logger.log("Identifiant ou mot de passe incorrect !");
        }

    }
}