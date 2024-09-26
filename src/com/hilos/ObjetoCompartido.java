/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos;

/**
 *
 * @author tarde
 */
public class ObjetoCompartido {
    int cont = 0;
    
    public ObjetoCompartido() {        
    }
    
    public synchronized int incrementar(int valor) {
        int temp = this.cont;
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.cont = temp + valor;
        return this.cont;
    }
}
