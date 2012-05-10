import java.util.*;

public class Lager {
	
	public Lager(){
		lager.add(new Artikel("Wurst", 3500, 42));
		lager.add(new Artikel("Kaese", 3000, 445));
		lager.add(new Artikel("Fahrrad", 2300, 5));
		lager.add(new Artikel("Stuhl", 1450, 45));
		lager.add(new Artikel("Buch", 3000, 56));
		lager.add(new Artikel("Auspuff", 5000, 24));
		lager.add(new Artikel("Hose", 900, 13));
		lager.add(new Artikel("Ball", 1500, 45));
		lager.add(new Artikel("Tshirt", 750, 25));
		lager.add(new Artikel("Hut", 600, 58));
	}
	
	 Vector<Artikel> lager = new Vector<Artikel>();

	 public Vector<Artikel> getLager() {
		return lager;
	}


	
}
