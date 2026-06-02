import java.util.Scanner;

public class Main{

    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Ingrese el nombre: ");
       String nombre = sc.nextLine();

       System.out.print("Ingrese la edad: ");
       int edad = sc.nextInt();
       sc.nextLine();

       System.out.print("Ingrese el indice: ");
       double indice = sc.nextDouble();
       sc.nextLine();

       Estudiante estudiante = new Estudiante(nombre, edad, indice);

       try{

        validarEstudiante(nombre, edad, indice);

        System.out.println("\nEstudiante Registrado.");

       }catch(Exception e){

        System.out.println(e.getMessage());

       }
       finally{

        System.out.println("\nProceso Finalizado.");
       }

    }

     public static void validarEstudiante(String nombre, int edad, double indice) throws Exception{

        if(nombre.length() == 0){

            throw new Exception("\nError: El nombre no puede quedar vacio.");
        }

        if(edad < 18){

            throw new Exception("\nError: La edad debe ser mayor o igual a 18.");
        }
        if(edad > 100){

            throw new Exception("\nError: La edad debe de ser menor de 100");
        }

        if(indice > 4.0 || indice < 0){

            throw new Exception("\nError: El indice debe estar entre 0 y 4");
        }

    }
}