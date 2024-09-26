/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos;

/**
 *
 * @author tarde
 */
public class Hilo extends Thread{
    String nombre;
    ObjetoCompartido oc;
    
    public Hilo(String nombre, ObjetoCompartido oc) {
        this.nombre = nombre;
        this.oc = oc;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.nombre + ": " + oc.incrementar(1));
        }
    }
}
