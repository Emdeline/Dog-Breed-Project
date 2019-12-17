
public class GreatDane extends workingGroup
	{
		@Override
		public void makeSound()
			{
				System.out.println("WOOF BARK BARK!");
				System.out.println("This is " + name + ". He is a wonderful Great Dane!");
	
			}
		
		public GreatDane()
			{
				breed = "Great Dane";
				group = "Working Dog";
				name = "Teddy";
			}


	}
