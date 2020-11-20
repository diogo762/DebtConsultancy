package br.core.cresol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDB2 {
	
	
		
		private String url;
		private String usuario;
		private String senha;
		private Connection con2;
		
		ConexaoDB2() {
			url = "jdbc:postgresql://10.90.2.75:5432/boa_vista_des";
			usuario = "boa_vista";
			senha = "fabrica"; 
			
			try {
				
				Class.forName("org.postgresql.Driver");
				con2 = DriverManager.getConnection(url,usuario,senha);
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		public ResultSet executaBusca(String sql) {
			
			try {
				Statement stm = con2.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				con2.close();
				return rs;
				
			} catch (Exception e) {
		      e.printStackTrace();
		      return null;
			}
			
			
		}
		
}
		