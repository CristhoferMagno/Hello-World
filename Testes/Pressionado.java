
package testes;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Pressionado extends JFrame{
    
    ImageIcon imagem = new ImageIcon(getClass().getResource("quadrado-azul.png"));
    ImageIcon fundo = new ImageIcon(getClass().getResource("fundo.png"));
    
    JLabel f = new JLabel(fundo);
    JLabel l = new JLabel(imagem);
    
    public Pressionado(){
        int x = (int)(Math.random()*400);
        int y = (int)(Math.random()*400);
        f.setBounds(0,0,500,500);
        l.setBounds(x, y, 70, 70);
        
        
    }
    
    public void init(){
        add(l);
        add(f);
        
        setTitle("Movendo Imagem");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
    }
    
    public static void main(String[] args) {
        new Pressionado().init();
    }
}
