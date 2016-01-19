import java.util.*;
public class Quizzer
	{
		String question = "";
		String answer1 = "";
		String answer2 = "";
		String answer3 = "";
		String answer4 = "";
		static ArrayList <Quizzer> quiz = new ArrayList <Quizzer>();
		static ArrayList <String> options = new ArrayList <String>();
		static int ans = 0;
		static int correct =0;
		static int wrong = 0;
		
		
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
				addQuestion();
				askQuestion();
				printFinal();
			}
		
		public static void askQuestion()
		{
			Scanner userInput = new Scanner(System.in);
			Collections.shuffle(quiz);
			String temp = "";
			for (int i = 0; i < quiz.size(); i++)
			{
				
				System.out.println(i+1 +". " + quiz.get(i).getQuestion());
				temp = quiz.get(i).getAnswer1();
				addOptions(i);
				printOpt();
				getAnswer();
				if (options.get(ans -1).equals(temp))
				{
					System.out.println("That's right! A point for you!");
					correct++;
				}
				else
				{
					System.out.println("Sorry, wrong answer.");
					wrong++;
				}
				options.clear();	
			}
			
			
			
			
		}
		
		public static void addQuestion()
		{
			quiz.add(new Quizzer("If makesNoise() is called on Animal a = new Reptile();. What will be returned.","'The animal makes a sound.'","Error","'The reptile makes a sound.'","5" ));
			quiz.add(new Quizzer("If Animal a = new Animal(); what will num equal?","5","3","20","10"));
			quiz.add(new Quizzer("If the num = i; in the Reptile class is no longer commented out and Animal a = new Reptile(4);, what will num equal.","4","6","8","2"));
			quiz.add(new Quizzer("What will happen if Reptiles r = new Animal();", "Error","A reptile object will be made with the Animal Constructor.","An Animal object will be made with the Reptiles Constructor.","Nothing"));
			quiz.add(new Quizzer("If Reptiles r = new Reptiles(3); is called, what will happen?","A Reptile obj will be made with the Animal constructor.","Error","A Reptiles obj will be made with the Reptiles constructor.","Nothing."));
			quiz.add(new Quizzer("What would happen if the method inside FlightBehavior was not Abstract?","It would work as normal.","Error","Nothing","CanFly and CannotFly would no longer funtion."));
			quiz.add(new Quizzer("If Animal a = new Reptiles is made, what methods will it have access to?","eats(), makesNoise(), getNum(), setNum","eats(), growTail(), makesNoise()","None","careForYoung()"));
			quiz.add(new Quizzer("If CannotFly and CanFly extended FlightBehavior and did not implement, what would happen?","Error","It would inherit its methods.","Nothing.","It would work as normal."));
			quiz.add(new Quizzer("If Animal a = new Mammal() was called, what would makesNoise() return?","The mammal makes a sound.","The animal makes a sound.","Error","Nothing"));
			quiz.add(new Quizzer("If Animal a = new Mammal(), what will num equal?","10","20","5","2"));
			quiz.add(new Quizzer("What would happen if Mammal m = new Mammal(12) is called?","Error","Death","Num will equal 10","Num will equal 24"));
			quiz.add(new Quizzer("What would num be if Animal a = new Animal()?","5","2","10","15"));
			quiz.add(new Quizzer("What would be return if the flies() method was called Reptiles r = new Reptiles(2)","'Hey, I can't fly.'","'Hey, I can fly!'","Error","Nothing"));
			quiz.add(new Quizzer("What would happen if the flies() method was called on Mammal m = new Mammal(3)","Error","'Hey look, I can fly!'","'Hey I can't fly!'","'Nothing'"));
			quiz.add(new Quizzer("What would happen if Animal a = new Snake() is called?","An Animal object will be made with the Snake constructor.","Error","A Reptiles obj will be made with the Snake constructor.","Nothing"));
			quiz.add(new Quizzer("What will num be if Snake s = new Snake(5) is called?","2","10","5","0"));
			quiz.add(new Quizzer("What will num be if Snake s = new Snake() is called?","10","12","18","5"));
			quiz.add(new Quizzer("What will be returned if eats() is called on Animal a = new Animal()?","'The animal eats.'","'The mammal eats nothing.","Error","Nothing"));
			quiz.add(new Quizzer("","","","",""));
			quiz.add(new Quizzer("","","","",""));
			quiz.add(new Quizzer("","","","",""));
			quiz.add(new Quizzer("","","","",""));
			quiz.add(new Quizzer("","","","",""));
			quiz.add(new Quizzer("","","","",""));
			
			
			
			
			
		}
		
		public static void addOptions(int g)
		{
			options.add(quiz.get(g).getAnswer1());
			options.add(quiz.get(g).getAnswer2());
			options.add(quiz.get(g).getAnswer3());
			options.add(quiz.get(g).getAnswer4());
			
			Collections.shuffle(options);
		}
		public static void printOpt()
		{
			for (int o = 0; o < options.size(); o++)
			{
				System.out.println((o+1)+ ") : " + options.get(o));
			}
		}
		
		public static void getAnswer()
		{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Input the number of the correct answer.");
			ans = userInput.nextInt();
		}
		
		public static void printFinal()
		{
			System.out.println("You got "+correct+" right, and " + wrong +" wrong!");
		}


		public String getAnswer3() {
			return answer3;
		}

		public void setAnswer3(String answer3) {
			this.answer3 = answer3;
		}

		public String getAnswer4() {
			return answer4;
		}

		public void setAnswer4(String answer4) {
			this.answer4 = answer4;
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

		

		

	}
