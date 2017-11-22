/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author muhtar
 */
public class Example07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket theServer;
        for (int i = 1024; i <= 65535; i++) {
            try {
                theServer = new ServerSocket(i);
                theServer.close(); 
            } catch (IOException e) {
                System.out.println("There is a server on port " + i + "."); }
            }
    }
}
