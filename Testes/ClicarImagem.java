
package testes;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ClicarImagem extends JFrame{
    
    boolean mousePressionado= false;
    
    ImageIcon fundo = new ImageIcon(getClass().getResource("fundo.jpg"));
    
    ImageIcon Qazul = new ImageIcon(getClass().getResource("quadrado-azul.png"));
    ImageIcon QVerm = new ImageIcon(getClass().getResource("quadrado-vermelho.png"));
    JLabel l = new JLabel(Qazul);
    JLabel f = new JLabel(fundo);
    
           
            
    public ClicarImagem(){
        editarComponentes();
        new Mover().start();
        
       
    }
    
    public void editarComponentes(){
        int x = (int)(Math.random()*400);
        int y = (int)(Math.random()*400);
        l.setBounds(x,y,70,70);
        f.setBounds(0, 0, 477, 457);
        
        addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent me) {
                l.setIcon(QVerm);
               
            }

            public void mousePressed(MouseEvent me) {
                mousePressionado = true;
            }

            public void mouseReleased(MouseEvent me) {
                mousePressionado = false;
            }

            public void mouseEntered(MouseEvent me) {
            }

            public void mouseExited(MouseEvent me) {
            }
            
        });
       
    }
    
    public class Mover extends Thread{
        public void run(){
            while(true){
            try{
               sleep(10);
            }catch(Exception erro){}
            if(mousePressionado){
            Point ponto = getMousePosition();
            l.setBounds(ponto.x-40, ponto.y-60, 70, 70);
                }
            }
        }
    }
    
    public void init(){
       
        
        setTitle("Movendo Imagem");
        setSize(480,480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
         add(l);
         add(f);
    }
    
    public static void main(String[] args) {
        new ClicarImagem().init();
    }
    
}
