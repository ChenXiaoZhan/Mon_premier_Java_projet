package soup3; //Binôme Philippe ALLAIN et Zhan CHEN

public abstract class Vegetable implements Quantifiable {
	protected double kg; 
	protected int calories;
	protected int cm;
	
	public static double pourcentage = 0.1;
	public double getPeelingWeight() {
		return kg*Vegetable.pourcentage;
	};
	
	
	public static void setPeelingWeight(double pourcentage) {
		Vegetable.pourcentage = pourcentage;
	}
	
	
	//question 3 partie III
	public int getCalories() {
		return (int)((kg-getPeelingWeight())*400);
	}
	

}
