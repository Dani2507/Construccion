package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParsearArchivo {
    
    public static ArrayList<String[]> leerArchivo(String nombre) throws Exception {
        File archivo = new File(nombre);
        BufferedReader bufferLectura = null;
        ArrayList<String[]> lista = new ArrayList<String[]>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombre));
            String linea = bufferLectura.readLine();
            while (linea != null) {
                String[] campos = linea.split(",");
                lista.add(campos);
                linea = bufferLectura.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        validarArray(lista);
        return lista;
    }
    /*Se valida que cada arrray de String tenga 6 cadenas, ya que es la cantidad
    de elementos que se debe tener para crear un cuarto.
    */
    private static void validarArray(ArrayList<String[]> lista) throws Exception {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length != 6) {
                System.out.println("ERROR EN LA CONFIGURACIÓN DEL ARCHIVO");
                System.exit(0);
            }
        }
    }
}