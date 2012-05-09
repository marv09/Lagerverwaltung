import java.util.*;

public class Lager {
	
	public Lager(){
		lager.add(new Artikel("Wurst", 0.3, 42));
		lager.add(new Artikel("Kaese", 0.3, 445));
		lager.add(new Artikel("Fahrrad", 2.3, 5));
		lager.add(new Artikel("Stuhl", 1.45, 45));
		lager.add(new Artikel("Buch", 0.3, 56));
		lager.add(new Artikel("Auspuff", 0.5, 24));
		lager.add(new Artikel("Hose", 0.9, 13));
		lager.add(new Artikel("Ball", 0.15, 45));
		lager.add(new Artikel("Tshirt", 0.75, 25));
		lager.add(new Artikel("Hut", 0.6, 58));
	}
	
	 Vector<Artikel> lager = new Vector<Artikel>();

	 public Vector<Artikel> getLager() {
		return lager;
	}


	
}
