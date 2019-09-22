package diecidue_p3;
import java.util.Scanner;

public class SimpleSurvey {

	public static void main(String[] args) {
		// constants
		final int TOPICSAMT = 5;
		final int RATINGS = 10;
		
		Scanner scnr = new Scanner(System.in);
		
		//variables
		String [] topics = new String [TOPICSAMT];
		topics[0] = "Mental Health Awareness";
		topics[1] = "LGBT+ Rights";
		topics[2] = "Gamedev Crunch Crisis";
		topics[3] = "Academics as a Business";
		topics[4] = "Haunted Furbies";
		int [][] responses = new int [TOPICSAMT][RATINGS]; //note to self the ratings are tallied and averaged
		int userContinue;
		int i;
		int j;
		int userRating;
		int topicTotal = 0;
		int totalTopicResponses = 0;
		double topicAvg;
		boolean continueUserInput = true;
		int biggestIssue;
		int lowestIssue;
		
		//initialize entire array with 0
		for (i = 0; i< TOPICSAMT; i++) {
			for (j = 0; j < RATINGS; j++) {
				responses[i][j] = 0;
			}
		}
		
		//user input in loop
		//prompt user to rate each topic
		while (continueUserInput) {
			System.out.println("On a scale of 1 to 10, 1 being least important and 10 being most, how important are the following topics to you?");
			//for loop of topics
			for (i = 0; i < TOPICSAMT; i++) {
				System.out.println(topics[i] + "?");
				userRating = scnr.nextInt();
				responses[i][userRating-1]++;
			}
			
			//next user?
			System.out.println("Will another user answer the survey? (-1 for no)");
			userContinue = scnr.nextInt();
			if (userContinue < 0) {
				continueUserInput = false;
			}
		}
		
		//output table
		//top row
		System.out.print("                              "); //30 spaces
		for (i = 0; i < RATINGS; i ++) {
			System.out.printf("%5d", i + 1);
		}
		System.out.print("\n");
		
		for (i = 0; i < TOPICSAMT; i++) {
			//that's each row
			System.out.printf("%30s", topics[i]);
			for (j = 0; j < RATINGS; j++) {
				//each column
				System.out.printf("%5d", responses[i][j]);
				if (responses[i][j] > 0) {
					topicTotal = topicTotal + j + 1;
					totalTopicResponses++;
				}
			}
			topicAvg = topicTotal / (double)totalTopicResponses;
			System.out.printf("\t%.2f\n", topicAvg);
			
			//reset variables
			topicTotal = 0;
			totalTopicResponses = 0;
		}
		System.out.print("\n");
		
		//calc biggest issue
		
		//calc lowest issue
		
		//display biggest issue and lowest issue
		System.out.println("Biggest issue: ");
		System.out.println("Issue of least concern: ");
		
		//
		scnr.close();
	}

}
