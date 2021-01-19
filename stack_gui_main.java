/* Lab 14_A : stack with gui */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class stack_gui extends JFrame implements ActionListener
{
	Stack<String> s_ref=new Stack<String>();
	
	JLabel l_box;
	JTextField box;
	
	JButton b_push;
	JButton b_pop;
	JButton b_clear;

	String ap="";
	
	stack_gui()
	{
		setLayout(new FlowLayout());
		
		l_box=new JLabel("TEXT_BOX");
		box=new JTextField(20);
		
		add(l_box);
		add(box);
		
		b_push=new JButton("PUSH");
		b_pop=new JButton("POP");
		b_clear=new JButton("CLEAR");

		add(b_push);
		b_push.addActionListener(this);
		
		add(b_pop);
		b_pop.addActionListener(this);
		
		add(b_clear);
		b_clear.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ref=ae.getSource();
		if(ref instanceof JButton)
		{
			String gac=ae.getActionCommand();
			if(gac.equals("PUSH"))
			{
				String box_text=box.getText();
				s_ref.push(box_text);
				ap="-> "+box_text+" <- Pushed on the stack";
			}
			else if(gac.equals("POP"))
			{
				String box_text=box.getText();
				try
				{
					String pt=s_ref.pop();
					ap="-> "+pt+" <- Poped from the stack";
				}
				catch(EmptyStackException ese)
				{
					ap="!!! ERROR : Stack is empty !!!";
				}
			}
			else
			{
				box.setText("");
			}
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString(ap,100,150);
	}
}
class stack_gui_main
{
	public static void main(String []args)
	{
		stack_gui s_ref=new stack_gui();
		s_ref.setSize(400,400);
		s_ref.setVisible(true);
		
		s_ref.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}