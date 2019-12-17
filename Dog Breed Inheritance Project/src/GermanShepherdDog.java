
public class GermanShepherdDog extends herdingGroup
	{

		@Override
		public void makeSound()
			{
				System.out.println( );
				
				System.out.println("Bark *growl*");
				System.out.println("This is " + name + ". He is a super intelligent and fierce German Shepherd!");

			}
		
		public GermanShepherdDog()
			{
				breed = "German Shepherd";
				group = "Herding Dog";
				name = "George";
			}

	}
