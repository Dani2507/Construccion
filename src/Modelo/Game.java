/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Daniel
 */
public class Game {
    public void imprimirMensajeDeInicio(){
        System.out.println("BIENVENIDO A ZUUL!!");
        System.out.println("En este juego tendras la oportunidad de");
        System.out.println("pasearte por la universidad");
        System.out.println("Y YA!, No esperes mucho");
        System.out.println("");
        System.out.println("En fin, actualmente te encuentras en: ");
        System.out.println("Puedes ir al");
    }
    
    public void comandoAyuda(){
        System.out.println("Que paso master? Tienes problemas?");
        System.out.println("No hay problema, se te ayuda");
        System.out.println("Mira tus palabras de mando son:");
        System.out.println("-ayuda- Te muestra el mensaje que estas leyendo");
        System.out.println("-ir- aqui debes completar con una de las salidas");
        System.out.println("disponibles, por ejemplo: ir norte");
        System.out.println("-salir- hace que termine el juego");
    }
    
    public void comandoIr(){}
    
    public void comandoSalir(){}
}
