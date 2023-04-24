package model;


public class Cuadrado {
int lado; // Atributo que define el lado de un cuadrado


public Cuadrado(int lado) {
    this.lado = lado;
}

public double calcularArea() {
return lado * lado;
}

public double calcularPerimetro() {
return (4 * lado);
}
}