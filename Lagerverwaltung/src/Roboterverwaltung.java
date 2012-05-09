import java.util.Vector;

public class Roboterverwaltung {
	Vector<Roboter> roboterGarage = new Vector<Roboter>();

	public Roboterverwaltung() {
		for (int i = 0; i < 5; i++) {
			roboterGarage.add(new Roboter());
		}
	}
	
	public void delegieren(){
		boolean zugewiesen = false;
		while(zugewiesen == false){
			
		}
	}
}
