package tag;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import metier.Article;
import metier.Caddy;

public class AffichageContenuPanier extends SimpleTagSupport {
	private String username;
	public void setUsername(String username) {this.username = username;}
	public String getUsername() {
		return this.username;
	}
	public void doTag() throws JspException, IOException{
		PageContext PCprincipal = (PageContext) getJspContext();
		HttpSession session = PCprincipal.getSession();
		
		
		
		Caddy caddy = (Caddy) session.getAttribute("Caddy");
		JspWriter out = getJspContext().getOut();
		out.println( "<h3>Contenu du panier de "+username+" : </h3>");
		out.println("<table><tr>"+
		"<td>Designation</td>"+
		"<td>Prix de un</td>"+
		"<td>Quantite</td>"+
		"<td>prix total</td></tr>");
		for (Article a : caddy.getProduits()) {
			out.println("<tr><td>"+a.getLibelle()+"</td>"+
			"<td>"+a.getPrice()+"</td>"+
			"<td>"+a.getQuantite()+"</td>"+
			"<td>"+(a.getPrice()*a.getQuantite())+"</td></tr>"
					);
		}
		out.println("</table>");
		//todo: fichier .tlddiapo page 37
		
		
		
	}
}