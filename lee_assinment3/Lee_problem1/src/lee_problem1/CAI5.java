package lee_problem1;
import java.security.SecureRandom;
import java.util.Scanner;
public class CAI5 {
				int correctans = 0;
				//generate random numbers with a SecureRandom object
				SecureRandom rand = new SecureRandom();
				Scanner resp = new Scanner(System.in);
				//main method that runs your program by calling the "quiz" method
				public static void main(String[] args) {
					CAI5 app = new CAI5();
			        app.quiz();
				}
				//method called "quiz" that contains the program logic
				public void quiz() {
					correctans = 0;
					int k = 0;
					int j = 0;
					int M = 0;
					j = readDifficulty();
					M = readProblemType();
					//ask the student to solve 10 different problems, as determined by the problem type
			        for(int i = 0; i < 10; i++ ) {
			        	//contain two numbers sampled from a uniform random distribution with bounds determined by the problem difficulty
			        	int x = rand.nextInt(j); 
				        int y = rand.nextInt(j);
				        int O = askquestion(j, M,x,y);
				        if(M == 4) {
				        	 float floatans = readdivision();
				        	k = divisionsol(floatans, x, y);
				        }
				        else {
			        int userin = readResponse();
			         k = isnanswercorrect(O , userin);
			         }
			         if(k == 1) {
			        	 correctans++;
			         }
			        }
			        int L = 0;
			         L = displayCompletionMessage(correctans);
			        if ( L == 1) {
			        	quiz();
			        }
			        else {
			        	return;
			        }
			        
				}
				//ask the student to enter a problem type of 1, 2, 3, 4, or 5 with an appropriate human-readable label
				//method called "askQuestion" that prints the problem to the screen
				public int askquestion(int J, int M, int X, int Y){
		//type of 5 shall result questions that are a randomly mixture of addition, multiplication, subtraction, and division problems
		if(M == 5) {
			M = 1 + rand.nextInt(4);
		}
				
					switch (M) {
					//type of 1 shall limit the program to generating only addition problems
		            case 1: System.out.println("Solve this addition problem:\n");
							System.out.println("How much is " + X + " plus " + Y + " equal");
							 M = X+Y;
		                     break;
		            // type 2 shall limit the program to generating only multiplication problems.
		            case 2:  System.out.println("Solve this multiplication problem:\n");
							System.out.println("How much is " + X + " times " + Y + " equal");
							M = X*Y;
		                     break;
		            //type of 3 shall limit the program to generating only subtraction problems
		            case 3:  System.out.println("Solve this subtraction problem:\n");
							System.out.println("How much is " + X + " minus " + Y + " equal");
							M = X-Y;
		                     break;
		            // type of 4 shall limit the program to generating only division problems
		            case 4:  System.out.println("Solve this division problem:\n");
							System.out.println("How much is " + X + " divided by  " + Y + " equal");
							M = 0;
		                     break;}
		         return M;
				}
				//method called "readResponse" that reads the answer from the student

				public int readResponse(){
					int ans1 = resp.nextInt();
					return ans1;
				}
				//method called "isAsnwerCorrect" that checks to see if the student's answer matches the correct answer to the problem
				public int isnanswercorrect(int M, int userin) {
					int j = 0;
					int random = rand.nextInt(4);
					if(userin == M) {
						//display a random positive message if the student provides a correct response
						displayCorrectResponse(random);
						j = 1;
						return j;
					}
					else {
						//display a random negative message if the student provides an incorrect response
						displayInorrectResponse(random);
						return 0;
					}
					}
				//method called "displayCorrectResponse" that prints out the response when a student enters a correct answer
				public void displayCorrectResponse(int x) {
					switch (x) {
		            case 1:  System.out.println("Very Good!");;
		                     break;
		            case 2:  System.out.println("Excellent!");;
		                     break;
		            case 3:  System.out.println("Nice Work!");;
		                     break;
		            case 0:  System.out.println("Keep up the good work!");
		                     break;
					
				}
				}
				//method called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
				public void displayInorrectResponse(int x) {
					switch (x) {
		            case 1:  System.out.println("No. Please try again.");;
		                     break;
		            case 2:  System.out.println("Wrong. Try once more.");;
		                     break;
		            case 3:  System.out.println("Don’t give up!");
		                     break;
		            case 0:  System.out.println("No. Keep trying.");
		                     break;
				}}
				//method called "displayCompletionMessage" that prints out the studen't score and appropriate score response
				public int displayCompletionMessage(int correctans) {
					correctans = ((correctans * 100) / 10);
					System.out.println("Your score is "+ correctans);
					//display the message "Congratulations, you are ready to go to the next level!" if the student's score is greater than or equal to 75%
					if(correctans >= 75) {
						System.out.println("Congratulations, you are ready to go to the next level!");
					}
					// display the message "Please ask your teacher for extra help." if the student's score is less than 75%
					else {
						System.out.println("Please ask your teacher for extra help.");
					}
					//restart when the student agrees to solve a new problem set
					// shall terminate when the student declines to solve another problem set
					System.out.println("Want to solve a new problem set? 1 for yes/ 0 for no");
					 int counter = resp.nextInt();
					 return counter;
					
			}	//ask the student to enter a difficulty level of 1, 2, 3, or 4
				//method called "readDifficulty" that reads the difficulty level from the student
				public int readDifficulty() {
					System.out.println("Choose difficulty level: \n 1 \n 2 \n 3 \n 4");
					int j= 0;
					j = resp.nextInt();
					switch (j) {
					//A difficulty level of 1 shall limit random numbers to the range of 0-9, inclusive
		            case 1:  j = 10; 
		                     break;
		            //A difficulty level of 2 shall limit random numbers to the range of 0-99, inclusive
		            case 2:  j = 100;
		                     break;
		            // A difficulty level of 3 shall limit random numbers to the range of 0-999, inclusive
		            case 3:  j = 1000;
		                     break;
		            //A difficulty level of 3 shall limit random numbers to the range of 0-999, inclusive
		            case 4:  j = 10000;
		                     break;}
		             return j;
					
					


		}
				//method called "readProblemType" that reads the difficulty level from the student
				public int readProblemType() {
					System.out.printf("What type of arithmetic problem do you want to study:\n 1:+ \n 2:* \n 3:- \n 4:/ \n 5:Random ");
					int j = 0;
					j = resp.nextInt();
					switch (j) {
		            case 1:  j = 1; 
		                     break;
		            case 2:  j = 2;
		                     break;
		            case 3:  j = 3;
		                     break;
		            case 4:  j = 4;
		                     break;
		            case 5: j= 5;
		            		break;}
		             return j;
					
	}
				public int divisionsol(float ans ,int x, int y) {
					int i = 0;
					int random = rand.nextInt(4);
					if ((x/y)- ans <.5 && ans - (x/y) < .5) {
						displayCorrectResponse(random);
						i++;
					}else {
						displayInorrectResponse(random);
						i = 0;
					}
					return i;
				}
				
				public float readdivision() {
					float ans = resp.nextFloat();
					return ans;
				}

}
