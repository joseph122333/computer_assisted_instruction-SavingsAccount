package lee_problem1;

	import java.security.SecureRandom;
	import java.util.Scanner;
	public class CAI2 {
		SecureRandom rand = new SecureRandom();
		Scanner resp = new Scanner(System.in);
		public static void main(String[] args) {
			CAI2 app = new CAI2();
	        app.quiz();
		}
		
		public void quiz(){
			int x = rand.nextInt(10); 
	        int y = rand.nextInt(10);
	        askquestion(x,y);
	        int i = 0;
	        while( i != 1) {
	        int userin = readResponse();
	         i = isnanswercorrect(userin, x, y);
	         
	        	
	        }
	        
	        
		}
		public void askquestion(int X, int Y){
			System.out.println("Solve this multiplication problem:\n");
			System.out.println("How much is " + X + " times " + Y + " equal");
		}
		public int readResponse(){
			int ans1 = resp.nextInt();
			return ans1;
		}
		public int isnanswercorrect(int userin, int x, int y) {
			int j = 0;
			//generate random numbers with a SecureRandom object
			int random = rand.nextInt(4);
			if(userin == x*y) {
				displayCorrectResponse(random);
				j = 1;
				return j;
			}
			else {
				displayInorrectResponse(random);
				return 0;
			}
			}
			
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
	}

