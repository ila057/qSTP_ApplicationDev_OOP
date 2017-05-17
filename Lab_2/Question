# Lab 2

**ExecutiveSal, SupervisorSal, WorkerSal** shall be the subclasses of the **AllGrades** class (i.e. they will inherit the **AllGrades** class)

For this, we will add a few extra features for each of the three grades, which are not implemented in the **AllGrades**. Since, the **initial_total** shall be different for each grade, remove it from **AllGrades** class, we shall initialize it separately in each of the subclasses.

Also change the public void calculateSalary() to public double calculateSalary(), and declare it as abstract method, correspondingly you have to declare the AllGrades class as abstract too. (Read a bit on abstract classes and methods). We declared the calculateSalary() as abstract since its implementation shall differ in each of the subclasses, but it is necessary to override it in each of the subclasses.

ExecutiveSal

1.       Fields

     initial_total  (double); initialize it to 100000

     bonus  (double); initialize it to 120

     final_total (double)

2.       Constructor

      Which takes int values of the sick days and vacation days and initializes the corresponding fields in the superclass.

3.       Method

       public double calculateSalary(), is overridden

       and returns the value final_total = initial_total – calculateDeduction() + bonus 

 

SupervisorSal

1.       Fields

initial_total  (double); initialize it to 2000

perc_incentive  (double); initialize it to 5

final_total (double)

2.       Constructor

Which takes int values of the sick days and vacation days and initializes the corresponding fields in the superclass.

3.       Method

public double calculateSalary(), is overridden

and returns the value final_total = initial_total – calculateDeduction() + calculateIncentive() 

 

public double calculateIncentive(),

which returns a double value incentive = (initial_total*pec_incentive)/100

 

 

WorkerSal

1.       Fields

initial_total  (double); initialize it to 500

wage_per_day  (double); initialize it to 25

days_worked  (int)

final_total (double)

2.       Constructor

Which takes int values of the sick days, vacation days and days worked; initializes the sick_days and vac_days fields in the superclass; initializes days_worked in this class.

Which takes int values of the sick days and vacation days and initializes the corresponding fields in the superclass, and also initializes the days_worked to 0

 

A default constructor which does not take any constructor and initializes the value of sick_days, vac_days and days_worked to 0.

 

3.       Method

public double calculateSalary(), is overridden

and returns the value final_total = initial_total – calculateDeduction() + wageAccToDays() 

 

public double wageAccToDays (),

which returns a double value days_worked*wage_per_day

 

Finally when you instantiate the object of class, call the calculateSalary() function via the object, and print the value of final salary.

This lab was on inheritance. The next lab will be on interfaces and abstract classes. Since those are short topics, you must also cover the topics of packages and exception handling, which are short topics too…
