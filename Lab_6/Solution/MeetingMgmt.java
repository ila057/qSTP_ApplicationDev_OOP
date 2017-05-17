
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MeetingMgmt extends JFrame implements ActionListener
{
	JFrame frame;
	JPanel mainPanel;
	JButton addsch;
	JButton remsch;
	JButton seesch;
	
	public MeetingMgmt()
	{
		frame = new JFrame("Manage my Schedule");
	   	frame.setSize(300, 200);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

	    mainPanel = new JPanel();
	    frame.setContentPane(mainPanel);
	    mainPanel.setLayout(new GridLayout(3, 1 ));	
	    
	    addsch = new JButton("Add a meeting...");
	    remsch = new JButton("Remove a meeting...");
	    seesch = new JButton("See the schedule...");
	    
	    addsch.setBackground(Color.BLACK);
	    addsch.setForeground(Color.ORANGE);
	    
	    remsch.setBackground(Color.BLACK);
	    remsch.setForeground(Color.GREEN);
	    
	    seesch.setBackground(Color.BLACK);
	    seesch.setForeground(Color.pink);

	    mainPanel.add(addsch);
	    mainPanel.add(remsch);
	    mainPanel.add(seesch);

	   	frame.setVisible(true);
	    
	   	addsch.addActionListener(this);
	    remsch.addActionListener(this);
	    seesch.addActionListener(this);	

	}

	public void actionPerformed(ActionEvent ev)
	{
		if (ev.getSource()==addsch)
			toScreen11();
		
		if (ev.getSource()==remsch)
			toScreen12();
		
		if (ev.getSource()==seesch)
			toScreen13();
	}
	
	public static void toScreen11()
	{
		AddMeet addmt = new AddMeet();
	}
	
	public static void toScreen12()
	{
		//HelpMenu hm = new HelpMenu();
	}
	
	public static void toScreen13()
	{
		ViewMeet vm = new ViewMeet();
	}

	

}
