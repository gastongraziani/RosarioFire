package CapaDatos;

import java.sql.*;
import Entidades.Usuario;

public class UsuarioAddapter {

	public static Usuario GetOne(String user,String pass){
		Usuario usu = null; 	
	    String sql = "select * from usuarios where usuario = '"+user+"' and clave = '"+pass+"'";
	    	
	    try 
	    {
	    	Connection miConexion = ConexionBD.GetConnection();
	    	Statement st;
		    ResultSet rs;
	    	st = miConexion.createStatement();
			rs = st.executeQuery(sql);
			rs.next();
			usu = new Usuario(rs.getString(1),rs.getString(2), rs.getBoolean(3));
		}
	    catch (SQLException e) 
	    {
		// TODO: handle exception
			e.printStackTrace();
		}
	    
	    return usu;
	}
}