/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos;

/**
 *
 * @author tarde
 */
public class ExecHilos {
    public static void main(String[] args) {
        ObjetoCompartido oc = new ObjetoCompartido();
        Hilo h1 = new Hilo("pepe", oc);
        Hilo h2 = new Hilo("juan", oc);
        Hilo h3 = new Hilo("marcos", oc);
        
        h1.start();
        h2.start();
        h3.start();
    }
}
