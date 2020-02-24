package Lee_problem2;

//Class Saving Account 
public class SavingsAccount {
	// Declaring Instances
	static private double annualInterestRate;
	private double savingBalance;
	// Constructor 
	public SavingsAccount() 
	{
		this.savingBalance=0;
	}
	//Constructor
	public SavingsAccount(double savingBalance)
	{
		this.savingBalance = savingBalance;
	}
	//Get method for saving balance
	public double getSavingBalance() 
	{
		return this.savingBalance;
	}
	//Calculate the monthly balance
	 public double[] getMonthsSavingBalance(int total_months)
	 {
		double[] monthlyI_month=new double[total_months];
		double monthly;
		for(int i=0;i<total_months;i++)
		{
			monthly= (double)(this.savingBalance*annualInterestRate/12);
			this.savingBalance+=monthly;
			monthlyI_month[i]=this.savingBalance;
		}
		
    return monthlyI_month;
	  }
	 // Assign new Interest Rate
	  public static void modifyInterestRate(double newInterestRate)
	  {
		  annualInterestRate=newInterestRate;
	  }
	  // Calculate new monthly balance
	  public void calculateMonthlyInterest()
	  {
		  double monthlyI;
		  monthlyI= (double)(this.savingBalance*annualInterestRate/12);
		  this.savingBalance+=monthlyI;
	  }
	  
}