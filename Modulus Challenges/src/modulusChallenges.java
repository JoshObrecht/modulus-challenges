import java.util.Scanner;
public class modulusChallenges
	{
		static boolean playAgain=true;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput2= new Scanner(System.in);
		public static void main(String[] args)
			{
				do
				{
				System.out.println("Which challenge would you like to run?");
				System.out.println("");
				System.out.println("1) Leap Year");
				System.out.println("2) Fizz Buzz");
				System.out.println("");
				System.out.println("Type the number that corresponds with your choice.");
				
				int userChoice = userInput.nextInt();
				
			
				switch(userChoice)
				{
					case 1:
						runLeapYear();
						break;
					case 2:
						runFizzBuzz();
						break;
					default:
						System.out.println("User input not recognized, running Leap Year.");
						break;
				}
				runAgain();
			}
			while(playAgain==true);
			}
		
		public static void runLeapYear()
		{
		System.out.println("Give me a year and I will tell you whether or not it is a leap year.");
		int userYear= userInput.nextInt();
		if((userYear%4==0)&&!(userYear%100==0))
			{
				System.out.println("That is a leap year.");
			}
		else if((userYear%100==0)&&(userYear%400==0))
			{
				System.out.println("That is a leap year.");
			}
		else
			{
				System.out.println("That's not a leap year.");
			}
		}
		public static void runFizzBuzz()
		{
			for(int i=1; i<=100; i++)
				{
					if((i%3==0)&&(i%5==0))
						{
							System.out.println("FizzBuzz");
						}
					else if(i%3==0)
						{
							System.out.println("Fizz");
						}
					else if(i%5==0)
						{
							System.out.println("Buzz");		
						}
					
					else
						{
							System.out.println(i);
						}
				}
		}
		public static void runAgain()
			{
				System.out.println("");
				System.out.println("Would you like to run another challenge? (Type y/n for yes/no respectively)");
				String userChoice= userInput2.nextLine();
				if((userChoice.equals("N"))||(userChoice.equals("n")))
				{
				System.out.println("See you later!");
				playAgain=false;
				}
				
			}

	}
