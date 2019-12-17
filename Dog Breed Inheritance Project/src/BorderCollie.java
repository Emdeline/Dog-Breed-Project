
public class BorderCollie extends herdingGroup
	{

		@Override
		public void makeSound()
			{
				System.out.println( );
				
				System.out.println("BARK! *NIP without actually bitting* BARK! *RUN*");
				System.out.println("This is " + name + ". He is a super intelligent and handsome Border Collie!");
			}
		
		public BorderCollie()
			{
				breed = "Border Collie";
				group = "Herding Dog";
				name = "Chief";
			}


	}
