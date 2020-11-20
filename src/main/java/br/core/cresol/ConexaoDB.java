package br.core.cresol;

import java.sql.*;

public class ConexaoDB {
	
	
		
		private String url;
		private String usuario;
		private String senha;
		private Connection con;
		
		ConexaoDB() {
			url = "jdbc:postgresql://10.1.2.4:5439/colmeia_arp"; //Local
			//url = "jdbc:postgresql://10.90.2.143:5432/colmeia_tst"; //Cresol paralelo
			//url = "jdbc:postgresql://10.90.2.75:5432/colmeia_tst";
			usuario = "colmeia"; //local
			senha = "fabrica";   // local
			//usuario = "analista";
			//senha = "consulta"; 
			
			try {
				
				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection(url,usuario,senha);
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
		public ResultSet executaBusca(String sql) {
			
			try {
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery(sql);
				con.close();
				return rs;
				
			} catch (Exception e) {
		      e.printStackTrace();
		      return null;
			}
			
			
		}
		
		
	}

