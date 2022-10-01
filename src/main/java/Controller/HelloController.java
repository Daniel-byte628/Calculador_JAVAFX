package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;

import java.math.BigInteger;
import java.util.Scanner;

public class HelloController {
    @FXML
    private TextField txtop;
    @FXML
    private TextField txtnum1;
    @FXML
    private TextField txtnum2;
    @FXML
    private TextField txtresult;
    @FXML
    private Button btn;

    @FXML
    private void operar(ActionEvent event){
    String opcion;
    int num1=0,num2=0;
    try {
        do {
            opcion= this.txtop.getText();
            if (!opcion.equalsIgnoreCase("Salir")) {
                num1=Integer.parseInt(this.txtnum1.getText());
                num2=Integer.parseInt(this.txtnum2.getText());
            }
            System.out.println(num1 + " "+num2+" "+ opcion+"\n");

        }while (!opcion.equalsIgnoreCase("Salir"));





    }catch (NumberFormatException e){


    }





    }





}