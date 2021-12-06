/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Juego {
    
    private Analizador analizador;
    private Cuarto cuartoActual;
    
    public Juego(){
        crearCuartos();
        analizador = new Analizador();
    }
    
    private void crearCuartos(){   
         String nombre ="file.csv";
         ArrayList<String[]> lista = ParsearArchivo.leerArchivo(nombre);
         ArrayList<Cuarto> listaCuartos = CreacionCuartos.crearCuartos(lista);
        
       cuartoActual = listaCuartos.get(0);
    }
    
    public void iniciar(){
        imprimirMensajeDeInicio();
        
        
        boolean finalizar = false;
        
        while(! finalizar){
            Comandos comandos = analizador.getComandos();
            finalizar = procezarComando(comandos);
        }
        System.out.println("");
    }
    
    
    public void imprimirMensajeDeInicio(){
        System.out.println("BIENVENIDO A ZUUL!!");
        System.out.println("En este juego tendras la oportunidad de");
        System.out.println("pasearte por la universidad");
        System.out.println("Y YA!, No esperes mucho");
        System.out.println("");
        System.out.println("En fin, actualmente te encuentras en: " + cuartoActual.getDescripcion());
        System.out.println("Puedes ir al");
        if(cuartoActual.salidaNorte != null) {
            System.out.print("norte ");
        }
        if(cuartoActual.salidaEste != null) {
            System.out.print("este ");
        }
        if(cuartoActual.salidaSur != null) {
            System.out.print("sur ");
        }
        if(cuartoActual.salidaOeste != null) {
            System.out.print("oeste ");
        }
        System.out.println();
    }
    
    public boolean procezarComando(Comandos comandos){
        boolean terminarElJuego = false;
        
        if(comandos.esDesconocido()){
            System.out.println("No se a que te refieres...");
            return false;
        }
        
        String palabraComando = comandos.getPalabraComando();
        
        if(palabraComando.equals("ayuda"))
            comandoAyuda();
        else if (palabraComando.equals("puerta"))
            comandoIr(comandos);
        else if (palabraComando.equals("salir"))
            terminarElJuego=comandoSalir(comandos);
        
        return terminarElJuego;
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
    
    public void comandoIr(Comandos comandos){
        if(!comandos.tieneSegundaPalabra()) {
            // if there is no second word, we don't know where to go...
            System.out.println("¿Ir a donde?");
            return;
        }

        String direction = comandos.getSegundaPalabraComando();

        // Try to leave current room.
        Cuarto siguienteCuarto = null;
        if(direction.equals("norte")) {
            siguienteCuarto = cuartoActual.salidaNorte;
        }
        if(direction.equals("este")) {
            siguienteCuarto = cuartoActual.salidaEste;
        }
        if(direction.equals("sur")) {
            siguienteCuarto = cuartoActual.salidaSur;
        }
        if(direction.equals("oeste")) {
            siguienteCuarto = cuartoActual.salidaOeste;
        }

        if (siguienteCuarto == null) {
            System.out.println("¡No hay puerta!");
        }
        else {
            cuartoActual = siguienteCuarto;
            System.out.println("Tu estas " + cuartoActual.getDescripcion());
            System.out.print("Salidas: ");
            if(cuartoActual.salidaNorte != null) {
                System.out.print("Norte ");
            }
            if(cuartoActual.salidaEste != null) {
                System.out.print("Este ");
            }
            if(cuartoActual.salidaSur != null) {
                System.out.print("Sur ");
            }
            if(cuartoActual.salidaOeste != null) {
                System.out.print("Oeste ");
            }
            System.out.println();
        }
    }
    
    public boolean comandoSalir(Comandos comandos){
        if(comandos.tieneSegundaPalabra()){
            System.out.println("¿Dejar que?");
            return false;
        }else{
            return true;
        }
    }
}
