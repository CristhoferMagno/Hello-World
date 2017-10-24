
package testes2;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Movimento extends JFrame{
    
    
    ImageIcon imagemV = new ImageIcon(getClass().getResource("quadrado-vermelho.png"));
    ImageIcon imagemA = new ImageIcon(getClass().getResource("quadrado-azul.png"));
    
      JLabel V = new JLabel(imagemV);
    JLabel A = new JLabel(imagemA);
    
    public Movimento(){
        init();
        editar();
       new MoveBate().start();
    }
    public void editar(){
      
        V.setBounds(5,100,70,70);
        A.setBounds(910, 100, 70, 70);
    }
    
    public void init(){
  
        add(V);
        add(A);
        
        setTitle("colisao de imagens");
        setSize(1000,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
    }
    
    public class MoveBate extends Thread{
        public void run(){
            while(true){
                try{sleep(10);}catch(Exception erro){}
                
                int x1 = (int)(Math.random()*6);
                int x2 = (int)(Math.random()*6);
               
                V.setBounds(V.getX()+x1,100,70,70);
                A.setBounds(A.getX()-x2,100, 70, 70);
                if(bateu(A, V)){
                    JOptionPane.showMessageDialog(null, "BATEU!");
                    System.exit(0);
                }
            }
        }
    } 
    public static void main(String[] args) {
        new Movimento();
    }
    
    public boolean bateu(Component a, Component b) {
		int aX = a.getX();
		int aY = a.getY();
		int ladoDireitoA = aX+a.getWidth();
		int ladoEsquerdoA= aX;
		int ladoBaixoA= aY+a.getHeight();
		int ladoCimaA= aY;
		
		int bX = b.getX();
		int bY = b.getY();
		int ladoDireitoB = bX+b.getWidth();
		int ladoEsquerdoB= bX;
		int ladoBaixoB= bY+b.getHeight();
		int ladoCimaB= bY;
		
		boolean bateu = false;
		
		boolean cDireita=false;
		boolean cCima=false;
		boolean cBaixo=false;
		boolean cEsquerda=false;
		
		if(ladoDireitoA>=ladoEsquerdoB) {
			cDireita=true;
		}
		if(ladoCimaA<=ladoBaixoB) {
			cCima=true;
		}
		if(ladoBaixoA>=ladoCimaB) {
			cBaixo=true;
		}
		if(ladoEsquerdoA<=ladoDireitoB) {
			cEsquerda=true;
		}
		
		if(cDireita && cEsquerda && cBaixo && cCima) {
			bateu = true;
		}
			
		return bateu;
	}

}
