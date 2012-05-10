
public class Artikel{
	private String name;
	private int suchzeit;
	private int menge;
	
	public Artikel(String name, int suchzeit, int menge){
		this.name = name;
		this.suchzeit = suchzeit;
		this.menge = menge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSuchzeit() {
		return suchzeit;
	}

	public void setSuchzeit(int suchzeit) {
		this.suchzeit = suchzeit;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}
}
