import java.util.*;
public class Quizzer
	{
		String question ="";
		String answer1 ="";
		String answer2 ="";
		boolean value = false;
		
		public Quizzer (String q, boolean v)
		{
			question = q;
			value = v;
		}

		public static void main(String[] args)
			{
				ArrayList <Quizzer> quiz = new ArrayList <Quizzer>();
				
				quiz.add(new Quizzer("If makesNoise() is called on Animal a = new Reptile();. It will return The animal makes sound.", true));
				
				
			}
		
		public static void askQuestion()
		{
			
		}

		public String getQuestion()
			{
				return question;
			}

		public void setQuestion(String question)
			{
				this.question = question;
			}

		public String getAnswer1()
			{
				return answer1;
			}

		public void setAnswer1(String answer1)
			{
				this.answer1 = answer1;
			}

		public String getAnswer2()
			{
				return answer2;
			}

		public void setAnswer2(String answer2)
			{
				this.answer2 = answer2;
			}

		public boolean isValue()
			{
				return value;
			}

		public void setValue(boolean value)
			{
				this.value = value;
			}

		

	}
