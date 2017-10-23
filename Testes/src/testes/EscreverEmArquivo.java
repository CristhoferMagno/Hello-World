
package testes;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class EscreverEmArquivo {
    
    public static void main(String[] args) {
        
        Path caminho = Paths.get("C:/Users/crist/Desktop/joe.txt");
        String texto = JOptionPane.showInputDialog("o que quer escrever?");
        byte textoEmByte[] = texto.getBytes();
        try{
        Files.write(caminho,textoEmByte);
        }catch(Exception erro){}
        
       try{
        byte[] texto1 = Files.readAllBytes(caminho);
        String leitura = new String(texto1);
        
        JOptionPane.showMessageDialog(null,leitura);
       }catch(Exception erro){}
            
        
    }
    
}
