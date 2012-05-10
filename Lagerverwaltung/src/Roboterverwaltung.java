import java.util.Vector;

public class Roboterverwaltung {
	Vector<Roboter> roboterGarage = new Vector<Roboter>();

	public Roboterverwaltung() {
		for (int i = 0; i < 5; i++) {
			roboterGarage.add(new Roboter());
		}
	}
	
	public void delegieren(Vector<Artikel> lager, Vector<Artikel> warenkorb, String ware, int anzahl, int suchzeit){
		boolean zugewiesen = false;
		while(zugewiesen==false){
			for(int i=0; i<roboterGarage.size(); i++){
				if(roboterGarage.elementAt(i).getStatus()==false){
					roboterGarage.elementAt(i).kauf(lager, warenkorb, ware, anzahl, suchzeit);
					zugewiesen=true;
					break;
				}
			}
		}
	}
}
