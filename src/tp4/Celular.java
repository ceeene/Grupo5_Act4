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
public class Celular {
    private String compañia;
    private String numero;
    private double saldo;

    public Celular(String compañia, String numero) {
        this.compañia = compañia;
        this.numero = numero;
        this.saldo = 0.0; // Saldo inicial
    }
}


