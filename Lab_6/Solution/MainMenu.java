
	import javax.swing.*;
	import javax.swing.event.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.imageio.ImageIO;

	public class MainMenu extends JFrame implements ActionListener
	{
		JFrame frame;
		JPanel mainPanel;
		JButton meetmgmt;
		JButton emprec;
		JButton salcal;
		
		private ImageIcon image;

		public MainMenu()
		{
			frame = new JFrame("Main MENU");
		   	frame.setSize(425, 300);

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		    mainPanel = new JPanel();
		    frame.setContentPane(mainPanel);
		    mainPanel.setLayout(new GridLayout(3, 1 ));	
		    
		    meetmgmt = new JButton("Manage my Schedule");
		    emprec = new JButton("See employee recruitment");
		    salcal = new JButton("Predict this month's salary");
	        
		    mainPanel.add(meetmgmt);
		    mainPanel.add(salcal);
		    mainPanel.add(emprec);
		    

		   	frame.setVisible(true);
		    
		    meetmgmt.addActionListener(this);
		    emprec.addActionListener(this);
		    salcal.addActionListener(this);	

		}

		public void actionPerformed(ActionEvent ev)
		{
			if (ev.getSource()==meetmgmt)
				toScreen1();
			if (ev.getSource()==emprec)
				toScreen2();
			if (ev.getSource()==salcal)
				toScreen3();
		}
		
		public static void toScreen1()
		{
			MeetingMgmt mmgmt = new MeetingMgmt();
		}
		
		public static void toScreen2()
		{
			//HelpMenu hm = new HelpMenu();
		}
		
		public static void toScreen3()
		{
			SalaryCalc sc = new SalaryCalc();
		}

	

	public static void main(String args[])
	{
		MainMenu mm = new MainMenu();
		
	
	}
	
	}
	
