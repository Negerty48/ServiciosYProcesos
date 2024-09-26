/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.procesos;

/**
 *
 * @author tarde
 */
public class Notepad {
    public static void main(String[] args) {
        try {
            ProcessBuilder pBuilder = new ProcessBuilder("gedit", "datos.txt");
            pBuilder.start();
        } catch (Exception e) {
            e.printStackTrace();
        }    
        
    }
}
