package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

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

    public void cleanScreen() {
        textfieldResult.setText("");
        lastNumberI = 0;
        lastNumberD = 0;
    }

    public void deleteValue() {
        if (!(textfieldResult.getText().length() == 0)) {
            textfieldResult.setText(textfieldResult.getText().substring(0, textfieldResult.getText().length() - 1));
        } else {
            lastNumberD = 0;
            lastNumberI = 0;
        }
    }

    public void makeOperation() {
        System.out.println("Resultado");

    }

    public void getLastResult() {

    }

    double lastNumberD = 0;
    int lastNumberI = 0;
    double actualNumberD = 0;
    int actualNumberI = 0;

    public void addOperation() {
        if (textfieldResult.getText().contains(".")) {
            actualNumberD = Double.parseDouble(textfieldResult.getText());
            lastNumberD = lastNumberD + actualNumberD;

            textfieldResult.setText(Double.toString(lastNumberD));
        } else {
            actualNumberI = Integer.parseInt(textfieldResult.getText());
            lastNumberI = lastNumberI + actualNumberI;
            textfieldResult.setText(Integer.toString(lastNumberI));
        }

    }

    public void addValue(javafx.event.ActionEvent actionEvent) {
        textfieldResult.setText(textfieldResult.getText() + ((Button) actionEvent.getSource()).getText());
    }
}
