package gui.controller;

import Operators.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;


public class ViewController implements Initializable {

    public ChoiceBox<IOperator> calculationTypeBox;
    public TextField firstNumberField;
    public TextField secondNumberField;
    public TextField resultField;

    @FXML
    private void handleCalculate(ActionEvent actionEvent) {
        String firstNumberString = firstNumberField.getText();
        String secondNumberString = secondNumberField.getText();
        if (firstNumberString.isEmpty() || secondNumberString.isEmpty() || calculationTypeBox.getSelectionModel().getSelectedItem()==null)
            return;

        int firstNumber = Integer.parseInt(firstNumberString);
        int secondNumber = Integer.parseInt(secondNumberString);

        int result = calculationTypeBox.getSelectionModel().getSelectedItem().calculate(firstNumber,secondNumber);
        resultField.setText(String.valueOf(result));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setupInputValidators();
        setupChoiceBox();
    }

    private void setupChoiceBox() {
        List<IOperator> operatorList =
                Arrays.asList(new SumOperator(),new SubtractionOperator(),
                        new MultiplicationAdapter(),new ExponentAdapter(),
                        new RootAdapter());
        calculationTypeBox.setItems(FXCollections.observableArrayList(operatorList));
    }

    private void setupInputValidators() {
        firstNumberField.setTextFormatter(integerValidator);
        secondNumberField.setTextFormatter(integerValidator2);
    }

    TextFormatter integerValidator = new TextFormatter<Object>(change -> {
        if (change.getText().matches("[0-9]*"))
            return change;
        return null;
    });

    TextFormatter integerValidator2 = new TextFormatter<Object>(change -> {
        if (change.getText().matches("[0-9]*"))
            return change;
        return null;
    });
}
