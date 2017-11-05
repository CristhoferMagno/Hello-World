
package ConectaBancoPet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConectaPet {
    public Connection con;
    public Statement stm;
    public ResultSet rs;
    
    private String url ="jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String pass = "cm1996";
    
    
    public void conectar(){
        try {
            con = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Banco conectado");
        } catch (SQLException ex) {
            System.out.println("Erro de conexão");
        }
        
        
    }
    
             public void inseri(String id,String nome,String qtd,Double preco){
    String url = "jdbc:mysql://localhost:3306/db_loja";
    String ins = "INSERT INTO pet_shop (id_produto,nome_produto,quantidade,preco) VALUES('"+id+"','"+nome+"','"+qtd+"','"+preco+"')";
    try{
        Connection con = DriverManager.getConnection(url, "root", "cm1996");
        PreparedStatement stm = con.prepareStatement(ins);
        stm.executeUpdate();
        JOptionPane.showMessageDialog(null, "Dados inseridos!");
}catch(Exception e){
        System.out.println("erro: "+e);
}
    }
    
}
