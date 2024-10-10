/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos.ejercicios.ejercicio2_5;

/**
 *
 * @author tarde
 */
public class Exec {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            new Hilo(i).start();
        }
    }
}