package Entidades;

public class Validacion{
	
	public static boolean validarNumero(String campo){
		if (campo.matches("\\d{1,3}"))
			 return true;
		else return false;
	}
	public static boolean validarNombre(String campo){
		if (campo.matches("([A-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)*")
			 || campo.matches("[A-Z][a-zA-Z]*"))
			 return true;
		else return false;
	}
	public static boolean validarUsuario(String campo){
		if (campo.matches("[a-zA-Z0-9]*"))
			 return true;
		else return false;
	}public static boolean validarPassword(String campo){
		if (campo.matches("[a-zA-Z0-9]*"))
			 return true;
		else return false;
	}
}

