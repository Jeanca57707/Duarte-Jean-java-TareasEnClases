public class Estudiante {

    private String nombre;
    private int edad;
    private double indice;

    public Estudiante(){

        setNombre("");
        setEdad(0);
        setIndice(0.0);
    }

    public Estudiante(String nombre, int edad, double indice){

        setNombre(nombre);
        setEdad(edad);
        setIndice(indice);

    }

    public void setNombre(String nombre){

        this.nombre = (nombre != null)? nombre : this.nombre; 

    }
    public void setEdad(int edad){
        
        this.edad = (edad > 0) ? edad : 0;

    }
    public void setIndice(double indice){

        this.indice = (indice > 0 && indice < 5)? indice : 0.0;

    }

    public String getNombre(){

        return nombre.toUpperCase();
    }
    public int getEdad(){

        return edad;
    }
    public double getIndice(){

        return indice;
    }
    
}
