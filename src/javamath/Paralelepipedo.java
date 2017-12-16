package javamath;

import java.io.Serializable;

public class Paralelepipedo extends Ponto implements Serializable{
    private double comprimento;
    private double largura;
    private double altura;
    private double volume;
    private double areatotal;
    
    public Paralelepipedo(double comprimento, double altura, double largura){
        this.comprimento= comprimento;
        this.altura= altura;
        this.largura=largura;
        
        volume=volume();
        areatotal= areatotal();
    }
    Paralelepipedo(){
    }
    public double volume(){
        double vol= comprimento*largura*altura;
        return vol;
    }
    public double areatotal(){
        double areatotal=(2*comprimento*largura)+(2*comprimento*altura)+(2*largura*altura);
        return areatotal;
    }

    /**
     * @return the comprimento
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
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
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
   
    /**
     * @return the areatotal
     */
    public double getAreatotal() {
        return areatotal;
    }

    /**
     * @param areatotal the areatotal to set
     */
    public void setAreatotal(double areatotal) {
        this.areatotal = areatotal;
    }
    
    
    public String toString(){
        return "O valor do volume do Paralelepipedo é: " + volume() + "O valor da area total é: " + areatotal();
    }

}
