package model;

public class NumeroAmigos {

    public static int buscarNumeroAmigo(int numero) {
        int acumuladorDivisores = 0;
        for (int i = 1; i < numero; i++) {
          if (numero % i == 0) {
            acumuladorDivisores += i;
          }
        }
        int sumaDivisores2 = 0;
        for (int i = 1; i < acumuladorDivisores; i++) {
          if (acumuladorDivisores % i == 0) {
            sumaDivisores2 += i;
          }
        }
        if (sumaDivisores2 == numero && acumuladorDivisores != numero) {
          return acumuladorDivisores;
        } else {
          return -1;
        }
      }
}