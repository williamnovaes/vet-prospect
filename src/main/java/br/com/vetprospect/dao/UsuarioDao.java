package br.com.vetprospect.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDao  {
	
	public void Teste() {
		String sql = "Select * from vet.tipo_usuario;";
		try {
			PreparedStatement ps = DB.conectar().prepareStatement(sql);
			
			Logger.getLogger(ps.getResultSet().toString()).log(Level.INFO, null, "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}