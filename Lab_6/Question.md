# Lab 6 : Linking Up

1.       Create a GUI having 3 buttons in a grid layout in class MainMenu; for meeting management, predicting monthly salary and seeing employee recruitment

Button 1 : meetmgmt should have the text “Manage my Schedule ”

Button 2 : salcal should have the text “Predict this month’s salary”

Button 3 : emprec should have the text “See employee recruitment”

 

On clicking the addsch button, the frame in MeetingMgmt class should open. (You have already created this class, just remove the main from this class. Instead, we will put the main in this MainMenu class)

 

2.       On clicking the salcal button, the frame in SalaryCalc class should open. It will have 3 Labels, 1 ComboBox, 2 TextFields.

 

Label 1 : cgrade should have the text “Choose your grade:”

ComboBox  : grd

Label 2 : csickl should have the text “No. of sick leaves:”

TextField 1 : sickl

Label 3 : cvacl should have the text “No. of vacation leaves:”

TextField 2 : vacl

 

Take the values from ComboBox and TextField and store them in strings, which would be further passed on to the constructors – ExecutiveSal, SupervisorSal, WorkerSal (that you had already created earlier). You will need to remove the main method from AllGrades class, since we are initializing through constructors, and the constructor is being called here (in SalaryCalc class) itself.

 

I’ll be uploading the code till now in a day. Please make sure that the code up till here is correct and running. 
