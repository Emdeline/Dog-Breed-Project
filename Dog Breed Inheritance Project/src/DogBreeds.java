
public abstract class DogBreeds
	{
		protected String group;
		protected String breed;
		
		
		public abstract void makeSound();
		public abstract void eat();
		public abstract void sportingDogs();
		public abstract void herdingDogs();
		public abstract void workingDogs();


		
		public void baby()
			{
				System.out.println("AWWWW what adorable little " + breed + " puppies!! They are deffinetly "
						+ "going to make awesome " + group + "." );
			}
	}
