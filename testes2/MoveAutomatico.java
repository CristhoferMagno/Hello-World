
package testes2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MoveAutomatico extends JFrame{
    
    ImageIcon imagemV = new ImageIcon(getClass().getResource("quadrado-vermelho.png"));
    ImageIcon imagemA = new ImageIcon(getClass().getResource("quadrado-azul.png"));
    
    JLabel V = new JLabel(imagemV);
    JLabel A = new JLabel(imagemA);
    
    public MoveAutomatico(){
        init();
        editar();
        new Auto().start();
    }
    
    public void editar(){
        
       V.setBounds(0,50,70,70);
       A.setBounds(0,150,70,70);
    }
    
    public void init(){
        add(V);
        add(A);
        
        setTitle("Movendo Imagem auto");
        setSize(700,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
    }
    
    public class Auto extends Thread{
        
        public void run(){
            while(true){
                try{
                    sleep(30);
                }catch(Exception erro){}
                int x = (int)(Math.random()*15);
                int x2 = (int)(Math.random()*15);

                V.setBounds(V.getX()+x, 50, 70, 70);
                A.setBounds(A.getX()+x2,150,70,70);
            }
        }
    }
    
    public static void main(String[] args) {
        new MoveAutomatico();
    }
}
