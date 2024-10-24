/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos.semaforo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author tarde
 */
public class Exec implements Runnable{
    Semaphore s1 = new Semaphore(2);
    Semaphore s2 = new Semaphore(2);
    
    public void metodo1() {
        try {
            s1.acquire();                    
            System.out.println("Inicio del metodo 1" + Thread.currentThread().getName());
            Thread.sleep(1000);
            s1.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin del metodo 1" + Thread.currentThread().getName());
    }
    
    public void metodo2() {
        try {
            s2.acquire();                    
            System.out.println("Inicio del metodo 2" + Thread.currentThread().getName());
            Thread.sleep(1000);
            s2.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin del metodo 2" + Thread.currentThread().getName());
    }
    
    public void run() {
        metodo1();
        metodo2();
    }
    
    public static void main(String[] args) {
        Exec e = new Exec();
        for (int i = 0; i < 10; i++) {
            new Thread(e).start();
        }
    }
}