package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button buttonOperationsResult;

    @FXML
    private Button buttonOperationsAddition;

    @FXML
    private Button buttonOperationsANS;

    @FXML
    private Button buttonOperationsProduct;

    @FXML
    private Button buttonOperationsPoint;

    @FXML
    private Button buttonOperationsClean;

    @FXML
    private Button buttonOperationsSubstraction;

    @FXML
    private Button buttonOperations4;

    @FXML
    private Button buttonOperations5;

    @FXML
    private Button buttonOperations2;

    @FXML
    private Button buttonOperations3;

    @FXML
    private Button buttonOperations0;

    @FXML
    private Button buttonOperations1;

    @FXML
    private Button buttonOperationsDivide;

    @FXML
    private Button buttonOperationsPercentage;

    @FXML
    private Button buttonOperationsDelete;

    @FXML
    private Button buttonOperations8;

    @FXML
    private Button buttonOperations9;

    @FXML
    private Button buttonOperations6;

    @FXML
    private TextField textfieldResult;

    @FXML
    private Button buttonOperations7;

    private Boolean operationOn = false;

    public void cleanScreen() {
        textfieldResult.setText("");
        operationOn = false;
    }

    public void deleteValue() {
        if (!(textfieldResult.getText().length() == 0)) {
            textfieldResult.setText(textfieldResult.getText().substring(0, textfieldResult.getText().length() - 1));
        }
    }

    public void makeOperation() {
        String sus = textfieldResult.getText();
        for (int i = 0; i < operationsInLine; i++) {
            int pos = sus.indexOf("+");
        }
    }

    public void getLastResult() {
    }

    public void addValue(javafx.event.ActionEvent actionEvent) {
        textfieldResult.setText(textfieldResult.getText() + ((Button) actionEvent.getSource()).getText());
        operationOn = true;
    }

    private int operationsInLine = 0;

    public void addOperation(javafx.event.ActionEvent actionEvent) {
        if (operationOn) {
            textfieldResult.setText(textfieldResult.getText() + ((Button) actionEvent.getSource()).getText());
            operationOn = false;
            operationsInLine++;
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String s = "5+6+4-3";
        System.out.println(s);
        s = s.substring(0, s.indexOf("+"));
        System.out.println(s);

        for (int i = 0; i < 3; i++) {

        }
    }
}

