package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
int num = 15;
boolean result = doWhileLoop(num);
System.out.println("Resultado del bucle: " + result);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    public static boolean doWhileLoop(int num) {
int X = 0;
do {
    System.out.println("Entra con valor: " + X + ", sale con valor: " + (X+1));
    X++;
} while (X < num);
return X == num;


    }
}