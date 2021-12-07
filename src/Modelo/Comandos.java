package Modelo;

public class Comandos {

    private String palabraComando;
    private String segundaPalabraComando;

    public Comandos(String primerPalabra, String segundaPalabra) {
        palabraComando = primerPalabra;
        segundaPalabraComando = segundaPalabra;
    }

    public String getPalabraComando() {
        return palabraComando;
    }

    public String getSegundaPalabraComando() {
        return segundaPalabraComando;
    }

    public boolean esDesconocido() {
        return (palabraComando == null);
    }

    public boolean tieneSegundaPalabra() {
        return (segundaPalabraComando != null);
    }
}
