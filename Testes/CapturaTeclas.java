
package testes;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class CapturaTeclas extends JFrame{
   
    
    
    public CapturaTeclas(){
        super("capturando as teclas");
        
        addKeyListener(new KeyAdapter(){
            
            public void keyPressed(KeyEvent e){
                
                //int r = e.getKeyCode();
                char c = e.getKeyChar();
                System.out.println(c);
            }
        });
        
        
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new CapturaTeclas();
    }
}
