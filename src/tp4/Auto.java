/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author celia
 */
public class Auto {
   
    private String patente;
    private String modelo;
    private double combustible;

    public Auto(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        this.combustible = 50.0; // Tanque lleno
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
}

    

