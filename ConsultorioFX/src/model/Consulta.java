package model;

public class Consulta {

    private int codigo;
    private String nombre;
    private String telefono;
    private String medico;
    private String especialidad;
    private String motivoConsulta;
    private String estado;
    
    public Consulta(int codigo, String nombre, String telefono, String medico, String especialidad,
            String motivoConsulta, String estado) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.medico = medico;
        this.especialidad = especialidad;
        this.motivoConsulta = motivoConsulta;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
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

    @Override
    public String toString(){

        return nombre;
    }
    
}
