/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos.ejercicios.productorConsumidor;

/**
 *
 * @author tarde
 */
public class HiloConsumidor extends Thread{
    private ObjetoCompartido com;

    public HiloConsumidor(ObjetoCompartido com) {
        this.com = com;
    }
    
    public void run() {
        synchronized (com) {
            try {
                while (true) {
                    System.out.println("Leyendo el fichero");
                    com.leer();
                    com.notify();
                    com.wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    } 
}