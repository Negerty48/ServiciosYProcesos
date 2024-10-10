/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos.ejercicios.ejercicio2_5;

/**
 *
 * @author tarde
 */
public class Hilo extends Thread{
    private String nombre;
    
    public Hilo(int numero) {
        this.nombre = String.format("Hilo%d", numero);
    }
       
    @Override
    public void run() {
        long n = (long) (Math.random() * 10) + 1;
        for (;;) {
            try {
                System.out.println("Souy el bucle " + this.nombre + " estoy trabajando");
                Thread.sleep(n * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}