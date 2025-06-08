package com.guilhermerodrigues;

public class Calculadora {
    public double Somar(double a, double b) {
        return a + b;
    }

    public double Subtrair(double a, double b) {
        return a - b;
    }

    public double Multiplicar(double a, double b) {
        return a * b;
    }

    public double Dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("O divisor não pode ser zero");
        }

        return a / b;
    }
}