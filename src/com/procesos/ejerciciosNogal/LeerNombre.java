package com.procesos.ejerciciosNogal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
public class LeerNombre {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(1);
        } else {
            System.out.println(args[0]);
            System.exit(0);
        }
    }
}