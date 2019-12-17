
public class IcelandicSheepdog extends herdingGroup
	{

		@Override
		public void makeSound()
			{
				System.out.println( );
				
				System.out.println("WOOF BARK *NIP*");
				System.out.println("This is " + name + ". She is a super intelligent and sweet Icelandic Sheepdog!");
			}
		
		public IcelandicSheepdog()
			{
				breed = "Icelandic Sheepdog";
				group = "Herding Dog";
				name = "Nordic";
			}

	}
