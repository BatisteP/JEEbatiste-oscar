package metier;

import java.util.HashMap;

public class DB {
	public HashMap<Integer, Article> articlesExistants;
	public DB() {
		articlesExistants = new HashMap<Integer, Article>();
		Article piano = new Article();
		piano.setNum(12345);
		piano.setLibelle("piano");
		piano.setPrice(1299.99);
		Article flute = new Article();
		piano.setNum(19872);
		piano.setLibelle("flute à bec");
		piano.setPrice(12.99);
		articlesExistants.put(12345, piano);
		articlesExistants.put(19872, flute);
	}
	

	public Article findArticle(int num) {
		return articlesExistants.get(num);
	}

}
