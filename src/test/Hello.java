package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--> do Get");
		// TODO Auto-generated method stub
		response.getWriter().append("Served (get) bonjour  at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		Pangolin p = new Pangolin(user,"07/08/1998");
		request.setAttribute("pango", p);
		request.setAttribute("user", user);
		request.setAttribute("password", password);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/panier") ;
	    
	     // redirection de la requête vers cette ressource
	    requestDispatcher.forward(request, response) ;
		
		//String password =request.getParameter("password");
		/*if (user.equals("batiste")&&password.equals("1234")) {
			response.getWriter().append("Bienvenue ").append(user).append(" voici votre mot de passe ! cachez le bien ! "+password);
		}*/
		
		
	}

}
