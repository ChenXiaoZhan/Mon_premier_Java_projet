package soup2; //Binôme Philippe ALLAIN et Zhan CHEN


public class Test {

	public static void main(String[] args) {
		
		//question 3 partie II
		Vegetable pdt = new Potatoe(0.3,10);
		Vegetable c = new Carrot(0.25,30);
		System.out.println(pdt);
		System.out.println(c);
		
		//question 4 partie II
		Soup s = new Soup();
		s.add(new Potatoe(0.3,10));
		s.add(new Carrot(0.25,30));
		System.out.println(s);
		s.add(new Potatoe(0.500));
		s.add(new Potatoe(0.150));
		s.add(new Carrot(0.20, 25));
		s.add(new Potatoe(0.450, 2));
		System.out.println(s);
		
		//question 5 partie II
		s.add(new Potatoe(0.3,10));
		s.add(new Carrot(0.25,30));
		System.out.println(s.getPeelingWeight());
		
		//question 6 partie II
		Vegetable.setPeelingWeight(0.05);
		System.out.println(s.getPeelingWeight()); // affiche: 0.1275
		

	}

}