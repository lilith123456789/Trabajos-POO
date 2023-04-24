package model;

public class CalculatorModel {
    //Contiene el valor de la suma del número ingresado en la vista
private int calculationValue;

public void addTwoNumbers (int firstNumber, int secondNumber) {
    calculationValue = firstNumber + secondNumber;
}

public int getCalculationValue () {
    return calculationValue;
}
}

