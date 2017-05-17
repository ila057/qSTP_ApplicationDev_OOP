
public class AllGrades 
{
	
//fields
	double initial_total=100000;
	
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
	public void calculateSalary() 
	{
		double final_total;
		final_total = initial_total - calculateDeduction();
		System.out.println(""+final_total);
	}
	
	public double calculateDeduction()
	{
		double deduction = (sick_days*deduction_on_sickl)+(vac_days*deduction_on_vacl);	
		return deduction;
	}
	
	public static void main(String arg[])
	{
		AllGrades ag1 = new AllGrades(7, 5);
		ag1.calculateSalary();
		AllGrades ag2 = new AllGrades();
		ag2.calculateSalary();
		AllGrades ag3 = new AllGrades(3, 4);
		ag3.calculateSalary();
		
	}

}
