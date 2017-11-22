/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author muhtar
 */
public class Example05 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        URL alamat = new URL("http://www.unisbank.ac.id"); 
        URLConnection yc = alamat.openConnection(); try (BufferedReader in = new BufferedReader(
                new InputStreamReader(yc.getInputStream()))) {
            String inputLine;
            
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
        }
    }
}
   

