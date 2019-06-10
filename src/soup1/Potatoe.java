package soup1; //Binôme Philippe ALLAIN et Zhan CHEN

public class Potatoe {
	private double kg;
	private int yeux;
	Potatoe(double kg, int yeux) {
		this.kg=kg;
		this.yeux=yeux;
	}
	
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








	
	
}
