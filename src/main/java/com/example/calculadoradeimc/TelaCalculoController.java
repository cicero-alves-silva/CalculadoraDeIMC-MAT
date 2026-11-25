package com.example.calculadoradeimc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaCalculoController {

    @FXML
    private Label lbResultado;

    @FXML
    private TextField tfAltura;

    @FXML
    private TextField tfPeso;

    @FXML
    void cliqueCalcular(ActionEvent event) {
        String pesoString = tfPeso.getText().replace(",", ".");
        String alturaString = tfAltura.getText().replace(",", ".");
        if (pesoString.isBlank() || alturaString.isBlank()) {
            lbResultado.setText("Informe os valores antes de calcular.");
            lbResultado.setStyle("-fx-text-fill: #B22222");
        } else {
            try {
                double peso = Double.parseDouble(pesoString);
                double altura = Double.parseDouble(alturaString);
                if (peso > 0 && altura > 0) {

                } else {
                    lbResultado.setText("Digite apenas números reais " +
                            "positivos para peso e/ou altura.");
                    lbResultado.setStyle("-fx-text-fill: #B22222");
                }
            } catch (NumberFormatException nfe) {
                lbResultado.setText("Digite apenas números reais " +
                        "positivos para peso e/ou altura.");
                lbResultado.setStyle("-fx-text-fill: #B22222");
            }
        }
    }

    @FXML
    void cliqueVoltar(ActionEvent event) {
        tfAltura.clear();
        tfPeso.clear();
        lbResultado.setText("");
        IMCApplication.trocarTela("PRINCIPAL", null);
    }

}
