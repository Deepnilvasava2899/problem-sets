//program for japplet with jbutton

/*
<html>
<body>
<applet code="myapplet_jbutton.class" width="300" height="300">
</applet>
</body>
</html>
*/

import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myapplet_jbutton extends Applet implements ActionListener
{
	JButton b_ref;
	JButton b_ref1;
	JButton b_ref2;
	int count=0;
	int count1=0;
	int count2=0;

	public void init()
	{
		b_ref=new JButton("Button 1");
		b_ref1=new JButton("Button 2");
		b_ref2=new JButton("Button 3");
		add(b_ref);
		add(b_ref1);
		add(b_ref2);
		b_ref.addActionListener(this);
		b_ref1.addActionListener(this);
		b_ref2.addActionListener(this);
	}
	public void start()
	{
	}
	public void stop()
	{
	}
	public void paint(Graphics g)
	{	
		super.paint(g);
		showStatus("Click the button");
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Button 1")
		{
			count=count+1;
			showStatus("Button 1  " + count);
		}
		if(ae.getActionCommand()=="Button 2")
		{
			count1=count1+1;
			showStatus("Button 2   " + count1);
		}
		if(ae.getActionCommand()=="Button 3")
		{
			count2=count2+1;
			showStatus("Button 3   " + count2);
		}
	}
}