
public class Snake extends Reptiles
	{
		public Snake()
		{
			super(9);
			num = 10;
		}
		
		public Snake (int i)
		{
			super();
		}
		public String slither()
		{
			return "The snake slithers";
		}
		
		public String makesNoise()
			{
				return super.makesNoise();
			}

	}
