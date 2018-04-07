/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

public class proceso extends Thread
{
    public proceso(String msg)
    {
        //la clase threads es la que nos permite crear esos procesos
        super(msg);
    }
    
    public void run()
    {
        for (int i=0; i<=20; i++){
            if (this.getName()=="proceso 1")
            {
            System.out.println("este es el proceso 1");
            
            }else
            {
                System.out.println("222");    
            }
        }
    }
    
}
