package Entidades;

public class Usuario{
	private String nomUsuario,claveUsuario;
	private boolean admin;
	public Usuario(String usu, String pass, boolean adm){
		nomUsuario = usu;
		claveUsuario = pass;
		admin = adm;
	}
	public String getUsuario(){
		return nomUsuario;
	}
	public String getClave(){
		return claveUsuario;
	}
	public boolean getAdmin(){
		return admin;
	}
}