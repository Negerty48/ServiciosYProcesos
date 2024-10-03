/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hilos;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author tarde
 */
public class Lector  implements Callable<String>{
    @Override
    public String call() throws Exception {
        String textoLeido = "Me gustan las películas de acción";
        Thread.sleep(1000);
        return textoLeido;
    }
    
    public static void main(String[] args) {
        try {
            Lector lector = new Lector();
            ExecutorService srvEje = Executors.newSingleThreadExecutor();
            Future<String> resultado = srvEje.submit(lector);
            String texto = resultado.get();
            if (resultado.isDone()) {
                System.out.println(texto);
                System.out.println("Proceso  finalizado");
            } else if (resultado.isCancelled()) {
                System.out.println("Proceso cancelado");
            }
            srvEje.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}