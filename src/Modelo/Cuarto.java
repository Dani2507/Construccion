package Modelo;

public class Cuarto {

    private final String nombre;
    private String descripcion;
    private final Cuarto salidas[] = new Cuarto[4];

    public Cuarto(String name, String description) {
        this.nombre = name;
        this.descripcion = description;
    }

    public void setSalidas(Cuarto[] cuartos) {
        for (int i = 0; i < cuartos.length; i++) {
            if (cuartos[i] != null) {
                salidas[i] = cuartos[i];
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cuarto[] getSalidas() {
        return salidas;
    }

    public Cuarto getSalidaNorte() {
        return salidas[0];
    }

    public Cuarto getSalidaSur() {
        return salidas[2];
    }

    public Cuarto getSalidaEste() {
        return salidas[1];
    }

    public Cuarto getSalidaOeste() {
        return salidas[3];
    }
}