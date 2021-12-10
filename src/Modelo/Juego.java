package Modelo;

import java.util.ArrayList;

public class Juego {

    private Analizador analizador;
    private Cuarto cuartoActual;

    public Juego() throws Exception {
        crearCuartos();
        analizador = new Analizador();
    }

    private void crearCuartos() throws Exception {
        String nombre = "file.csv";
        try {
            ArrayList<String[]> lista = ParsearArchivo.leerArchivo(nombre);
            ArrayList<Cuarto> listaCuartos = CreacionCuartos.crearCuartos(lista);
            cuartoActual = listaCuartos.get(0);
        } catch (Exception e) {
            System.out.println("ERROR EN EL ARCHIVO DE CONFIGURACION");
            System.exit(0);
        }
    }

    public void iniciar() {
        imprimirMensajeDeInicio();

        boolean finalizar = false;

        while (!finalizar) {
            Comandos comandos = analizador.getComandos();
            finalizar = procesarComando(comandos);
        }
        System.out.println("");
    }

    public void imprimirMensajeDeInicio() {
        System.out.println("BIENVENIDO A ZUUL!!");
        System.out.println("En este juego tendras la oportunidad de");
        System.out.println("pasearte por la universidad");
        System.out.println("Y YA!, No esperes mucho");
        System.out.println("");
        System.out.println("En fin, actualmente te encuentras en: " + cuartoActual.getDescripcion());
        System.out.println("Puedes ir al");
        if (cuartoActual.getSalidaNorte() != null) {
            System.out.print("norte ");
        }
        if (cuartoActual.getSalidaEste() != null) {
            System.out.print("este ");
        }
        if (cuartoActual.getSalidaSur() != null) {
            System.out.print("sur ");
        }
        if (cuartoActual.getSalidaOeste() != null) {
            System.out.print("oeste ");
        }
        System.out.println();
    }

    public boolean procesarComando(Comandos comandos) {
        boolean terminarElJuego = false;

        if (comandos.esDesconocido()) {
            System.out.println("No se a que te refieres...");
            return false;
        }

        String palabraComando = comandos.getPalabraComando();

        if (palabraComando.equals("ayuda")) {
            comandoAyuda();
        } else if (palabraComando.equals("ir")) {
            revisarComandoPuerta(comandos);
        } else if (palabraComando.equals("salir")) {
            terminarElJuego = comandoSalir(comandos);
        }

        return terminarElJuego;
    }

    public void comandoAyuda() {
        System.out.println("Que paso master? Tienes problemas?");
        System.out.println("No hay problema, se te ayuda");
        System.out.println("Mira tus palabras de mando son:");
        System.out.println("-ayuda- Te muestra el mensaje que estas leyendo");
        System.out.println("-ir- aqui debes completar con una de las salidas");
        System.out.println("disponibles, por ejemplo: ir norte");
        System.out.println("-salir- hace que termine el juego");
    }

    public void revisarComandoPuerta(Comandos comandos) {
        //Si el comando carece de segunda palabra, se avisa al jugador y se regresa al inicio
        if (!comandos.tieneSegundaPalabra()) {
            System.out.println("¿Ir a donde?");
            return;
        }
        revisarSalidaSeleccionada(comandos);
    }
    
    public void revisarSalidaSeleccionada(Comandos comandos){
        String direction = comandos.getSegundaPalabraComando();

        //Para tener un nivel de anidamiento menor, se tienen condicionales independientes en lugar de condicionales anidados
        Cuarto siguienteCuarto = null;
        if (direction.equals("norte")) {
            siguienteCuarto = cuartoActual.getSalidaNorte();
        }
        if (direction.equals("este")) {
            siguienteCuarto = cuartoActual.getSalidaEste();
        }
        if (direction.equals("sur")) {
            siguienteCuarto = cuartoActual.getSalidaSur();
        }
        if (direction.equals("oeste")) {
            siguienteCuarto = cuartoActual.getSalidaOeste();
        }

        if (siguienteCuarto == null) {
            System.out.println("¡No hay puerta!");
        } else {
            repetirSalidas(siguienteCuarto);
        }    
    }
    
    public void repetirSalidas(Cuarto siguienteCuarto){
        
            cuartoActual = siguienteCuarto;
            System.out.println("Tu estas " + cuartoActual.getDescripcion());
            System.out.print("Salidas: ");
            if (cuartoActual.getSalidaNorte() != null) {
                System.out.print("Norte ");
            }
            if (cuartoActual.getSalidaEste() != null) {
                System.out.print("Este ");
            }
            if (cuartoActual.getSalidaSur() != null) {
                System.out.print("Sur ");
            }
            if (cuartoActual.getSalidaOeste() != null) {
                System.out.print("Oeste ");
            }
            System.out.println();
        }
    
    public boolean comandoSalir(Comandos comandos) {
        if (comandos.tieneSegundaPalabra()) {
            System.out.println("¿Dejar que?");
            return false;
        } else {
            return true;
        }
    }
}
