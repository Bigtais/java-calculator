package com.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label formulaText;

    @FXML
    private Label resultText;

    @FXML
    protected void onEqualButtonClick() {
        resultText.setText("ok");
    }
}