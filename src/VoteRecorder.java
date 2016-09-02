//Keller Han
//VoteRecorder class contains all the methods necessary to run a
//mock election. There will be a Presidential and Vice-presidential race,
//with 2 candidates running in each race. The User will input 0, 1, or 2 to 
//correspond to their candidate and the program will tally all the votes to 
//determine the winner of each election


import java.util.Scanner;

public class VoteRecorder {

	// Initialize variables
	static String nameCandidatePresident1;
	static String nameCandidatePresident2;
	static String nameCandidateVicePresident1;
	static String nameCandidateVicePresident2;
	static int votesCandidatePresident1;
	static int votesCandidatePresident2;
	static int votesCandidateVicePresident1;
	static int votesCandidateVicePresident2;
	private int myVoteForPresident;
	private int myVoteForVicePresident;
	private boolean inputYes = true;

	//Constructor with votes already in
	public VoteRecorder(int myVoteForPresident, int myVoteForVicePresident) {
		this.myVoteForPresident = myVoteForPresident;
		this.myVoteForVicePresident = myVoteForVicePresident;
		if (myVoteForPresident == 1) 
		{
			votesCandidatePresident1++;
		}
		else if (myVoteForPresident == 2) 
		{
			votesCandidatePresident2++;
		}
		if (myVoteForVicePresident == 1) 
		{
			votesCandidateVicePresident1++;
		}
		else if (myVoteForPresident == 2) 
		{
			votesCandidateVicePresident2++;
		}
	}
	
	// Default constructor 
	public VoteRecorder()
	{
		
	}
	
	/*-------------------------------------------------------------
	|  Method: [setCandidatesPresident(String name1, String name2)]
	|
	|  Purpose:  [This method sets the names of the candidates for presidential race]
	|
	|  Pre-condition:  [Takes in argument String name1, name2.]
	|
	|  Post-condition: [The names of the presidential candidates will be set.]
	|
	|  Parameters:
	|      nameCandidatePresident1 - first candidate's name
		   nameCandidatePresident2 - second candidate's name
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public static void setCandidatesPresident(String name1, String name2)
	{
		nameCandidatePresident1 = name1;
		nameCandidatePresident2 = name2;
	}
	
	/*-------------------------------------------------------------
	|  Method: [setCandidatesVicePresident(String name1, String name2)]
	|
	|  Purpose:  [This method sets the names of the candidates for vice-presidential race]
	|
	|  Pre-condition:  [Takes in argument String name1, name2.]
	|
	|  Post-condition: [The names of the vice-presidential candidates will be set.]
	|
	|  Parameters:
	|      nameCandidateVicePresident1 - first candidate's name
		   nameCandidateVicePresident2 - second candidate's name
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public static void setCandidatesVicePresident(String name1, String name2)
	{
		nameCandidateVicePresident1 = name1;
		nameCandidateVicePresident2 = name2;
	}
	
	/*-------------------------------------------------------------
	|  Method: [resetVotes()]
	|
	|  Purpose:  [To reset the vote count of the two races back to 0]
	|
	|  Pre-condition:  [Have parameters defined]
	|
	|  Post-condition: [The votes for every candidate will be 0]
	|
	|  Parameters:
	|      votesCandidatePresident1 - first candidate's votes
		   votesCandidatePresident2 - second candidate's votes
		   votesCandidateVicePresident1 - first vp candidate's votes
		   votesCandidateVicePresident2 - second vp candidate's votes
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public static void resetVotes()
	{
		votesCandidatePresident1 = 0;
		votesCandidatePresident2 = 0;
		votesCandidateVicePresident1 = 0;
		votesCandidateVicePresident2 = 0;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getCurrentVotePresident()]
	|
	|  Purpose:  [This method gets the number of votes for the presidential race]
	|
	|  Pre-condition:  [Have parameters defined]
	|
	|  Post-condition: [returns the vote for each presidential candidate]
	|
	|  Parameters:
	|      nameCandidatePresident1 - first candidate's name
		   nameCandidatePresident2 - second candidate's name
		   votesCandidatePresident1 - first candidate's votes
		   votesCandidatePresident2 - second candidate's votes
	|
	|  Returns:  [returns the vote for each presidential candidate]
	*------------------------------------------------------------------*/
	
	public static String getCurrentVotePresident()
	{
		return "The first presidential candidate" + nameCandidatePresident1 + "has" + votesCandidatePresident1 + "votes and the second presidential canddiate" + nameCandidatePresident2 + "has" + votesCandidatePresident2 + "votes";
	}
	
	/*-------------------------------------------------------------
	|  Method: [getCurrentVoteVicePresident()]
	|
	|  Purpose:  [This method gets the number of votes for the vice-presidential race]
	|
	|  Pre-condition:  [Have parameters defined]
	|
	|  Post-condition: [returns the vote for each vice-presidential candidate]
	|
	|  Parameters:
	|      nameCandidateVicePresident1 - first vp candidate's name
		   nameCandidateVicePresident2 - second vp candidate's name
		   votesCandidateVicePresident1 - first vp candidate's votes
		   votesCandidateVicePresident2 - second vp candidate's votes
	|
	|  Returns:  [returns the vote for each vice-presidential candidate]
	*------------------------------------------------------------------*/
	
	public static String getCurrentVoteVicePresident()
	{
		return "The first vice-presidential candidate" + nameCandidatePresident1 + "has" + votesCandidateVicePresident1 + "votes and the second vice-presidential candiate" + nameCandidateVicePresident2 + "has" + votesCandidateVicePresident2 + "votes";
	}
		
	/*-------------------------------------------------------------
	|  Method: [getAVote(String name1, name2)]
	|
	|  Purpose:  [This method gets a single user's vote for presidential election]
	|
	|  Pre-condition:  [Have parameters defined]
	|
	|  Post-condition: [returns the vote for each vice-presidential candidate]
	|
	|  Parameters:
	|      nameCandidateVicePresident1 - first vp candidate's name
		   nameCandidateVicePresident2 - second vp candidate's name
		   myVoteForPresident - who user voted for
	|
	|  Returns:  [returns who the user voted for]
	*------------------------------------------------------------------*/
	
	@SuppressWarnings("resource")
	private String getAVote(String name1, String name2)
	{
		nameCandidatePresident1 = name1;
		nameCandidatePresident2 = name2;
		System.out.println("To vote for " + nameCandidatePresident1 + " for President please enter 1: ");
		System.out.println("To vote for " + nameCandidatePresident2 + " for President please enter 2: ");
		System.out.println("To vote for neither candidate, enter 0: ");
		Scanner singlePresidentVote = new Scanner(System.in);
		myVoteForPresident = singlePresidentVote.nextInt();
		return "You're vote for the presidential race is in. You voted for: " + myVoteForPresident;
	}
	
	/*-------------------------------------------------------------
	|  Method: [getVotes()]
	|
	|  Purpose:  [This method returns a vote choice for president and vp from an individual]
	|
	|  Pre-condition:  [Have parameters defined]
	|
	|  Post-condition: [returns the vote of user for each race]
	|
	|  Parameters:
		   nameCandidatePresident1 - candidate's name
		   nameCandidatePresident2 - second candidate's name
	|      nameCandidateVicePresident1 - first vp candidate's name
		   nameCandidateVicePresident2 - second vp candidate's name
		   myVoteForPresident - who user voted for president
		   myVoteForVicePresident - who user voted for vice-president
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	@SuppressWarnings("resource")
	private void getVotes()
	{
		System.out.println("To vote for " + nameCandidatePresident1 + " for President please enter 1: ");
		System.out.println("To vote for " + nameCandidatePresident2 + " for President please enter 2: ");
		System.out.println("To vote for neither candidate, enter 0: ");
		Scanner presidentVote = new Scanner(System.in);
		myVoteForPresident = presidentVote.nextInt();
		while (myVoteForPresident < 0 || myVoteForPresident > 2)
		{
			System.out.println("Error. That is not a valid candidate. Please enter a valid number 0-2: ");
			myVoteForPresident = presidentVote.nextInt();
		}
		System.out.println("To vote for " + nameCandidateVicePresident1 + " for Vice-President please enter 1: ");
		System.out.println("To vote for " + nameCandidateVicePresident2 + " for Vice-President please enter 2: ");
		System.out.println("To vote for neither candidate, enter 0: ");
		Scanner vicePresidentVote = new Scanner(System.in);
		myVoteForVicePresident = vicePresidentVote.nextInt();
		while (myVoteForVicePresident < 0 || myVoteForVicePresident > 2)
		{
			System.out.println("Error. That is not a valid candidate. Please enter a valid number 0-2: ");
			myVoteForVicePresident = vicePresidentVote.nextInt();
		}
	}
	
	/*-------------------------------------------------------------
	|  Method: [getAndConfirmVotes()]
	|
	|  Purpose:  [gets an individuals votes, confirms them, then records them]
	|
	|  Pre-condition:  [Have methods getVotes(), confirmVotes(), recordVotes(inputYes) defined]
	|
	|  Post-condition: [will process a user's vote for each race and confirm it, then record it]
	|
	|  Parameters:
	|      boolean inputYes - argument for recordVotes() method
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void getAndConfirmVotes()
	{
		
		getVotes();
		confirmVotes();
		recordVotes(inputYes);
	}
	
	/*-------------------------------------------------------------
	|  Method: [confirmVotes()]
	|
	|  Purpose:  [To confirm if the user wants to submit his final votes for each candidate by
				typing in "yes" or "no"]
	|
	|  Pre-condition:  [User must have already input who he wants to vote for]
	|
	|  Post-condition: [Program will confirm user's votes and record it]
	|
	|  Parameters:
	|      boolean inputYes - argument for recordVotes() method
		   myVoteForPresident - who the user voted for president
		   myVoteForVicePresident - who the user voted for vice-president
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	@SuppressWarnings("resource")
	private void confirmVotes()
	{
		System.out.println("Your vote for president is: " + myVoteForPresident);
		System.out.println("Your vote for vice-president is: " + myVoteForVicePresident);
		System.out.println("Are you happy with these choices? Type yes or no: ");
		Scanner input = new Scanner(System.in);
		String next = input.next();
		if (next.equalsIgnoreCase("yes"))
		{
			inputYes = true;
		}
		else 
		{
			inputYes = false;
		}
	}
	
	/*-------------------------------------------------------------
	|  Method: [recordVotes(boolean inputYes)]
	|
	|  Purpose:  [If the user confirmed his votes by typing "yes", then this method will record
				the user's votes based on who he voted for by entering 0, 1, or 2.]
	|
	|  Pre-condition:  [User must have already voted and confirmed his selection by typing "yes"]
	|
	|  Post-condition: [Program will record user's votes or say his/her votes were discarded if they did not type "yes"]
	|
	|  Parameters:
	|      boolean inputYes - argument for recordVotes() method
		   myVoteForPresident - who the user voted for president
		   myVoteForVicePresident - who the user voted for vice-president
		   votesCandidatePresident1 - first candidate's votes
		   votesCandidatePresident2 - second candidate's votes
		   votesCandidateVicePresident1 - first vp candidate's votes
		   votesCandidateVicePresident2 - second vp candidate's votes
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	private void recordVotes(boolean inputYes)
	{
		int votePresident = myVoteForPresident;
		int voteVicePresident = myVoteForVicePresident;
		if (inputYes)
		{
			if (votePresident == 0)
			{
				votesCandidatePresident1 += 0;
				votesCandidatePresident2 += 0;
			}
			if (votePresident == 1)
			{
				votesCandidatePresident1 += 1;
				votesCandidatePresident2 += 0;
			}
			if (votePresident == 2)
			{
				votesCandidatePresident1 += 0;
				votesCandidatePresident2 += 1;
			}
			
			if (voteVicePresident == 0)
			{
				votesCandidateVicePresident1 += 0;
				votesCandidateVicePresident2 += 0;
			}
			if (voteVicePresident == 1)
			{
				votesCandidateVicePresident1 += 1;
				votesCandidateVicePresident2 += 0;
			}
			if (voteVicePresident == 2)
			{
				votesCandidateVicePresident1 += 0;
				votesCandidateVicePresident2 += 1;
			}
		}
		else
		{
			System.out.println("The votes were not counted. Please enter your votes again. \n");
			getAndConfirmVotes();
		}
		
	}
	
	/*-------------------------------------------------------------
	|  Method: [displayResults()]
	|
	|  Purpose:  [This will display a message of who won each election based on
				which candidates had the more votes]
	|
	|  Pre-condition:  [User must have voted, confirmed, and have his vote recorded.]
	|
	|  Post-condition: [Program will display the winners of each race]
	|
	|  Parameters:
		   votesCandidatePresident1 - first candidate's votes
		   votesCandidatePresident2 - second candidate's votes
		   votesCandidateVicePresident1 - first vp candidate's votes
		   votesCandidateVicePresident2 - second vp candidate's votes
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public static void displayResults()
	{
	
		if (VoteRecorder.votesCandidatePresident1 > VoteRecorder.votesCandidatePresident2)
		{
			System.out.println(VoteRecorder.nameCandidatePresident1 + " has won the Presidential election!");
		}
		if (VoteRecorder.votesCandidatePresident2 > VoteRecorder.votesCandidatePresident1)
		{
			System.out.println(VoteRecorder.nameCandidatePresident2 + " has won the Presidential election!");
		}
		if (VoteRecorder.votesCandidatePresident1 == VoteRecorder.votesCandidatePresident2)
		{
			System.out.println("The presidential race has resulted in a tie!");
		}
		if (VoteRecorder.votesCandidateVicePresident1 > VoteRecorder.votesCandidateVicePresident2)
		{
			System.out.println(VoteRecorder.nameCandidateVicePresident1 + " has won the Vice-Presidential election!");
		}
		if (VoteRecorder.votesCandidateVicePresident2 > VoteRecorder.votesCandidateVicePresident1)
		{
			System.out.println(VoteRecorder.nameCandidateVicePresident2 + " has won the Vice-Presidential election!");
		}
		if (VoteRecorder.votesCandidateVicePresident1 == VoteRecorder.votesCandidateVicePresident2)
		{
			System.out.println("The Vice-Presidential race has resulted in a tie!");
		}
	}
	
	
	
}
