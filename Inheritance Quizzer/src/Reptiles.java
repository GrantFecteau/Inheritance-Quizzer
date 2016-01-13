
public class Reptiles extends Animal
	{ 	
		
		public Reptiles()
			{
				num = 2;
			}
		public Reptiles(int i)
			{
				
				super(i);
				/*num = i;*/
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
