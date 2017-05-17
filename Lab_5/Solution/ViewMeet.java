import javax.swing.*;


import java.io.BufferedReader;
import java.io.FileReader;

public class ViewMeet extends JFrame
{

	JTextArea view;
	BufferedReader br;
	
	JFrame frame;
	JPanel mainPanel;
	
	String everything = new String("") ;
	
	public ViewMeet()
	{		
		frame = new JFrame("My meetings");
	   	frame.setSize(250, 350);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

	    mainPanel = new JPanel();
	    frame.setContentPane(mainPanel);
		
	    mainPanel = new JPanel();
	    frame.setContentPane(mainPanel);
	    mainPanel.setLayout(null);	
	    			
	try 
	{
		br = new BufferedReader(new FileReader("meeting.txt"));
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();

	    while (line != null) 
	    {
	        sb.append(line+"\n");
	       line = br.readLine();
	    }

	    everything = sb.toString();
	    //System.out.println(everything);
	    br.close();
	} 
    
    catch(Exception e) 
     	{
         System.out.println("Exception");
     	}
    
    view = new JTextArea(everything);
    
    mainPanel.add(view);
    
    view.setSize(240, 340);
    view.setLocation(1,1);
    

    frame.setVisible(true);
	
	}
	
	 

}