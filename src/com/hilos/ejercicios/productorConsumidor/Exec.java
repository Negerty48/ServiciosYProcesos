/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos.ejercicios.productorConsumidor;

/**
 *
 * @author tarde
 */
public class Exec {
    public static void main(String[] args) {
        ObjetoCompartido com = new ObjetoCompartido();
        HiloProductor p = new HiloProductor(com);
        HiloConsumidor c = new HiloConsumidor(com);
        
        p.start();
        try {
            Thread.sleep(200);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        c.start();
    }   
}