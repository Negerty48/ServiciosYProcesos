/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

/**
 *
 * @author tarde
 */
public class Cliente {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try (Socket conexionServidor = new Socket("localhost", 6666);){
            System.out.println("Me he conectado al servidor");
            oos = new ObjectOutputStream(conexionServidor.getOutputStream());            
            Mensaje m = new Mensaje(0, "pepe", "texto");           
            oos.writeObject(m);
            System.out.println("He enviado el mensaje");
            ois = new ObjectInputStream(conexionServidor.getInputStream());
            Mensaje mr = (Mensaje)ois.readObject();
            System.out.println("Mensaje recibido: " + mr.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {                
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {                
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}