package ftt.ec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

//Test MySQL JDBC connection...
//https://www.devmedia.com.br/jdbc-tutorial/6638

public class DatabaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DB Teste");
		System.out.println(new Date());
		
		String dbURL  = "jdbc:mysql://localhost:3306/ftt"; 
		
		//Hardcode :-o - Local
		String dbUser = "scott";
		String dbPwd  = "EsqEJP5jmbYy6eSj"; // -T1g3r
		
		//Production Server or serverless with CI/CE GitHub actions...
		//String dbUser = System.getenv("DB_USER");
		//String dbPwd  = System.getenv("DB_PWD");

		try{

		    Class.forName("com.mysql.jdbc.Driver");

		}catch(ClassNotFoundException cnfe){

		    cnfe.printStackTrace();

		}
		
		try{

		     Connection conexao = DriverManager.getConnection(dbURL, dbUser, dbPwd);

		     Statement stmt = conexao.createStatement();  //conexao é o nome da variável que criamos acima

		     ResultSet resultado = stmt.executeQuery("select now() agora, version() versao from dual");

		     while(resultado.next()) { 	
		    	 
		    	 System.out.println(resultado.getString("agora"));
		    	 System.out.println(resultado.getString("versao"));
		    	 
		    	
		     }
		     
		     resultado.close(); //fecha o ResultSet

		     stmt.close(); //fecha o Statement

		     conexao.close(); //encerra a conexão
		     
		     
		} catch(SQLException sqle) {

		     sqle.printStackTrace();

		}
		
	}

}
