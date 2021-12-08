/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

/**
 *
 * @author 18K59LA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
        Juego juego = new Juego();
        juego.iniciar();}
        catch(Exception e){
            System.out.println("ERROR EN LA CONFIGURACIÓN DE LOS CUARTOS");
        }

    }

}
