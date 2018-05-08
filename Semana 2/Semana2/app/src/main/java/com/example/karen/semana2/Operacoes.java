package com.example.karen.semana2;

/**
 * Created by Karen on 01/05/2018.
 */

public class Operacoes {

    private float a;
    private float b;

    public Operacoes(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float soma() {
        return a + b;
    }

    public float subtracao() {
        return a - b;
    }

    public float multiplicacao() {
        return a * b;
    }

    public float divisao() {
        return a / b;
    }
}
