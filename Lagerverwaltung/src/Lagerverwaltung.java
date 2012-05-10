import java.util.*;

public class Lagerverwaltung {

	public static void main(String[] args) {
		Lager l1 = new Lager();
		Warenkorb w1 = new Warenkorb();
		Roboterverwaltung r1 = new Roboterverwaltung();
		Lagerverwaltung lager = new Lagerverwaltung();
		Scanner input = new Scanner(System.in);
		String ware = "";
		int anzahl = 0;
		lager.ausgabeLager(l1);
		
		while(true){
		boolean vorhanden = false;
		System.out.println("\nWelchen Artikel mšchten Sie in den Warenkorb legen?");
		ware = input.nextLine();
		for(int i = 0; i<l1.getLager().size(); i++){
			if(l1.getLager().elementAt(i).getName().equals(ware)){
				System.out.println("\nWelche Anzahl mšchten Sie in den Warenkorb legen?");
				anzahl =  Integer.parseInt(input.nextLine());
		        vorhanden=true;
				r1.delegieren(l1.getLager(), w1.getKorb(), ware, anzahl);
			}else if (vorhanden==false) {
				System.out.println("\nArtikel nicht vorhanden\n");
				break;
			}
		}
		lager.ausgabeLager(l1);
	    lager.ausgabeWarenkorb(w1);
	}
}
        
	public void ausgabeLager(Lager l1){
		for(int i=0; i<l1.lager.size();i++){
			System.out.println("Lager	" + l1.lager.elementAt(i).getName() + "   " +l1.lager.elementAt(i).getMenge());	
		}
	}
	
	public void ausgabeWarenkorb(Warenkorb w1){
		for(int i=0; i<w1.korb.size();i++){
			System.out.println("Korb	" + w1.korb.elementAt(i).getName() + "   " +w1.korb.elementAt(i).getMenge());	
		}
	}
}
