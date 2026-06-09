package poo;

public class Calculadora {
    String marca;

    // metodos
    int sumar(int a, int b) {
        int respuesta = a + b;
        return respuesta;
    }

    int resta(int a, int b) {
        int respuesta = a - b;
        return respuesta;
    }

    int multiplicacion(int a, int b) {
        return a * b;
    }
}

// Dentro de la clase calculadora, crear un metodo que
// calcule el factorial de un numero
// factorial(5) --> 120
// 5! = 5*4*3*2*1 = 120
