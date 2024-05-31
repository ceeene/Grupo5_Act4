


package tp4;

import java.util.*;

public class Padre {
    private String nombre;
    private String apellido;
    private Casa casa;
    private Auto auto;

    public Padre(String nombre, Auto auto) {
        this.nombre = nombre;
        this.apellido = "López"; 
        this.auto = auto;
        this.casa = new Casa("Centro");
    }

    public void cantar() {
        System.out.println("Así canta tu padre, Don " + this.apellido);
    }

    public void construirCasa() {
        System.out.println("Papá me dejó esta casa en zona " + this.casa.getZona());
    }

    public Auto getAuto() {
        return this.auto;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void comprarAuto() {
        System.out.println("Papá me dejó este auto modelo " + this.auto.getModelo());
    }
}
  

