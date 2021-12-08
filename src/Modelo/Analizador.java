package Modelo;

import java.util.Scanner;

public class Analizador {
    private ComandoPalabras comandos;
    private Scanner entrada;

    public Analizador() {
        comandos = new ComandoPalabras();
        entrada = new Scanner(System.in);
    }

    public Comandos getComandos() {
        String lineaDeEntrada;
        String palabra1 = null;
        String palabra2 = null;

        System.out.print("> ");//Indica al usuario donde insertar el comando en la consola

        lineaDeEntrada = entrada.nextLine();

        Scanner tokenizer = new Scanner(lineaDeEntrada);
        if (tokenizer.hasNext()) {
            palabra1 = tokenizer.next();
            if (tokenizer.hasNext()) {
                palabra2 = tokenizer.next();
            }
        }
        
        if (comandos.esComando(palabra1)) {
            return new Comandos(palabra1, palabra2);
        } else {
            return new Comandos(null, palabra2);
        }
    }
}
