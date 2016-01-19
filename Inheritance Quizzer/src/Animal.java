
public class Animal
	{
		protected int num;
		protected FlightBehavior myFlightBehavior;
		public Animal()
		{
			num = 5;
		}
		public Animal(int i)
		{
		num = i*2;	
		}

		public String eats()
			{
				return "The animal eats";
			}
		public String makesNoise()
			{
				return "The animal makes a sound.";
			}
		public int getNum()
			{
				return num;
			}
		public void setNum(int num)
			{
				this.num = num;
			}
		
		
		
		
	}
