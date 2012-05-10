import java.util.Vector;


 class RoboterThread implements Runnable{
	 
	 private Vector<Artikel> lager = new Vector<Artikel>();
	 private Vector<Artikel> warenkorb = new Vector<Artikel>();
	 private String ware="";
	 private int anzahl;
	 private int suchzeit;
	 
	 public RoboterThread(Vector<Artikel> lager, Vector<Artikel> warenkorb, String ware, int anzahl, int suchzeit){
		 this.lager=lager;
		 this.warenkorb=warenkorb;
		 this.ware=ware;
		 this.anzahl=anzahl;
		 this.suchzeit=suchzeit;
	 }
	
	public void run(){
				kauf();
			}

	public synchronized void kauf(){
		try {
			Thread.sleep(suchzeit);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i=0; i<lager.size(); i++){
			if(lager.elementAt(i).getName().equals(ware)){
				if(lager.elementAt(i).getMenge()-anzahl<0){
					try {
						throw new Ausverkauft("Ausverkauft oder Bestellmenge zu groß.\n");
					} catch (Ausverkauft e) {
						System.out.println(e);
						break;
					}
				}	else{
					 boolean nochNichtVorhanden = true;
					Artikel artikel = new Artikel(lager.elementAt(i).getName(), lager.elementAt(i).getSuchzeit(), anzahl); 
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
	}
}
