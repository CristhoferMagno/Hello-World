
package testes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MoverImagem extends JFrame{
    
     ImageIcon imgFundo = new ImageIcon(getClass().getResource("fundo.jpg"));  
     ImageIcon imgQuadradoVermelho = new ImageIcon(getClass().getResource("quadrado-vermelho.png"));
     ImageIcon imgQuadradoAzul = new ImageIcon(getClass().getResource("quadrado-azul.png"));
    
     private JLabel imagemParede,imagemQuadrado;
    
    int x = 200,y =200;
    
            
    public MoverImagem(){
        imagemParede = new JLabel(imgFundo );
        imagemQuadrado =new JLabel(imgQuadradoAzul);

          editarComponentes();
          Movimento();
    }
    public void editarComponentes(){
        
        imagemParede.setBounds(0,0,477,455);
        imagemQuadrado.setBounds(x,y,70,70);
    }
    
    public void Movimento(){
        addKeyListener(new KeyListener(){
            public void keyTyped(KeyEvent ke) {
            }

            public void keyPressed(KeyEvent ke) {
             imagemQuadrado.setIcon(imgQuadradoVermelho);

                if(ke.getKeyCode() == 37){
                    x -=10;
                }
                if(ke.getKeyCode() == 38){
                    y -=10;
                }
                if(ke.getKeyCode() == 39){
                    x += 10;
                }
                if(ke.getKeyCode() == 40){
                    y += 10;
                }
                imagemQuadrado.setBounds(x,y,70,70);
            }

            public void keyReleased(KeyEvent ke) {
             imagemQuadrado.setIcon(imgQuadradoAzul);
            }
            
        });
        
    }
    
    public void init(){
        add(imagemQuadrado);
        add(imagemParede);
        
        
        
        setTitle("Movendo Imagem");
        setSize(490,490);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        
        new MoverImagem().init();
    }
}
