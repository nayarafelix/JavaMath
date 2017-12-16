// NAYARA - PERIMETRO E AREA OK

package javamath;

import java.io.Serializable;

public class Triangulo extends Ponto implements Serializable{

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double altura;
    private double base;
    private double totalPerimetro;
    private double totalArea;

    public Triangulo(double ladoA, double ladoB, double ladoC, double altura, double base) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
        this.base = base;

        totalPerimetro = perimetro();
        totalArea = area();
    }

    Triangulo() {

    }

    private double perimetro() {
        double per = ladoA + ladoB + ladoC;
        return per;
    }

    private double area() {
        double ar = (altura * base) / 2;
        return ar;
    }

    /**
     * @return the ladoA
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * @return the ladoC
     */
    public double getLadoC() {
        return ladoC;
    }

    /**
     * @param ladoC the ladoC to set
     */
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "O valor do perimetro é de " + totalPerimetro + " e o valor da área é de " + totalArea;
    }
}
