# Lab 1

This is the first lab for the project. Its aim is to calculate the deduction from total salary (initial_total = Rs10000) depending on the sick leaves (sick_days) and the vacation leaves (vac_days) a person has taken. The amount to be deducted for sick leaves (deduction_on_sickl) is fixed to be Rs 50 per day. And the amount to be deducted for vacation leaves (deduction_on_vacl) is fixed at Rs 75 per day. You may take it to be of any amount of your choice.

 

Create a AllGrades class having

1.       Fields

initial_total  (double); initialize it to 10000

sick_days  (int)

vac_days  (int)

 

deduction_on_sickl  (double); initialize it to 50

deduction_on_vacl  (double) ; initialize it to 75

 

 

2.       Constructor

a.       Which takes int value for sick_days  and int value for vac_days  to initialize them

b.      Which does not take any parameters and initializes the value of sick_days and vac_days  to 0

 

 

3.       Methods

public void calculateSalary()

public double calculateDeduction()

 

You must think of the code to put in these two methods

For  public double calculateDeduction(), return a value

 deduction = (sick_days*deduction_on_sickl)+(vac_days*deduction_on_vacl)

 

For public void calculateSalary(), from the initial_total subtract the value returned by public double calculateDeduction(), and print the remaining amount

 

Since this a relatively easy lab( and you have already done similar type of code in Lab0 ), I will be uploading the solutions on Tuesday night. Please complete this lab by then so that you can check your code against the solutions. If you finish the code early, read on Inheritance and get your doubts clarified. The next lab will be on Inheritance and related concepts.
