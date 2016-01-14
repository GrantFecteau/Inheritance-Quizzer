import java.util.*;
public class Quizzer
	{
		String question = "";
		String answer1 = "";
		String answer2 = "";
		String answer3 = "";
		String answer4 = "";
		static ArrayList <Quizzer> quiz = new ArrayList <Quizzer>();
		
		public Quizzer (String q, String a1, String a2, String a3, String a4)
		{
			question = q;
			answer1 = a1;
			answer2 = a2;
			answer3 = a3;
			answer4 = a4;
		}

		public static void main(String[] args)
			{
				
				
				
				
				
			}
		
		public static void askQuestion()
		{
			
		}
		
		public static void addQuestion()
		{
			quiz.add(new Quizzer("If makesNoise() is called on Animal a = new Reptile();. What will be returned.","'The animal makes a sound.'","Error","'The reptile makes a sound.","5" ));
			quiz.add(new Quizzer("If Animal a = new Animal(); what will num equal?","5","3","20","10"));
			quiz.add(new Quizzer("If the num = i; in the Reptile class is no longer commented out and Animal a = new Reptile(4);, what will num equal.","4","6","8","2"));
			quiz.add(new Quizzer(""))
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
