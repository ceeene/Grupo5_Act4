/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.*;

    public class Hijo implements Madre, Tio, Hermano {
    private String nombre;
    private double billetera;
    private Celular celular;
    private Auto auto;
    private String apellido;

    public Hijo(String nombre, Celular celular, Auto auto) {
        this.nombre = nombre;
        this.celular = celular;
        this.billetera = 0; 
    }

    public void conducirAuto(Auto auto) {
        System.out.println("Conduciendo un auto de un amigo: " + auto.getModelo());
    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como mi madre ♪ ♫ ♪");
    }
    
    public void heredarApellido(String apellidoPadre) {
        this.apellido = apellidoPadre;
    }
    public void mostrarApellidoHeredado() {
        if (this.apellido != null) {
            System.out.println("Soy el hijo " + this.nombre + " y heredé de mi padre su apellido: " + this.apellido);

        }
    }

   
    public int jugarLoteria() {
        System.out.println("SALIO EL NUMERO DE LA SUERTE");
        this.billetera += Madre.NROSUERTE + Madre.FORTUNA;
        System.out.println("Heredaste la Fortuna de " + Madre.FORTUNA + " de tu madre la ROSA!!");
        System.out.println("Ahora tienes: " + this.billetera);
        return Madre.NROSUERTE;
    }

    @Override
    public void heredarDinero(double money) {
        this.billetera += money;
        System.out.println("MSJ de tio Lucas: disfruta la herencia Addams, sumas 52.000 dolaritos!");
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Se jugar futbol gracias a mi hermano");
    }

    @Override
    public int hacerGoles() {
        return 0; // Ejemplo de implementación
    }

    public void cantar() {
        System.out.println("Así canta " + this.nombre);
    }

    
}


