//Keller Han
//Write a demo class that will create an object of VoteRecorder() and then
//run a mock election for the presidential and vice-presidential race. The user will 
//be asked how many voters there are, and the winner of the election will be displayed
//at the end

import java.util.Scanner;

public class VoteRecorderDemo {

	/*-------------------------------------------------------------
	|  Method: [main]
	|
	|  Purpose:  [To create a demo of VoteRecorder and run a mock election to determine which candidates will win
				the presidential and vice-presidential races]
	|
	|  Pre-condition:  [The VoteRecorder class must have all the necessary methods to run a mock election and 
					determine the winner]
	|
	|  Post-condition: [Program will display which candidates won each election]
	|
	|  Parameters: [N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		VoteRecorder.setCandidatesPresident("Annie", "Bob");
		VoteRecorder.setCandidatesVicePresident("John", "Susan");
		System.out.println("How many voters are there in this election?: ");
		Scanner voters = new Scanner(System.in);
		int voterCount = voters.nextInt();
		while (voterCount < 0)
		{
			System.out.println("Error. Please enter a positive number of voters: ");
			voterCount = voters.nextInt();
		}
		for (int i = 0; i < voterCount; i++)
		{
			VoteRecorder election = new VoteRecorder();
			election.getAndConfirmVotes();
			System.out.println("Thank you voter number: " + (i + 1) + "\n");
		}
		VoteRecorder.displayResults();
		voters.close();
	}

}
