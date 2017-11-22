/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author muhtar
 */
public class Example06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Socket theSocket;
        String host = "localhost";
        
        for (int i = 0; i <=100; i++) {
            try{
                theSocket = new Socket(host, i);
                System.out.println("There is a server on port " + i + " of " + host); }
            catch (UnknownHostException e){
                System.err.println(e);
                break;
            }
            catch (IOException e){
                //System.err.print(e);
            }
        }
    }
}
   

