
public class WorkerSal extends AllGrades
{
	double initial_total = 500;		
	private double wage_per_day = 25;
	private int days_worked;
	double final_total;
	

	//constructor	
	public WorkerSal(int sickd, int vacd, int days) 
	{
		// TODO Auto-generated constructor stub
		super(sickd, vacd);
		this.days_worked = days; //to add days in constructor
	}
	
	public WorkerSal(int sickd, int vacd) 
	{
		super(sickd, vacd);
		this.days_worked = 0; 
	}
	
	public WorkerSal() 
	{
		super(0,0);
		this.days_worked = 0; 
	}

	@Override
	public double calculateSalary() 
	{
		// TODO Auto-generated method stub
		final_total = initial_total - calculateDeduction() + wageAccToDays();
		return final_total;
		//System.out.println(""+final_total);
				
	}
	
	public double wageAccToDays()
	{
		return days_worked*wage_per_day;
	}

}
