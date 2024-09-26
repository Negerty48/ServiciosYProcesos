/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.procesos.ejerciciosNogal;

import java.io.File;

/**
 *
 * @author tarde
 */
public class ExecLeerNombre {
    public static void main(String[] args) {
        try {
            File d = new File("./build/classes");
            ProcessBuilder pb = new ProcessBuilder("java", "com.procesos.ejerciciosNogal.LeerNombre", "Angel");
            pb.directory(d);
            Process p = pb.start();
            System.out.println(p.waitFor());            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}