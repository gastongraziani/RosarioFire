package CapaNegocio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entidades.Usuario;
import Entidades.Validacion;
import CapaDatos.UsuarioAddapter;


/**
 * Servlet implementation class LoginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub   
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nomUsuario = request.getParameter("un");
		String passUsuario = request.getParameter("pw"); 
		
		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			if( nomUsuario.isEmpty()||passUsuario.isEmpty()){
				//"Por favor llene todos los campos"
				out.println("Por favor, complete los campos faltantes");
				}
			else if(!Validacion.validarUsuario(nomUsuario)){
				//"Por favor introduzca un nombre de usuario valido (caracteres o digitos sin espacios)"
				out.println("Por favor introduzca un nombre de usuario valido (caracteres o digitos sin espacios)");
				}
			else if(!Validacion.validarPassword(passUsuario)){
				//Por favor introduzca una contraseña valida (caracteres o digitos sin espacios)"
				out.println("Por favor introduzca una contraseña valida (caracteres o digitos sin espacios)");
			}
			else{
				Usuario user = null;
				user = UsuarioAddapter.GetOne(nomUsuario, passUsuario);
				if (user == null){
					out.println("Usuario inexistente, continua como visitante");
				}
				else
					if(user.getAdmin()){
						//Opciones Admin
						HttpSession session = request.getSession(true); 
						session.setAttribute("currentSessionUser",user); 
						response.sendRedirect("InicioAdmin.jsp"); 
					}
					else{
						//Opciones User
						HttpSession session = request.getSession(true); 
						session.setAttribute("currentSessionUser",user); 
						response.sendRedirect("InicioUser.jsp");
					}
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e); 
		}
	}

}

