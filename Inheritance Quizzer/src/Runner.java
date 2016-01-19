
public class Runner
	{

		public static void main(String[] args)
			{
				Reptiles a = new Reptiles();
				Animal b = new Mammal();
				Animal ab = new Animal();
				Animal as = new Snake();
				Snake s = new Snake(5);
				
				System.out.println(s.getNum());
				System.out.println(a.myFlightBehavior.flies());
				System.out.println(a.getNum());
				System.out.println(a.makesNoise());
				System.out.println(b.makesNoise());
				System.out.println(ab.eats());
			}

	}
