package metier;

import java.util.ArrayList;
import java.util.HashMap;

public class Caddy {
	private ArrayList<Article> produits;
	private DB database ;
	public Caddy() {
		setProduits(new ArrayList<Article>());
		 database = new DB();
	}
	public void addArticle(int num) {
		for (Article a : produits) {
			if (a.getNum()==num) {
				a.setQuantite(a.getQuantite()+1);
			}
			else produits.add(database.findArticle(num));
			
		}
	}
	public ArrayList<Article> getProduits() {
		return produits;
	}
	public void setProduits(ArrayList<Article> produits) {
		this.produits = produits;
	}
}
