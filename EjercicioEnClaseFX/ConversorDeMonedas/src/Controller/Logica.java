package Controller;

import java.text.DecimalFormat;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;



public class Logica {

    @FXML
    private TextField montoTF;

    @FXML
    private ComboBox<String> monedas;

    @FXML
    private Label resultado;

    @FXML
    private Label mensaje;

    DecimalFormat formato = new DecimalFormat("#,##0.00");


    @FXML
    public void initialize(){


        monedas.setItems(FXCollections.observableArrayList("Dolar estadounidense", "Euro"));

        mensaje.setText("Esperando información...");
    }

    @FXML
    private void convertir(ActionEvent event){

        String montoTxt = montoTF.getText();

        if( montoTxt.isEmpty()){

            mensaje.setText("Debe ingresar el monto deseado");
            return;
        }

        double monto;

        try{

            monto = Double.parseDouble(montoTxt);


        }catch(NumberFormatException e){

            mensaje.setText("El monto debe ser numérico");
            return;
        }

        if(monedas.getValue() == null){

            mensaje.setText("Seleccione una moneda");
            return;
        }
         double conversion;

         if(monedas.getValue().equals("Dolar estadounidense")){

            conversion = monto / 59;

            resultado.setText("RDS " + formato.format(monto) + "equivale a: " + formato.format(conversion) + " USD");

         }
         else{

            conversion = monto / 64;

            resultado.setText("RDS " + formato.format(monto) + "equivale a: " + formato.format(conversion) + " EUR");

         }

         mensaje.setText("Conversión Realizada.");
    }


    @FXML
    private void limpiarPantalla(ActionEvent event){

        montoTF.clear();
        monedas.getSelectionModel().clearSelection();
        resultado.setText("");
        mensaje.setText("Esperando información...");
    }

    @FXML
    private void mouseEntrada(MouseEvent event){

        mensaje.setText("Precione para realizar conversión");
    }

    @FXML
    private void mouseSalida(MouseEvent event){

        mensaje.setText("Esperando información...");
    }

    @FXML
    private void PrecionarEnter(KeyEvent event){

        if(event.getCode() == KeyCode.ENTER){

            convertir(new ActionEvent());
        }

    }
    
}
