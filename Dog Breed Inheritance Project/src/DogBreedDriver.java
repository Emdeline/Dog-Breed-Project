
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
					
				for(DogBreeds db : breed)
					{
						db.workingDogs();
						db.herdingDogs();
						db.sportingDogs();
						db.eat();
						db.makeSound();
						db.baby();
						
						System.out.println();
					}
					

			}

	}
