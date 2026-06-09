import java.io.File;
import java.util.*;

public class Main{

    static ArrayList<Estudiante> lista = new ArrayList<>();

    public static void main(String[] args) {

        menu();


    }

    public static void menu(){

        Scanner sc = new Scanner(System.in);

        File arch = new File("Estudiantes.txt");

        int opc = 0;

        do{

            try{

            System.out.println("\n===============================");
            System.out.println("     REGISTRO DE ESTUDIANTES     ");
            System.out.println("================================\n");

            System.out.println("1. Registar Estudiante.");
            System.out.println("2. Mostrar Estudiantes.");
            System.out.println("3. Salir.");

            System.out.print("\nElija una Opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:

                    Estudiante e = new Estudiante();
                    e.registrarEstudiante();
                    lista.add(e);

                    break;
            
                case 2:

                 System.out.println("\n=====ESTUDIANTES REGISTRADOS=====\n");

                  for(int i = 0; i < lista.size(); i++){

                    lista.get(i).mostrar();

                 }
                    break;

                case 3:

                System.out.println("\nSaliendo del programa...");

                break;

                default:

                System.out.println("Opción Inválida.");

                break;
            }

            }catch(InputMismatchException e){

                System.out.println("\nIngrese un NUMERO valido.");
                break;
            }

        }while(opc != 3);
        sc.close();

    }

}