
public class DogBreedDriver
	{

		public static void main(String[] args)
			{
				DogBreeds [] breed = new DogBreeds[9];
					breed[0] = new LabradorRetriever();
					breed[1] = new GermanShorthairedPointer();
					breed[2] = new CockerSpaniel();
					breed[3] = new GreatDane();
					breed[4] = new SiberianHusky();
					breed[5] = new Newfoundland();
					breed[6] = new BorderCollie();
					breed[7] = new GermanShepherdDog();
					breed[8] = new IcelandicSheepdog();
					
	//Dog Names
		
			// Working Dog Group 
				GreatDane teddy = new GreatDane();
					teddy.makeSound();
					teddy.Dogs();		
					teddy.eat();
					teddy.baby();
				Newfoundland caspian = new Newfoundland();
					caspian.makeSound();
					caspian.Dogs();
					caspian.eat();
					caspian.baby();
				SiberianHusky nikki = new SiberianHusky();
					nikki.makeSound();
					nikki.Dogs();
					nikki.eat();
					nikki.baby();
					
			// Herding Dog Group
				BorderCollie chief = new BorderCollie(); 
					chief.makeSound();
					chief.Dogs();
					chief.eat();
					chief.baby();
				IcelandicSheepdog nordic = new IcelandicSheepdog();
					nordic.makeSound();
					nordic.Dogs();
					nordic.eat();
					nordic.baby();
				GermanShepherdDog george = new GermanShepherdDog();
					george.makeSound();
					george.Dogs();
					george.eat();
					george.baby();
					
			//Sporting Dog Group 
				LabradorRetriever hunter = new LabradorRetriever();
					hunter.makeSound();
					hunter.Dogs();
					hunter.eat();
					hunter.baby();
				GermanShorthairedPointer rose = new GermanShorthairedPointer();
					rose.makeSound();
					rose.Dogs();
					rose.eat();
					rose.baby();
				CockerSpaniel hazel = new CockerSpaniel();
					hazel.makeSound();
					hazel.Dogs();
					hazel.eat();
					hazel.baby();
					
			}

	}
