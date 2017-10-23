
package programasoma;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ProgramaSoma extends JFrame{
    
    JTextField t1,t2;
    JLabel lSoma,lResultado;
    JButton Calcula;
    Font fonte = new Font("Arial",Font.BOLD,40);
    
    public ProgramaSoma(){
        t1 = new JTextField(2);
        t2 = new JTextField(2);
        lSoma = new JLabel("+");
        lResultado = new JLabel();
        Calcula = new JButton("=");
        
        t1.setFont(fonte);
        t2.setFont(fonte);
        lSoma.setFont(fonte);
        lResultado.setFont(fonte);
        Calcula.setFont(fonte);
        
        getContentPane().setLayout(new FlowLayout());
    }
    
    public void init(){
        add(t1);
        add(lSoma);
        add(t2);
        add(Calcula);
        add(lResultado);
        
        Calcula.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                int x = Integer.parseInt(t1.getText());
                int y = Integer.parseInt(t2.getText());
                int resultado = x + y;
                
                lResultado.setText(String.valueOf(resultado));
            }
        });
        
        
        setSize(400,130);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
   
    public static void main(String[] args) {

        new ProgramaSoma().init();
    }
    
}
