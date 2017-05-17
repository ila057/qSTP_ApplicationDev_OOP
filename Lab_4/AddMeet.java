import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddMeet extends JFrame implements ActionListener
{
	JFrame frame;
	JPanel mainPanel;
	JButton submit;
	
	JLabel etopic;
	JLabel edate;
	JLabel etime;
	JLabel none;
	
	JTextField topic;
	JTextField date;
	JTextField time;
	
	
	public AddMeet()
	{
		frame = new JFrame("Add new Meeting");
	   	frame.setSize(300, 200);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

	    mainPanel = new JPanel();
	    frame.setContentPane(mainPanel);
	    mainPanel.setLayout(new GridLayout(4, 2 ));	
	    
	    etopic = new JLabel("Enter topic of Meeting:");
	    edate = new JLabel("Enter date of Meeting:");
	    etime = new JLabel("Enter time of Meeting:");
	    none = new JLabel("");
	    
	    topic = new JTextField("");
	    date = new JTextField("");
	    time = new JTextField("");
	    
	    submit = new JButton("SUBMIT");

	    mainPanel.add(etopic);
	    mainPanel.add(topic);
	    mainPanel.add(edate);
	    mainPanel.add(date);
	    mainPanel.add(etime);
	    mainPanel.add(time);
	    mainPanel.add(none);
	    mainPanel.add(submit);

	   	frame.setVisible(true);
	    
	   	submit.addActionListener(this);
	

	}
	

	public void actionPerformed(ActionEvent ev)
	{
		
	}
	
}