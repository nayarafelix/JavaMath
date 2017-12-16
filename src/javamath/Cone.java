// ISABELLA - VOLUME E AREA OK
package javamath;

import java.io.Serializable;

public class Cone extends Ponto implements Serializable{

    private double areaTotal;
    private double raio;
    private double altura;
    private double total_volume;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;

        total_volume = volume();
        areaTotal = areatotal();
    }

    Cone() {

    }

    private double volume() {
        double vol = (0.33) * Math.PI * (raio * raio) * altura;
        return vol;

    }

    public double areaB() {
        double areaB = Math.PI * (raio * raio);
        return areaB;
    }

    public double Geratriz() {
        double Geratriz = (altura * altura) * (raio * raio);
        return Geratriz;
    }

    public double arealateral() {
        double arealateral = Math.PI * (raio * raio) * Geratriz();
        return arealateral;
    }

    private double areatotal() {
        double areatotal = Math.PI * (raio * raio) * (Geratriz() + raio);
        return areatotal;
    }

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
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

    @Override
    public String toString() {
        return "O valor do Volume é: " + total_volume + "O valor da Area Total é: " + areaTotal;
    }

}
