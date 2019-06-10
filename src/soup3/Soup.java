package soup3; //Binôme Philippe ALLAIN et Zhan CHEN

public class Soup extends Vegetable {
	Vegetable[] s = new Vegetable[2];
	Soup(){
	}

	@Override
	public String toString() {
		return String.format("Soupe\n------\n" +getCalories() + " calories" +"\n" + s[0].toString() + "\n" + s[1].toString()   + "\n------" );
	
	}

	int index = 0;
	public void add(Vegetable v) {
		s[index] = v;
		index = index +1;
	}
	public double getPeelingWeight() {
		double total = 0;
		for (int indice = 6; indice <=7; indice++) {
			total = total+ s[indice].getPeelingWeight();
		}
		return total;
	}

	@Override
	public int getCalories() {
		int totalCalories = 0;
		for (int indice = 0; indice <=1; indice++) {
			totalCalories = totalCalories + s[indice].getCalories();
		}
		return (totalCalories );
	}
	

	

}

	/*public Vegetable[] add(Vegetable v) {
	
	Vegetable[] soup = new Vegetable[1];
    soup[soup.length - 1] =  v;
    return soup;
	}*/
	/*int index = 0;
	double percentage = 0.1;
	public void add(Vegetable a) {
		
		v[index] = a;
		index += 1;
	}*/
	/*public Vegetable[] add(Vegetable v) {
		Vegetable[] soup = new Vegetable[0];
		Vegetable[] Newsoup = new Vegetable[soup.length + 1];
	    for (int index = 0; index < soup.length; index++) {
	    	Newsoup[index] = soup[index];
	    Newsoup[Newsoup.length - 1] =  v;
	    }
	    return Newsoup;
	    }*/

