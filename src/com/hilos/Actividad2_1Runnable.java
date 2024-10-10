/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author tarde
 */
public class Actividad2_1Runnable implements Runnable{
    private int numero;
    private int divisor = 1;
    
    public int getDivisor() {
        return divisor;
    }
    
    public Actividad2_1Runnable(int numero) {
        this.numero = numero;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            for (int i = numero; i > 1; i--) {
                if (numero % i == 0) {
                    divisor = i;
                    break;
                }
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        try {
            Actividad2_1Runnable a = new Actividad2_1Runnable(11);
            ExecutorService s = Executors.newSingleThreadExecutor();
            Future res = s.submit(a);
            while (!res.isDone()) {
                System.out.println("Esperando...");
                Thread.sleep(1000);
            }
            if (a.getDivisor() != -1) {
                System.out.println("El numero es divisible entre " + a.getDivisor());
            } else {
                System.out.println("El numero es primo");
            }
            s.shutdown();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}