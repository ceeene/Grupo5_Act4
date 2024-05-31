/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.*;

public class Tp4 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // Paso 1: Crear objetos Auto
        Auto autoPapa = new Auto("123LATA", "Renault 12");
        Auto autoHijo = new Auto("999POWR", "Ford Focus");

        // Crear un Celular
        Celular celular = new Celular("Movistar", "123456789");

        //Crear objeto Padre
        Padre papa = new Padre("Papá", autoPapa);
        
        // Crear objeto Hijo
        Hijo juanCarlos = new Hijo("Juan Carlos", celular, autoHijo);

        // papa me dejo esta casa en zona centro
        papa.construirCasa();
        
         // Heredar apellido del padre
        juanCarlos.heredarApellido(papa.getApellido());
        juanCarlos.mostrarApellidoHeredado();
        
        

        // Paso 5: Mostrar auto del padre
        papa.comprarAuto();
        
        // Conducir ford focus de un amigo
        juanCarlos.conducirAuto(autoHijo);
        
        // se Jugar al futbol gracias a mi hermano
        juanCarlos.jugarFutbol();
        
        // se Bailar como mi madre
        juanCarlos.bailar();
        
        // heredaste la fortuna de 50000
        
        
        // salio el numero de la suerte
        juanCarlos.jugarLoteria();
        
        
        //aca va asi canta tu padre
        papa.cantar();
        
        
           //este es el de los dolaritos
        juanCarlos.heredarDinero(2000);
        
         //  Jugar al futbol y hacer goles
        System.out.println("Jugando al Futbol, Hoy has hecho " + juanCarlos.hacerGoles() + " goles");
    

//        // Paso 4: Crear objeto Hijo
//        Hijo juanCarlos = new Hijo("Juan Carlos", celular, autoHijo);
       

     

        

        

        

        

//        // Paso 10: Cantar
//        juanCarlos.cantar();

   
    }
}

    
    

