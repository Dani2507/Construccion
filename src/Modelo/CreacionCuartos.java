package Modelo;

import java.util.ArrayList;

public class CreacionCuartos {

    public static ArrayList<Cuarto> crearCuartos(ArrayList<String[]> lista) {
        ArrayList<Cuarto> cuartos = new ArrayList<>();
        Cuarto cuarto;
        for (int i = 0; i < lista.size(); i++) {
            cuarto = new Cuarto(lista.get(i)[0], lista.get(i)[1]);
            cuartos.add(cuarto);
        }
        return asignarSalidas(cuartos, lista);
    }

    private static int buscarCuarto(String nombre, ArrayList<Cuarto> cuartos) {
        int indice = -1;
        for (int i = 0; i < cuartos.size(); i++) {
            if (nombre.equals(cuartos.get(i).getNombre())) {

                indice = i;
            }
        }
        return indice;
    }

    private static ArrayList<Cuarto> asignarSalidas(ArrayList<Cuarto> cuartos, ArrayList<String[]> lista) {
        Cuarto[] temp = new Cuarto[4];
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < temp.length; j++) {
                try {
                    temp[j] = cuartos.get(buscarCuarto(lista.get(i)[j + 2], cuartos));
                } catch (Exception e) {
                    temp[j] = null;
                }
            }
            cuartos.get(i).setSalidas(temp);
        }
        return cuartos;
    }
}