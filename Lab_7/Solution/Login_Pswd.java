import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login_Pswd extends JApplet implements ActionListener
{
	
	JFrame frame;
	JPanel mainPanel;
	JLabel login;
	JTextField loginbox;
	JLabel pswd;
	JPasswordField pswdbox;
	JButton submit;
	JLabel wmsg= new JLabel();

	public void init()
	{
	    mainPanel = new JPanel();
	    Container cp=getContentPane();
	    mainPanel.setLayout(null);

	    
	    login = new JLabel("Enter your login ID number:");
	    mainPanel.add(login);
	    login.setSize(200, 40);
	    login.setLocation(100,30);
	    loginbox = new JTextField();
	    mainPanel.add(loginbox);
	    loginbox.setSize(200, 30);
	    loginbox.setLocation(100,60);
	    
	    pswd = new JLabel("Enter your pasword:");
	    mainPanel.add(pswd);
	    pswd.setSize(200, 40);
	    pswd.setLocation(100,100);
	    pswdbox = new JPasswordField();
	    mainPanel.add(pswdbox);
	    pswdbox.setSize(200, 30);
	    pswdbox.setLocation(100,130);
	    
	    JButton submit= new JButton("SUBMIT");
	    submit.setSize(100, 40);
	    submit.setLocation(150,200);
	    mainPanel.add(submit);
	    
	    mainPanel.add(wmsg);
	    wmsg.setSize(200, 40);
	    wmsg.setLocation(115,240);
	    
	    
	    submit.addActionListener(this);
	    
	    cp.add(mainPanel);
	    this.add(mainPanel);
	    this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		
		String mypswd="";
		
		String logtext= loginbox.getText();
		
		char[] pswdtext= pswdbox.getPassword();
		
	
		for (int i=0; i< pswdtext.length; i++)
		{
			mypswd+=pswdtext[i];
		}
		
		
		if ((logtext.equals("abc"))&& (mypswd.equals("123")) )
			toScreen2();
		
		else
			wmsg.setText("Incorrect Login-ID or Password ");
		
	}
	public static void toScreen2()
	{
		//MainMenu mm = new MainMenu();
	}

}



