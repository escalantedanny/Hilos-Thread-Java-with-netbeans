/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author danny
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Thread hilo  = new proceso("proceso 1");
        Thread hilo2 = new proceso("proceso 2");
        
        hilo.start();
        hilo2.start();
        
    }
    
}
