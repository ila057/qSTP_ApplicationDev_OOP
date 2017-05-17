
public class SupervisorSal extends AllGrades
{
	double initial_total = 2000;		
	private double perc_incentive = 5;		
	double final_total;
	
	//constructor	
	public SupervisorSal(int sickd, int vacd) 
	{
		// TODO Auto-generated constructor stub
		super(sickd, vacd);
	}
	
	// abstract method to be implemented here
	@Override
	public double calculateSalary() 
	{
		// TODO Auto-generated method stub
		
		final_total = initial_total - calculateDeduction() + calculateIncentive();
		return final_total;
		//System.out.println(""+final_total);		
	}
	
	//method defined in this class itself
	public double calculateIncentive()
	{
		double incentive = 0;
		incentive = (initial_total*perc_incentive)/100;
		return incentive;
	}
	


}
