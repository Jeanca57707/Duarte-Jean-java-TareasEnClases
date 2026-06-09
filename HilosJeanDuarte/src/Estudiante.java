import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private int edad;
    private String matricula;
    private String carrera;
    
    
    public Estudiante(){

        setNombre("");
        setEdad(0);
        setMatricula("");
        setCarrera("");
        
    }
    public Estudiante(String nombre, int edad,String matricula, String carrera){

        setNombre(nombre);
        setEdad(edad);
        setMatricula(matricula);
        setCarrera(carrera);

    }


    public void setNombre(String nombre){

        this.nombre = nombre;
    }
    public void setEdad(int edad){

        this.edad = edad;
    }
    public void setMatricula(String matricula){

        this.matricula= matricula;
    }
    public void setCarrera(String carrera){

        this.carrera = carrera;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){

        return edad;
    }
    public String getMatricula(){

        return matricula;
    }
    public String getCarrera(){

        return carrera;
    }


    public void registrarEstudiante(){

        Scanner sc = new Scanner(System.in);

        Estudiante e = new Estudiante();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.print("Matricula: ");
        String matricula = sc.nextLine();

        System.out.print("Carrera: ");
        String Carrera = sc.nextLine();

        setNombre(nombre);
        setEdad(edad);
        setMatricula(matricula);
        setCarrera(Carrera);

    }

    public void mostrar(){

        System.out.println();
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Carrera: " + getCarrera());
        System.out.println();
    }

    



}
