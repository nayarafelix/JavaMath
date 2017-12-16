// PONTO - PRISCILA - X e Y 
package javamath;

import java.io.Serializable;

public class Ponto implements Serializable {

    private float x, y;

    public Ponto() {
    }

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cordenada de X: " + x + ", \nCordenada de Y: " + y; //To change body of generated methods, choose Tools | Templates.
    }

}
