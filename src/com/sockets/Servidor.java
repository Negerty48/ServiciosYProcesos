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
public class Servidor {
    public static void main(String[] args) {
        Socket conexionCliente = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        Mensaje m = null;
        try (ServerSocket ss = new ServerSocket(6666);) {
            conexionCliente = ss.accept();
            ois = new ObjectInputStream(conexionCliente.getInputStream());
            System.out.println("Se ha conectado el cielnte");
            m = (Mensaje) ois.readObject();
            m.setTexto(m.getTexto().toUpperCase());
            oos = new ObjectOutputStream(conexionCliente.getOutputStream());
            oos.writeObject(m);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conexionCliente != null) {
                try {
                    conexionCliente.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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