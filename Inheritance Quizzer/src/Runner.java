
public class Runner
	{

		public static void main(String[] args)
			{
				Reptiles a = new Reptiles(2);
				Animal b = new Mammal();
				Animal ab = new Animal();
				System.out.println(a.getNum());
				System.out.println(a.makesNoise());
				System.out.println(b.makesNoise());
				
			}

	}
