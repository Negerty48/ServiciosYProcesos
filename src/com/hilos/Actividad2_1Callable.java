package com.hilos;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
public class Actividad2_1Callable implements Callable<Integer> {
    private int numero;
    
    public Actividad2_1Callable(int numero) {
        this.numero = numero;
    }
    
    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        for (int i = numero - 1; i > 1; i--) {
            if (numero % i == 0) {
                return i;
            }
        }
        throw new Exception("El numero es primo");
    }
    
    public static void main(String[] args) {
        try {
            Actividad2_1Callable a = new Actividad2_1Callable(73);
            ExecutorService s = Executors.newSingleThreadExecutor();
            Future<Integer> res = s.submit(a);
            while (!res.isDone()) {
                System.out.println("Esperando...");
                Thread.sleep(1000);
            }
            System.out.println("El numero es divisible entre " + res.get());
            s.shutdown();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}