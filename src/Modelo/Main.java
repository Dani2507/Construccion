package Modelo;

public class Main {

    public static void main(String[] args) {
        try {
            Juego juego = new Juego();
            juego.iniciar();
        } catch (Exception e) {
            System.out.println("ERROR EN LA CONFIGURACIÓN DE LOS CUARTOS");
        }
    }
}
