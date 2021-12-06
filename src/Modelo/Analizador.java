/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Analizador {
    private ComandoPalabras comandos;
    private Scanner entrada;

    public Analizador() 
    {
        comandos = new ComandoPalabras();
        entrada = new Scanner(System.in);
    }

    public Comandos getComandos() 
    {
        String lineaDeEntrada;
        String palabra1 = null;
        String palabra2 = null;

        System.out.print("> ");

        lineaDeEntrada = entrada.nextLine();

        Scanner tokenizer = new Scanner(lineaDeEntrada);
        if(tokenizer.hasNext()) {
            palabra1 = tokenizer.next();
            if(tokenizer.hasNext()) {
                palabra2 = tokenizer.next();
            }
        }

        if(comandos.esComando(palabra1)) {
            return new Comandos(palabra1, palabra2);
        }
        else {
            return new Comandos(null, palabra2); 
        }
    }
}
