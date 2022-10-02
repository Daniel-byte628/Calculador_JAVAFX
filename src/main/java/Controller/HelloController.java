package Controller;

import facade.CalculadoraFacade;
import facade.FacadeOperacionBinaria;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;

import java.math.BigDecimal;
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

    private FacadeOperacionBinaria facade;

    public HelloController() {
        facade = new CalculadoraFacade();
    }


    @FXML
    private void operar(ActionEvent event){
    String opcion;
    int num1=0;
        int num2=0;
        BigDecimal resultado= BigDecimal.valueOf(0);
        try {
       // do {
            opcion= this.txtop.getText();
            if (!opcion.equalsIgnoreCase("Salir")) {
                num1=Integer.parseInt(this.txtnum1.getText());
                num2=Integer.parseInt(this.txtnum2.getText());
                opcion=this.txtop.getText();

              resultado= facade.ejecutarOperacionBinaria(opcion, new BigInteger(String.valueOf(num1)),
                       new BigInteger(String.valueOf(num2)));

              this.txtresult.setText(String.valueOf(resultado));
            }else {
                System.exit(0);
            }
            System.out.println(num1 + " "+num2+" "+ opcion+" "+ resultado+"\n");

        //}while (!opcion.equalsIgnoreCase(String.valueOf(event)));

    }catch (NumberFormatException e){



    }
    }
}