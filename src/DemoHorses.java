
public class DemoHorses {

	public static void main(String[] args) {
		
		Horse horse1 = new Horse();
		RaceHorse horse2 = new RaceHorse();
		
		horse1.setname("Lavendar");
		horse1.setcolor("Painted");
		horse1.setbirthyear(2020);
		
		horse2.setname("Haze");
		horse2.setcolor("Pinto");
		horse2.setbirthyear(2021);
		horse2.setRaces(7);
		
		System.out.println(horse1.getname() + " is " + horse1.getcolor() + " and was born in " 
				+ horse1.getbirthyear() + "!");
		System.out.println("\n" + horse2.getname() + " is " + horse2.getcolor() + " and was born in "
				+ horse2.getbirthyear() + "! \nHe has raced in " + horse2.getraces() + " races! ");
		

	}

}
