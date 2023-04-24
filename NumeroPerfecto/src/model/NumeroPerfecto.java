package model;

public class NumeroPerfecto {

    public static boolean esNumeroPerfecto(int numero) {
        int acumuladorSuma = 0;
        for (int indiceI = 1; indiceI < numero; indiceI++) {
            if (numero % indiceI == 0) {
                acumuladorSuma += indiceI;
            }
        }
        return acumuladorSuma == numero;
    }

}
