package soup2;//Binôme Philippe ALLAIN et Zhan CHEN

public class Soup extends Vegetable {
	Vegetable[] s = new Vegetable[8];
	//Soup(){
		//System.out.println("Soupe");
		//System.out.println("------");
		
	//}
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

	public String toString() {
		String str = "";
		for (int i = 0; i<=5; i++) {
			if (s[i] == null) {
				break;
			}
			if (s[i].getClass()==Carrot.class) {
				str += ("Carotte: ["+ s[i].getKg()+" kg" + " - " + s[i].getCm() + " cm]")+ "\n";
			}
			
			if (s[i].getClass()==Potatoe.class) {
				str += ("Patate: ["+ s[i].getKg()+" kg" + " - " + s[i].getYeux() + " Yeux]")+ "\n";
			}
			
		}
		return "Soupe\n------\n" + str; 
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

