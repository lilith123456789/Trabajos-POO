package model; 

public class Circulo {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo(){
    }

    public double calcularArea(){
        return Math.PI + Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}