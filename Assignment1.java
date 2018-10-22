

public Class Assignment1{
	String playGame(int chosenNumber){
		/**
			The chosen integer is passed and returns a string of ones and zeros
		**/

		String toBeReturned = "";
		if ( chosenNumber >= 0 && chosenNumber <= 0){
			int lower = 1, upper = 100, middle;
			for (int z = 0; z < 6; z++){
				middle = (lower + upper) / 2;
				if (chosenNumber > middle){
					toBeReturned += "1"
				}
				else{
					toBeReturned += "0"
				}
				upper = middle;
			}
		}
		return toBeReturned;
	}

	public void testEachInteger(){
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
	}


	public void playOneThousandGames(){
		/**
			This will play the game 1000 timesm for each game a randomly 
			chosen integer is chosen from 1 to 100

			Have this ialso print out the in addition conditions from 
			testEachInteger
		**/
	}
}