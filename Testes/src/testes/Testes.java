
package testes;

import java.awt.Desktop;
import java.lang.reflect.Array;
import java.net.URI;
import java.util.Scanner;

public class Testes {

   
    public static void main(String[] args) {

       /* String nome = "cris magno de mendonça";
        String n[] = nome.split(" ",3);
        System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[2]);
        //System.out.println(n[3]);
             */
       
      /* String pais = "Brasil vai ganhar a copa";
       String nova = pais.replace(" ", "_");
        System.out.println(nova);
*/
    /*    String pais = "Brasil vai ganhar a copa";
       String nova = pais.replaceFirst("s", "z");
        System.out.println(nova);
        */
    
    /*int n = (int) (Math.round(Math.random()));
        System.out.println(n);
        */
    try{
        
    URI link = new URI("www.google.com");
    Desktop.getDesktop().browse(link);
    
    }catch(Exception erro){
        System.out.println(erro);
    }
    
    
    
    
}
}
        
        
    
    

