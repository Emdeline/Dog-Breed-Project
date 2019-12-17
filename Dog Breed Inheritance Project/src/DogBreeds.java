
public abstract class DogBreeds
	{
		protected String group;
		protected String breed;
		protected String name;
		
		
		public abstract void makeSound();
		public abstract void eat();
		public abstract void Dogs();
		
		
		public void baby()
			{
				System.out.println("AWWWW what adorable little " + breed + " puppies!! They are deffinetly "
						+ "going to make awesome " + group + "s. You did good " + name + ".");
			}
	}
