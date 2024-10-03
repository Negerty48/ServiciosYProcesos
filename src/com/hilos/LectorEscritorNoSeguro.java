/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tarde
 */
public class LectorEscritorNoSeguro extends Thread{
    private static List<String> palabras = new ArrayList<>();
    
    @Override
    public void run() {
        palabras.add(new String("Nueva palabra"));
        for (String palabra : palabras) {
            palabras.size();
        }
        System.out.println(palabras.size());
    }
    
    public static void main(String[] args) {                        
        for (int i = 0; i < 100; i++) {
            new LectorEscritorNoSeguro().start();
        }
    }
}