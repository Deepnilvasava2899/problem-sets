// WAP to make a simple calc
// LAB Program 2
// Date - 28/10/2020

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class simple_calc_using_jframe extends JFrame implements ActionListener{
	
	JLabel lb;
	JPanel jp1, jp2;
	JButton []b;
	JTextField tf;
	String s, current_text, first_num, operator, second_num;
	double n1, n2, ans;
	
	simple_calc_using_jframe(String title){
		super(title);
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		b = new JButton[16];
		tf	= new JTextField(20);
		lb = new JLabel("");
		
		for(int i=0; i<10; i++){
			b[i] = new JButton(String.valueOf(i));
		}
		
		b[10] = new JButton("+");		
		b[11] = new JButton("-");		
		b[12] = new JButton("*");		
		b[13] = new JButton("/");		
		b[14] = new JButton("=");		
		b[15] = new JButton("Clear");		
		
		this.setLayout(new GridLayout(2,1));
		this.add(jp1);
		
		jp1.setLayout(new FlowLayout());
		
		jp1.add(tf);
		jp1.add(lb);
				
		this.add(jp2);
		jp2.setLayout(new GridLayout(4, 4));
		
		for(int i=0; i<10; i++){
			jp2.add(b[i]);
		}
		
		jp2.add(b[10]);
		jp2.add(b[11]);
		jp2.add(b[12]);
		jp2.add(b[13]);
		jp2.add(b[14]);
		jp2.add(b[15]);
				
		for(int i=0; i<=15; i++){
			b[i].addActionListener(this);
		}
		
		tf.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae){
		s = ae.getActionCommand();
		
		if(s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9")){
			current_text = tf.getText() + s;
			tf.setText(current_text);
		}
		
		if(s.equals("+")){
			first_num = tf.getText();
			tf.setText("");
			operator = "+";
			lb.setText(first_num+operator);
		}
		
		else if(s.equals("-")){
			first_num = tf.getText();
			tf.setText("");
			operator = "-";
			lb.setText(first_num+operator);
		}
		
		else if(s.equals("*")){
			first_num = tf.getText();
			tf.setText("");
			operator = "*";
			lb.setText(first_num+operator);
		}
		
		else if(s.equals("/")){
			first_num = tf.getText();
			tf.setText("");
			operator = "/";
			lb.setText(first_num+operator);
		}
		
		else if(s.equals("=")){
			second_num = tf.getText();
			n1 = Double.valueOf(first_num);
			n2 = Double.valueOf(second_num);
			
			if(!first_num.equals("") && !second_num.equals(""))
			{
				if(operator.equals("+"))
					ans = n1 + n2;
				
				if(operator.equals("-"))
					ans = n1 - n2;
				
				if(operator.equals("*"))
					ans = n1 * n2;
				
				if(operator.equals("/"))
					ans = n1 / n2;
				
				tf.setText(String.valueOf(ans));
				lb.setText(first_num+operator+second_num+"="+String.valueOf(ans));
			}
		}
		
		if(s.equals("Clear")){
			tf.setText("");
			lb.setText("");
		}
	}
	
	public void paint(Graphics g){
		super.paint(g);
	}
}

class simple_calc_using_jframe_main{
	public static void main(String []args){
		simple_calc_using_jframe obj = new simple_calc_using_jframe("Simple Calc");
		obj.setVisible(true);
		obj.setSize(500, 500);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}