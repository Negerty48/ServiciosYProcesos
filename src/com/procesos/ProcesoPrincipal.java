/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.procesos;

/**
 *
 * @author tarde
 */
public class ProcesoPrincipal { 
    public static void main(String[] args) {
        try {
            String[] infoProceso = {"java", "com.procesos.ProcesoSecunadrio"};
            Process proceso = Runtime.getRuntime().exec(infoProceso);
            int valorRetorno = proceso.waitFor();
            if (valorRetorno == 0) {
                System.out.println("El proceso se ha completado satisfactoriamente");
            } else {
                System.out.println("El proceso ha fallado. Código de error: " + valorRetorno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}