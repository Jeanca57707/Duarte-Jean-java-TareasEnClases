package controller;

import utils.*;
import model.Consulta;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

import javafx.fxml.*;


public class RegistrarConsultaController {

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtPaciente;

    @FXML 
    private TextField txtCedula;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtHora;

    @FXML
    private DatePicker dpFecha;

    @FXML
    private ComboBox<String> cmbMedico;

    @FXML
    private ComboBox<String> cmbEspecialidad;

    @FXML
    private ComboBox<String> cmbEstado;
    
    @FXML
    private TextArea txtMotivo;

    @FXML
    private Button btRegistrar;

    @FXML
    private Button btCancelar;

    @FXML
    private Button btLimpiar;

    @FXML
    private Button btGuardar;

    @FXML 
    private Button btCargar;

    @FXML 
    private TableView<Consulta> tvCitas;

    @FXML
    private TableColumn<Consulta, Integer> tcCodigo;

    @FXML
    private TableColumn<Consulta, String> tcPaciente;

    @FXML
    private TableColumn<Consulta, String> tcMedico;

    @FXML
    private TableColumn<Consulta, String> tcEspecialidad;

    @FXML
    private TableColumn<Consulta, LocalDate> tcFecha;

    @FXML
    private TableColumn<Consulta, LocalTime> tcHora;

    @FXML
    private TableColumn<Consulta, String> tcEstado;


    private ObservableList<Consulta> citas = FXCollections.observableArrayList();


    @FXML
    private void initialize(){

        lblTitulo.setText("REGISTRAR CITA");

        cmbMedico.getItems().addAll("Pedro Santana" , "Maria Trinidad", "Juan Pablo Duarte");
        cmbEstado.getItems().addAll("Programada", "Atendida", "Cancelada");
        cmbEspecialidad.getItems().addAll("Cardiólogo", "Odontólogo");

        tvCitas.setItems(citas);
    }

    @FXML
    private void registrarCita(){

        if(txtCodigo.getText().isBlank() || txtCedula.getText().isBlank() || txtPaciente.getText().isBlank()
        || txtTelefono.getText().isBlank() || txtHora.getText().isBlank() || txtMotivo.getText().isBlank() 
        || cmbEspecialidad.getValue() == null || cmbEstado.getValue() == null || cmbMedico.getValue() == null
        || dpFecha.getValue() == null){

            return;
        }
        int codigo;
        LocalTime hora;
        LocalDate fecha;

        try {
            codigo = Integer.parseInt(txtCodigo.getText());
            hora = LocalTime.parse(txtHora.getText());
            fecha = dpFecha.getValue();
            
        } catch (NumberFormatException e) {

            return;

        } catch (DateTimeParseException e){

            return;
        }

        Consulta cita = new Consulta(codigo, txtPaciente.getText(), cmbMedico.getValue(), fecha, cmbEspecialidad.getValue(), hora, cmbEstado.getValue());

        citas.add(cita);

    }
    
}
