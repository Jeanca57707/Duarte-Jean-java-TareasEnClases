package model;

import java.time.*;

public class Consulta {

    private int codigo;
    private String nombre;
    private String cedula;
    private String telefono;
    private String medico;
    private LocalDate fecha;
    private String especialidad;
    private LocalTime hora;
    private String motivoConsulta;
    private String estado;
    
    public Consulta(int codigo, String nombre, String cedula, String telefono, String medico, String especialidad,
           LocalDate fecha, LocalTime hora, String motivoConsulta, String estado) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.medico = medico;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.hora  = hora;
        this.motivoConsulta = motivoConsulta;
        this.estado = estado;

    }

    public Consulta(int codigo, String nombre, String medico, LocalDate fecha, String especialidad, LocalTime hora,
            String estado) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.medico = medico;
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.hora = hora;
        this.estado = estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMedico() {
        return medico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public String getEstado() {
        return estado;
    }  

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
    
}
