
public abstract class AllGrades 
{
	
//fields	
	int sick_days;			
	int vac_days;
	
	double deduction_on_sickl=50;
	double deduction_on_vacl=75;

//constructors
	public AllGrades()
	{
		this.sick_days=0;
		this.vac_days=0;
		
	}
	
	public AllGrades(int sd, int vd)
	{
		this.sick_days=sd;
		this.vac_days=vd;
	}
	
//methods
	abstract public double calculateSalary(); 
	
	
	public double calculateDeduction()
	{
		double deduction = (sick_days*deduction_on_sickl)+(vac_days*deduction_on_vacl);	
		return deduction;
	}
	
	public static void main(String arg[])
	{
		// you may pass any value in the constructor to test your code
		ExecutiveSal es1 = new ExecutiveSal(7, 5);
		System.out.println(es1.calculateSalary());
		SupervisorSal ss1 = new SupervisorSal(3, 2);
		System.out.println(ss1.calculateSalary());
		WorkerSal ws1 = new WorkerSal(3, 4, 28);
		System.out.println(ws1.calculateSalary());
		WorkerSal ws2 = new WorkerSal(3, 4);
		System.out.println(ws2.calculateSalary());
		WorkerSal ws3 = new WorkerSal();
		System.out.println(ws3.calculateSalary());
		
	}

}
