
public abstract class AllGrades implements LeaveRules
{
	int sick_days;			
	int vac_days;

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

//abstract method,it makes the class abstract
	public abstract double calculateSalary();

 //the method of interface is implemented here
	public double calculateDeduction()
	{
		double deduction = (sick_days*deduction_on_sickl)+(vac_days*deduction_on_vacl);	
		return deduction;
	}
	
}
