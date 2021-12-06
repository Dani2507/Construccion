/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 18K59LA
 */
public class CreacionCuartos {
    
    
    
    public static ArrayList<Cuarto> crearCuartos(ArrayList<String[]> lista){
        
        ArrayList<Cuarto> cuartos = new ArrayList<>();
        Cuarto cuarto;
        
          for(int i=0;i<lista.size();i++){
           cuarto = new Cuarto(lista.get(i)[0],lista.get(i)[1]);
           cuartos.add(cuarto);
        }
       
        return asignarSalidas(cuartos, lista);
        
    }

    
    
    public static int  buscarCuarto(String nombre,ArrayList<Cuarto> cuartos){
     
        int indice=-1;
        for(int i=0;i<cuartos.size();i++){
            if(nombre.equals(cuartos.get(i).getNombre())){
 
                indice =i;
            }
        }
        return indice;
    }
    
    
    
    public static ArrayList<Cuarto> asignarSalidas(ArrayList<Cuarto> cuartos,ArrayList<String[]> lista){
    
        Cuarto norte, este,sur, oeste;
        
            for(int i=0; i<lista.size();i++){
            try{
            norte= cuartos.get(buscarCuarto(lista.get(i)[2],cuartos));}
            catch(Exception e){
            norte =null;
            }           
            try{
            este= cuartos.get(buscarCuarto(lista.get(i)[3],cuartos));}
            catch(Exception e){
            este =null;
            } 
            try{
            sur= cuartos.get(buscarCuarto(lista.get(i)[4],cuartos));}
            catch(Exception e){
            sur =null;
            }          
            try{
            oeste= cuartos.get(buscarCuarto(lista.get(i)[5],cuartos));}
            catch(Exception e){
            oeste =null;
            }
           cuartos.get(i).setSalidas(norte, este, sur, oeste);        
          }
        
        
        return cuartos;
        
    }
}
