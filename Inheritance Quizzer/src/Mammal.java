
public class Mammal extends Animal implements FlightBehavior
	{
		public Mammal()
		{
			num = 10;
		}
		
		public String makesNoise()
			{
				return "The mammal makes a sound.";
			}
		
		public String careForYoung()
		{
			return "The mammal cares for its young.";
		}

		@Override
		public String flies() {
			// TODO Auto-generated method stub
			return null;
		}
	}
