package lee_problem1;

	import java.security.SecureRandom;
	import java.util.Scanner;
	public class CAI1 {
		Scanner resp = new Scanner(System.in);
		public static void main(String[] args) {
			CAI1 app = new CAI1();
	        app.quiz();
		}
		
		public void quiz(){
			//generate random numbers with a SecureRandom object
			SecureRandom rand = new SecureRandom();
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
			if(userin == x*y) {
				displayCorrectResponse();
				j = 1;
				return j;
			}
			else {
				displayInorrectResponse();
				return 0;
			}
			}
			
		public void displayCorrectResponse() {
			System.out.println("Very Good!");
		}
		public void displayInorrectResponse() {
			System.out.println("No, Plesae Try Again.");
		}
	}

