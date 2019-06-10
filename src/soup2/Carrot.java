package soup2; //Binôme Philippe ALLAIN et Zhan CHEN

public class Carrot extends Vegetable {

	Carrot(double kg, int cm) {
		this.kg=kg;
		this.cm=cm;
	}
	@Override
	public String toString() {
		return String.format("Carotte: ["+kg+" kg" + " - " + cm + " cm]");
	}
	

	public int getCm() {
		return this.cm;
	}
}
