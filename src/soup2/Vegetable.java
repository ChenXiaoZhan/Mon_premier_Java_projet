package soup2; //Binôme Philippe ALLAIN et Zhan CHEN

public abstract class Vegetable {
	protected double kg;
	protected int cm;
	protected int yeux; 
	
	public static double pourcentage = 0.1;
	public double getPeelingWeight() {
		return kg*Vegetable.pourcentage;
	};
	
	public static void setPeelingWeight(double pourcentage) {
		Vegetable.pourcentage = pourcentage;
	}

	public double getKg() {
		return this.kg;
	}
	
	public int getCm() {
		return this.cm;
	}
	public int getYeux() {
		return this.yeux;
	}
}
