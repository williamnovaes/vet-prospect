package br.com.vetprospect.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
	public static Connection conn = null;
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String serverName = "localhost:3306";
			String database = "vet-prospect";
			
			StringBuilder url = new StringBuilder("jdbc:mysql//").append(serverName).append("/").append(database).append("?autoReconnet=true&useSSL=false");
			
			String userName = "root";
			String password = "";
			
			conn = (Connection) DriverManager.getConnection(url.toString(), userName, password);
			
			Logger.getLogger("Conexão realizaca com sucesso!").log(Level.INFO, null, "");
		} catch (ClassNotFoundException e) {
			Logger.getLogger("Erro na classForName").log(Level.SEVERE, null, e);
		} catch (SQLException sql) {
			Logger.getLogger("Erro no banco: ").log(Level.SEVERE, null, sql);			
		}
		return conn;
	}
}
