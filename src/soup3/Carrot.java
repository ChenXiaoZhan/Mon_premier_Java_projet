package soup3; //Binôme Philippe ALLAIN et Zhan CHEN

public class Carrot extends Vegetable {


	//constructeur modifié pour la question (4) partie III
	Carrot(double kg, int cm) {
		this.kg=kg;
		this.cm = cm;
	}
	@Override
	public String toString() {
		return String.format("Carrot: [" + getCalories() + " calories - " + kg +" kg" + " - " + cm + " cm]");
	}

	

}
