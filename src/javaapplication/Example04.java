/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author muhtar
 */
public class Example04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        URL webURL, ftpURL;
        try {
            webURL = new URL("http://www.macfaq.com/vendor.html"); System.out.println(webURL);
            ftpURL = new URL("ftp://ftp1.macfaq.com/pub/"); System.out.println(ftpURL);
        } catch (MalformedURLException e) {
        System.err.println("URL Salah"); }
    }
}
   

