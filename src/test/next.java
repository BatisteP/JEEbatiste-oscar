package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class next
 */
@WebServlet("/next")
public class next extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public next() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Pangolin b =(Pangolin) request.getAttribute("pango");
		String password= (String) request.getAttribute("password");
		
		if (b.getUser().equals("batiste")&& password.equals("1234") ) {
			response.getWriter().append("Bienvenue ").append(b.getUser()+" "+ b.getBirthday()).append(" voici votre mot de passe ! cachez le bien ! "+password);
		}
		else {response.getWriter().append("tu t'es trompé de username/mot de passe! c'est de ta faute! username fourni : "+b.getUser()+" password fourni : "+  password);}
		
		
	}

}
