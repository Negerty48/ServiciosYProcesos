/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos.ejercicios.productorConsumidor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author tarde
 */
public class ObjetoCompartido {
    File f = new File("fecha_hora.txt");
    
    public void reescribir() throws Exception {
        try (BufferedWriter bfw = new BufferedWriter(new FileWriter(this.f));) {
            bfw.write(LocalDate.now().toString() + " " + LocalTime.now().toString());
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void leer() throws Exception {
        String linea;
        try (BufferedReader bfr = new BufferedReader(new FileReader(f));) {
            linea = bfr.readLine();
            System.out.println(linea);
        } catch (Exception e) {
            throw e;
        }
    }
}