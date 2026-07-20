package utils;

import java.io.*;
import java.util.*;
import java.time.*;

import model.Consulta;

public class ArchivoUtil {

    public static void guardarConsulta(Consulta consulta){

        try(FileWriter archivo = new FileWriter("consultas.txt", true)){

            archivo.write(consulta.getCodigo() + "-" + consulta.getNombre() + "-"
            +  consulta.getTelefono() + "-" + consulta.getMedico() + "-" + consulta.getEspecialidad()
            + "-" + consulta.getFecha() + "-" + consulta.getHora() + "-" + consulta.getMotivoConsulta()
            + "-" + consulta.getEspecialidad());

            archivo.close();

            System.out.println("Consulta registrada correctamente");

        }catch(IOException e){

            System.out.println("Error al guardar consulta " + e.getMessage());

        }

    }

    public static ArrayList<Consulta> leerConsultas(){

        ArrayList<Consulta> consultas = new ArrayList<>();

        try{

            FileReader archivo = new FileReader("consultas.txt");
            BufferedReader lector = new BufferedReader(archivo);

            String linea;

            while((linea = lector.readLine()) != null){

                String[] partes = linea.split("-");

                if(partes.length == 9){

                    int codigo = 0;
                    int cedula = 0;
                    LocalDate fecha = LocalDate.parse(partes[6]);
                    LocalTime hora = LocalTime.parse(partes[7]);

                    try {

                        codigo = Integer.parseInt(partes[0]);
                        cedula = Integer.parseInt(partes[2]);

                        Consulta consulta = new Consulta(

                            codigo, 
                            partes[1], 
                            cedula, 
                            partes[3], 
                            partes[4],
                            partes[5],
                            fecha, 
                            hora, 
                            partes[8], 
                            partes[9]
                        );

                        consultas.add(consulta);
                        
                    } catch (NumberFormatException e) {
                        
                        System.out.println("El código y la cédula debe ser de valor numérico");
                    }   
                }
 
            }
            lector.close();
            
        }catch(IOException e){

            System.out.println("Error al leer el archivo. " + e.getMessage());
        }

        return consultas;

    }

}
