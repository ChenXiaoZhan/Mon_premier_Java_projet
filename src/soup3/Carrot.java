package soup3; //Bin�me Philippe ALLAIN et Zhan CHEN

public class Carrot extends Vegetable {


	//constructeur modifi� pour la question (4) partie III
	Carrot(double kg, int cm) {
		this.kg=kg;
		this.cm = cm;
	}
	@Override
	public String toString() {
		return String.format("Carrot: [" + getCalories() + " calories - " + kg +" kg" + " - " + cm + " cm]");
	}

	

}
