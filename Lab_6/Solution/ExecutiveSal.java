
public class ExecutiveSal extends AllGrades
{
	double initial_total=100000;		
	private double bonus=120;		
	double final_total;

	//constructor	
	public ExecutiveSal(int sickd, int vacd) 
	{  
		super(sickd, vacd);
	}

	// abstract method to be implemented here
	@Override
	public double calculateSalary() 
	{
		// TODO Auto-generated method stub
		final_total = initial_total - calculateDeduction() + bonus;
		return final_total;
		//System.out.println(""+final_total);
	}
	

/*
	public static void main(String arg[])
	{
		ExecutiveSal el = new ExecutiveSal(5,7);	//this can be called from action listener
		el.calculateSalary();
		
		SupervisorSal sll = new SupervisorSal(5,7);	//this can be called from action listener
		sll.calculateSalary();
		
		WorkerSal wl = new WorkerSal(3,2);			//this can be called from action listener
		wl.calculateSalary();
				
	}
*/
	
}
