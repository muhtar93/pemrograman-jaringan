/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author muhtar
 */
public class Example03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            InetAddress address = InetAddress.getLocalHost(); System.out.println(address);
        }catch (UnknownHostException e){
            System.out.println("Could not find this computer's address."); }
        }
    }
   

