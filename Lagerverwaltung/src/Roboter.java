import java.util.Vector;


public class Roboter{
	private boolean beschaeftigt = false;
	
	
	public void kauf(Vector<Artikel> lager, Vector<Artikel> warenkorb, String ware, int anzahl){
	beschaeftigt=true;
		for (int i=0; i<lager.size(); i++){
			if(lager.elementAt(i).getName().equals(ware)){
				if(lager.elementAt(i).getMenge()-anzahl<0){
					try {
						throw new Ausverkauft("Ausverkauft oder Bestellmenge zu gro§.\n");
					} catch (Ausverkauft e) {
						System.out.println(e);
						break;
					}
				}	else{
					 boolean nochNichtVorhanden = true;
					Artikel artikel = new Artikel(lager.elementAt(i).getName(), lager.elementAt(i).getSuchzeit(), anzahl); //new Artikel("Wurst", 0.3, anzahl);// 
					lager.elementAt(i).setMenge(lager.elementAt(i).getMenge()-anzahl);

					for (int y=0; y<warenkorb.size(); y++) {
						if(warenkorb.elementAt(y).getName().equals(ware))
						{
							nochNichtVorhanden = false;
							warenkorb.elementAt(y).setMenge(warenkorb.elementAt(y).getMenge()+anzahl);
							if(warenkorb.elementAt(y).getMenge()==0)
								warenkorb.remove(y);	
						}
					}
					if(nochNichtVorhanden){
						warenkorb.add(artikel);
					}	
				}
			}
		}
		beschaeftigt=false;
	}
	
	public boolean getStatus(){
		return beschaeftigt;
	}
}	

