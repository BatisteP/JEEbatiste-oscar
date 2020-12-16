package metier;

import java.util.ArrayList;
import java.util.HashMap;

public class Caddy {
	private ArrayList<Article> produits;
	public Caddy() {
		setProduits(new ArrayList<Article>());
	}
	public ArrayList<Article> getProduits() {
		return produits;
	}
	public void setProduits(ArrayList<Article> produits) {
		this.produits = produits;
	}
}
