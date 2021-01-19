//Create a stack of strings using util package. Provide suitable GUI. Buttons - push, pop, clear. TF - to read ip/to display popped string
//Date - 04/08/2020
//Program 1

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class gui extends JFrame implements ActionListener{
	Stack<String> stack = new Stack<String>();
	JPanel jp1, jp2;
	JButton b1, b2, b3, b4;
	JTextField tf;
	JLabel lb;
	
	String s="", s1="";
	gui(){
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		lb = new JLabel();
		b1 = new JButton("Push");
		b2 = new JButton("Pop");
		b3 = new JButton("Show Stack");
		b4 = new JButton("Clear");
		tf = new JTextField(20);		
		
		this.setLayout(new GridLayout(2,1));
		
		this.add(jp1);
		jp1.setLayout(new FlowLayout());
		jp1.add(tf);
		jp1.add(lb);
		
		this.add(jp2);
		jp2.setLayout(new FlowLayout());
		jp2.add(b1);
		jp2.add(b2);
		jp2.add(b3);
		jp2.add(b4);
		
		tf.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){	
		Object ref = ae.getSource();
		String str = new String();
		String s1 = new String();
		str = tf.getText();
		
		if(ref instanceof JTextField){
			repaint();
		}
		
		else{
			s = ae.getActionCommand();
			
			if(s.equals("Push")){
				stack.push(str);
				lb.setText("Pushed "+ str);
			}
							
			if(s.equals("Pop")){
				s1 = stack.pop();
				tf.setText(s1);
				lb.setText("Popped "+ s1);
			}
							
			if(s.equals("Show Stack")){
				lb.setText(String.valueOf(stack));
			}	
			
			if(s.equals("Clear"))
				tf.setText("");
			
			repaint();
		}
	}
}

class stack_using_gui_main{
	public static void main(String args[]){
		gui obj = new gui();
		obj.setVisible(true);
		obj.setSize(350, 500);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}