
public class Mammal extends Animal implements FlightBehavior
	{
		public Mammal()
		{
			num = 10;
			myFlightBehavior = (FlightBehavior) new CannotFly();
		}
		
		public String makesNoise()
			{
				return "The mammal makes a sound.";
			}
		
		public String careForYoung()
		{
			return "The mammal cares for its young.";
		}
		
		public String eats()
		{
			return "The mammal eats nothing.";
		}

		@Override
		public String flies() {
			// TODO Auto-generated method stub
			return null;
		}
	}
