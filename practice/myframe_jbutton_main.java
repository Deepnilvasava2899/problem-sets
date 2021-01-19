//program for frame

import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myframe_jbutton extends JFrame implements ActionListener
{
	JButton b_ref;
	JButton b_ref1;
	JButton b_ref2;
	String s="please press the button !";
	int count=0;
	int count1=0;
	int count2=0;

	myframe_jbutton(String title)
	{
		super(title);
		b_ref=new JButton("Button 1");
		b_ref1=new JButton("Button 2");
		b_ref2=new JButton("Button 3");
		setLayout(new FlowLayout());
		add(b_ref);
		add(b_ref1);
		add(b_ref2);
		b_ref.addActionListener(this);
		b_ref1.addActionListener(this);
		b_ref2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Button 1")
		{
			count=count+1;
			s="Button 1->" + count;
		}
		if(ae.getActionCommand()=="Button 2")
		{
			count1=count1+1;
			s="Button 2->" + count1;
		}
		if(ae.getActionCommand()=="Button 3")
		{
			count2=count2+1;
			s="Button 3->" + count2;
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString(s,120,120);
		System.out.println(s);
	}
}
class myframe_jbutton_main
{
	public static void main(String []s)
	{
		myframe_jbutton ref = new myframe_jbutton("Deepnil");
		ref.setSize(1000,1000);
		ref.setVisible(true);
		ref.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}