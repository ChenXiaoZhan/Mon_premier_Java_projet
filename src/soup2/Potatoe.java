package soup2;//Binôme Philippe ALLAIN et Zhan CHEN

public class Potatoe extends Vegetable {
	
	Potatoe(double kg, int yeux) {
		this.kg=kg;
		this.yeux=yeux;
	}
	
	protected int nbredegerme;
	Potatoe(double kg) {
		this.yeux = (int) (kg*10);
		this.kg=kg;
	}
	
	@Override
	public String toString() {
		if (yeux == 0) {
		return String.format("Patate: ["+kg+" kg" + " - " + yeux + " yeux]");
	}else {
		return String.format("Patate: ["+kg+" kg" + " - " + yeux + " yeux]");
		}
	}
	
	//@Overrider
	public double getPeelingWeight() {
		return super.getPeelingWeight()+0.01*yeux;
	}
}
