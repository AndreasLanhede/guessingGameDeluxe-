import java.util.Scanner;

public class guessingGameDeluxe {

	public static void main(String[] args) {
		int randomNumber1 = (int) Math.floor(Math.random()*10);
		int randomNumber2 = (int) Math.floor(Math.random()*10);
		int randomNumber3 = (int) Math.floor(Math.random()*10);
		System.out.println(randomNumber1);
		System.out.println(randomNumber2);
		System.out.println(randomNumber3);
		
		boolean wrongAnswer = true;
		while(wrongAnswer) {
			
			
			Scanner guessNumber1 = new Scanner(System.in);
			System.out.println("Guess number1");
			int guess1 = guessNumber1.nextInt();
			
			Scanner guessNumber2 = new Scanner(System.in);
			System.out.println("Guess number2");
			int guess2 = guessNumber2.nextInt();
			
			Scanner guessNumber3 = new Scanner(System.in);
			System.out.println("Guess number3");
			int guess3 = guessNumber3.nextInt();
			
			if (randomNumber1 == guess1)
		    System.out.print("O");
			else if (randomNumber3 == guess1 || randomNumber2 == guess1)
			System.out.print("?");
			else 
			System.out.print("X");
			
			if (randomNumber2 == guess2)
			    System.out.print("O");
				else if (randomNumber3 == guess2 || randomNumber1 == guess2)
				System.out.print("?");
				else 
				System.out.print("X");
			
			if (randomNumber3 == guess3)
			    System.out.println("O");
				else if (randomNumber2 == guess3 || randomNumber1 == guess3)
				System.out.println("?");
				else 
				System.out.println("X");

	        if (randomNumber1 == guess1 && randomNumber2 == guess2 && randomNumber3 == guess3) {
	        System.out.println("You guessed the correct number");
	        wrongAnswer = false;
	        guessNumber1.close();
	        guessNumber2.close();
	        guessNumber3.close();
	        }
	        else
	        System.out.println("You guessed the wrong number try again");	
		}	

		}
	}
	
	
	

