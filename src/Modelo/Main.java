/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 18K59LA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String nombre ="file.csv";
         ArrayList<String[]> lista = ParsearArchivo.leerArchivo(nombre);
         ArrayList<Cuarto> listaCuartos = CreacionCuartos.crearCuartos(lista);
         for(int i=0;i<listaCuartos.size();i++){
             System.out.println(listaCuartos.get(i).getSalidaOeste());
         }
         
    }

}
