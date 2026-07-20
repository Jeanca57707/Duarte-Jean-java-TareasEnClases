package utils;

import java.io.*;
import java.util.*;
import java.time.*;
import javafx.collections.ObservableList;

import model.Consulta;

public class ArchivoUtil {

    public static void guardarConsulta(ObservableList<Consulta> lista)throws IOException{

        try(FileWriter archivo = new FileWriter("consultas.txt", true)){

            for(Consulta consulta : lista){

             archivo.write(consulta.getCodigo() + "|" + consulta.getNombre() + "|"
             +  consulta.getCedula() + "|" + consulta.getTelefono() + "|" + consulta.getMedico()
             + "|" + consulta.getEspecialidad() + "|" + consulta.getFecha() + "|" + consulta.getHora()
             + "|"+ consulta.getMotivoConsulta() + "|" + consulta.getEstado() + "\n");

            }
            archivo.close();

            System.out.println("Consulta registrada correctamente");

        }catch(IOException e){

            System.out.println("Error al guardar consulta " + e.getMessage());

        }

    }

    public static ArrayList<Consulta> leerConsultas()throws IOException{

        ArrayList<Consulta> consultas = new ArrayList<>();

        try{

            FileReader archivo = new FileReader("consultas.txt");
            BufferedReader lector = new BufferedReader(archivo);

            String linea;

            while((linea = lector.readLine()) != null){

                String[] partes = linea.split("\\|");

                if(partes.length == 10){

                    int codigo = 0;
                   
                    LocalDate fecha = LocalDate.parse(partes[6]);
                    LocalTime hora = LocalTime.parse(partes[7]);

                    try {

                        codigo = Integer.parseInt(partes[0]);

                        Consulta consulta = new Consulta(

                            codigo, 
                            partes[1], 
                            partes[2], 
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
                        
                        System.out.println("El código ydebe ser de valor numérico");
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
