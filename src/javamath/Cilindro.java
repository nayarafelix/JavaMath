// NATALIA - PERIMETRO E AREA, FALTA VOLUME
package javamath;

import java.io.Serializable;

public class Cilindro extends Ponto implements Serializable{

    private double raio;
    private double altura;
    private double total_perimetro;
    private double total_area;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;

        total_perimetro = perimetro();
        total_area = area();
    }

    Cilindro() {

    }

    private double perimetro() {
        double per_circulo = (2 * Math.PI * raio) * 2;
        double per_retangulo = 2 * altura + per_circulo;
        double per = per_circulo + per_retangulo;
        return per;
    }

    private double area() {
        double area_base = (2 * Math.PI * (raio * raio)) * 2;
        double area_lateral = 2 * Math.PI * raio * altura;
        double area = area_base + area_lateral;
        return area;
    }

    /**
     * @return the ladoA
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    /**
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "O valor do perímetro é: " + total_perimetro + "O valor da área é: " + total_area;

    }
}
