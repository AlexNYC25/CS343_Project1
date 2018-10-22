/**
	currently there is a problem where the test each integer has a bug
	that dosen't read the data from playGame correctly/.
**/

public class Assignment1{

	public static void main(String[] args){
		System.out.println("Program starting out.");
		new Assignment1().testEachInteger();

	}

	private String playGame(int chosenNumber){
		/**
			The chosen integer is passed and returns a string of ones and zeros
		**/

		String toBeReturned = "";
		if ( chosenNumber >= 0 && chosenNumber <= 0){
			int lower = 1, upper = 100, middle;
			for (int z = 0; z < 6; z++){
				middle = (lower + upper) / 2;
				if (chosenNumber > middle){
					toBeReturned += "1";
				}
				else{
					toBeReturned += "0";
				}
				upper = middle;
			}
		}
		return toBeReturned;
	}

	private void testEachInteger(){
		/**
			this will play the game for each integer from 1 to 100
			printing out the result of the game for each integer

			we need to use this method to print the output
			System.out.format("Chosen integer %3d: ", i);

			In addition print out each of the following on a seperat line
				The total number of chosen integer where only 6 questions
				is asked

				The total number of chosen integers where only 7 questions
				is asked

				The average number of questions asked on a seperate line,
				remember average is a weighted average

		**/

		System.out.println("rinning this now");

		int q6 = 0, q7 = 0;
		for (int x = 0; x <= 1; x++){
			int currentNumber = x;
			String currentResult = playGame(currentNumber);
			if (currentResult == "000000"){
				q7++;
			}
			else{
				q6++;
			}
		}

		int averageWeighted = ((q6 * 6) + (q7 * 7 )) / 1000;

		System.out.println("Total number of integers where 6 questions are asked is " + q6);
		System.out.println("Total number of integers where 7 questions are asked is " + q7);
		System.out.println("The wegihted average is " + averageWeighted);
	}


	private void playOneThousandGames(){
		/**
			This will play the game 1000 timesm for each game a randomly 
			chosen integer is chosen from 1 to 100

			Have this ialso print out the in addition conditions from 
			testEachInteger
		**/


	}




}