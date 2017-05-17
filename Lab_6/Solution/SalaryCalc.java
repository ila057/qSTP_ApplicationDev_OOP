import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class SalaryCalc extends JFrame implements ActionListener
{
	JFrame frame;
	JPanel mainPanel;
	JButton submit;

	JLabel cgrade;			//choose grade
	JLabel csickl;			//choose sick leave
	JLabel cvacl;			//choose vacation leave
	JLabel none;
	
	JComboBox grd;
	JTextField sickl;
	JTextField vacl;
	
	String[] grades = { "Executives", "Supervisors", "Workers"};
	
	
	public SalaryCalc()
	{
		frame = new JFrame("Predict Monthly Salary");
	   	frame.setSize(300, 200);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

	    mainPanel = new JPanel();
	    frame.setContentPane(mainPanel);
	    mainPanel.setLayout(new GridLayout(4, 2 ));	
	    
	    cgrade = new JLabel("Choose your Grade:");
	    csickl = new JLabel("No. of Sick leaves:");
	    cvacl = new JLabel("No. of Vacation leaves:");
	    none = new JLabel("");
	    
	    grd = new JComboBox(grades);
	    sickl = new JTextField("");
	    vacl = new JTextField("");
	    
	    submit = new JButton("SUBMIT");

	    mainPanel.add(cgrade);
	    mainPanel.add(grd);
	    mainPanel.add(csickl);
	    mainPanel.add(sickl);
	    mainPanel.add(cvacl);
	    mainPanel.add(vacl);
	    mainPanel.add(none);
	    mainPanel.add(submit);

	   	frame.setVisible(true);
	    
	   	submit.addActionListener(this);
	

	}

	public void actionPerformed(ActionEvent ev)
	{
		String chosen_grade = grd.getSelectedItem().toString(); //take from combobox
		
		double salary;
		
		int sick_leaves = Integer.parseInt(sickl.getText());
		int vacation_leaves = Integer.parseInt(vacl.getText());
		
		if (chosen_grade.equalsIgnoreCase("Executives"))
		{
			ExecutiveSal el = new ExecutiveSal(sick_leaves,vacation_leaves);	
			salary = el.calculateSalary();
		}
		else if (chosen_grade.equalsIgnoreCase("Supervisors"))
		{
			SupervisorSal sll = new SupervisorSal(sick_leaves,vacation_leaves);	
			salary = sll.calculateSalary();
		}
		else
		{
			WorkerSal wl = new WorkerSal(sick_leaves,vacation_leaves,25);				
			salary = wl.calculateSalary();
		}

		JOptionPane.showMessageDialog(null, "The Monthly Salary is Rs "+salary+" /-");

	}
}