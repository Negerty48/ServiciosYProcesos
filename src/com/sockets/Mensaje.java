/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sockets;

import java.io.Serializable;

/**
 *
 * @author tarde
 */
public class Mensaje implements Serializable{
    private int id;
    private String texto;
    private String tipoMensaje;

    public Mensaje(int id, String texto, String tipoMensaje) {
        this.id = id;
        this.texto = texto;
        this.tipoMensaje = tipoMensaje;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", texto=" + texto + ", tipoMensaje=" + tipoMensaje + '}';
    }

    public String getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}