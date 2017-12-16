package javamath;

import java.io.Serializable;

public class EquacaoDoSegundoGrau implements Serializable {

    private float a, b, c;

    public EquacaoDoSegundoGrau() {
    }

    public EquacaoDoSegundoGrau(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public double getX1() {
        double X1 = 0;
        if (calculaDelta() >= 0) {
            X1 = (-b + Math.sqrt(calculaDelta())) / (2 * a);
        } else {
            System.out.println("Não será calculado as raízes, Delta deu o valor zero");
        }
        return (X1);
    }

    public double getX2() {
        double X2 = 0;
        if (calculaDelta() >= 0) {
            X2 = (-b - Math.sqrt(calculaDelta())) / (2 * a);
        } else {
            System.out.println("Não será calculado as raízes, Delta deu o valor zero");
        }
        return (X2);

    }

    @Override
    public String toString() {

        return "O valor de X1 é: " + getX1() + "O valor de X2 é: " + getX2();
    }

    public float calculaDelta() {
        float delta = (b * b) - 4 * a * c;
        return (delta);

    }

}
