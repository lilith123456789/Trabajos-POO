package app;

import model.NumeroAmigos;
import model.NumeroArmstrong;
import model.NumeroPerfecto;

import java.util.Scanner;

public class App {

    public static int numero;

    public static void main(String[] args) throws Exception {
        try (Scanner objnumero = new Scanner(System.in)) {
            System.out.print("Digite un numero entero positivo: ");
            int numero = objnumero.nextInt();
            System.out.println(" ");

            if (NumeroPerfecto.esNumeroPerfecto(numero)) {
                System.out.println(numero + " es un número perfecto.");
            } else {
                System.out.println(numero + " no es un número perfecto.");
            }

            if (NumeroArmstrong.esNumeroDeArmstrong(numero)) {
                System.out.println(numero + " es un número de Armstrong.");
            } else {
                System.out.println(numero + " no es un número de Armstrong.");
            }

            int numeroAmigo = NumeroAmigos.buscarNumeroAmigo(numero);
            if (numeroAmigo != -1) {
                System.out.println(numero + " y " + numeroAmigo + " son números amigos.");
            } else {
                System.out.println(numero + " no tiene un número amigo.");
            }
        }
        System.out.println(" ");
    }
}
