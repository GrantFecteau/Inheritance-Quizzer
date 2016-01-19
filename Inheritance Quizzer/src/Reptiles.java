
public class Reptiles extends Animal
	{ 	
		
		public Reptiles()
			{
				num = 2;
				myFlightBehavior = (FlightBehavior) new CanFly();
			}
		public Reptiles(int i)
			{
				super(i);
				//num = i;
				myFlightBehavior = (FlightBehavior) new CannotFly();
			}
			
		public String makesNoise()
			{
				return super.makesNoise();
			}
		
		public String growTail()
		{
			return "The reptile regrows its tail.";
		}
		
		
	}
