package soup3; //Binôme Philippe ALLAIN et Zhan CHEN

public class Potatoe extends Vegetable {
	
	protected int yeux; 

	Potatoe(double kg) {
		this.yeux = (int) (kg*10);
		this.kg=kg;
	}
	
	//constructeur modifié pour la question (4) partie III
	Potatoe(double kg, int yeux) {
		this.kg = kg; 
		this.yeux = yeux;
	}
	
	public String toString() {
		if (yeux == 0) {
		return String.format("Patate: ["+kg+" kg" + " - " + yeux + " yeux]");
	}else {
		return String.format("Patate: [" + getCalories() + " calories - " + kg +" kg" + " - " + yeux + " yeux]");
		}
	}
	
	
	//@Overrider getPeelingWeight
	public double getPeelingWeight() {
		return super.getPeelingWeight()+0.01*yeux;
	}
	
	//@Override getCalorie
	public int getCalories() {
		return (int)((kg-getPeelingWeight())*800-5*yeux);
	}
}
