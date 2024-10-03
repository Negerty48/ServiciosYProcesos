/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos.ejercicios.productorConsumidor;

/**
 *
 * @author tarde
 */
public class HiloProductor extends Thread {
    private ObjetoCompartido com;

    public HiloProductor(ObjetoCompartido com) {
        this.com = com;
    }
    
    public void run() {
        synchronized (com) {
            try {
                while (true) {
                    System.out.println("Escribiendo en el fichero");
                    com.reescribir();
                    com.notify();
                    com.wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }    
}