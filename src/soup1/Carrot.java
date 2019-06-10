package soup1; //Binôme Philippe ALLAIN et Zhan CHEN

public class Carrot {

	private double kg;
	private int cm;
	Carrot(double kg, int cm) {
		this.kg=kg;
		this.cm=cm;
	}
	@Override
	public String toString() {
		return String.format("Carotte: ["+kg+" kg" + " - " + cm + " cm]");
	}



}
