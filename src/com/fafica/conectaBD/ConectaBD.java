package com.fafica.conectaBD;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * In�cio da classe de conex�o com BD.
 */

public class ConectaBD {
             
    private static Connection connection;          
            
/**
 * M�todo que tenta fazer a conex�o com o banco de dados
 * @return Connection
 */
 
public static Connection AbriConexao() {

/** Carregando o JDBC Driver padr�o. */

try {  
        // Carrega o driver JDBC driver  
       	Class.forName("oracle.jdbc.driver.OracleDriver");  
      
        // Cria conex�o com a database  
       	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
       	String user = "system";
       	String password = "system";
        connection = DriverManager.getConnection(url, user, password);
        return connection;
        
        } catch (ClassNotFoundException e) {  //Driver n�o encontrado

        	 JOptionPane.showMessageDialog(null,"O driver expecificado nao foi encontrado.");
            System.exit(0);
            return null;

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"Nao foi possivel conectar ao Banco de Dados.\n\n"+e);
            System.exit(0);
            return null;

        }
}

   /**M�todo que fecha sua conexão. */
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
		JOptionPane.showMessageDialog(null, "Conex�o realizada com sucesso!");
	}
	else{
		JOptionPane.showMessageDialog(null, "Sem conexao");
	}
	
}

}