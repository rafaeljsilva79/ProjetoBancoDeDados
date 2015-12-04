package com.fafica.conectaBD;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Início da classe de conexão com BD.
 */

public class ConectaBD {
             
    private static Connection connection;          
            
/**
 * Método que tenta fazer a conexão com o banco de dados
 * @return Connection
 */
 
public static Connection AbriConexao() {

/** Carregando o JDBC Driver padrão. */

try {  
        // Carrega o driver JDBC driver  
       	Class.forName("oracle.jdbc.driver.OracleDriver");  
      
        // Cria conexão com a database  
       	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
       	String user = "system";
       	String password = "system";
        connection = DriverManager.getConnection(url, user, password);
        return connection;
        
        } catch (ClassNotFoundException e) {  //Driver não encontrado

        	 JOptionPane.showMessageDialog(null,"O driver expecificado nao foi encontrado.");
            System.exit(0);
            return null;

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"Nao foi possivel conectar ao Banco de Dados.\n\n"+e);
            System.exit(0);
            return null;

        }
}

   /**Método que fecha sua conexÃ£o. */
public static boolean FecharConexao() {

        try {
            ConectaBD.AbriConexao().close();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
}

public static void StatusConexao(){
	if (connection != null){
		JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
	}
	else{
		JOptionPane.showMessageDialog(null, "Sem conexao");
	}
	
}

}