import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class textfield extends JFrame implements ActionListener
{
	JPanel p1;
	JPanel p2;

	JButton b1;
	JButton b2;
	JButton b3;

	JTextField f1;
	JTextField f2;
	JTextField f3;
	
	JLabel l1;
	JLabel l2;
	JLabel l3;

	String s="";
	textfield(String s1)
	{
		super(s1);

		p1=new JPanel();
		p2=new JPanel();

		setLayout(new GridLayout(2,1));

		add(p1);
		add(p2);

		l1=new JLabel("No1");
		f1=new JTextField(20);

		l2=new JLabel("No2");
		f2=new JTextField(20);

		l3=new JLabel("Answer");
		f3=new JTextField(20);

		p1.setLayout(new FlowLayout());

		p1.add(l1);
		p1.add(f1);
		f1.addActionListener(this);

		p1.add(l2);
		p1.add(f2);
		f2.addActionListener(this);

		p1.add(l3);
		p1.add(f3);
		f3.addActionListener(this);

		b1=new JButton("ADD");
		b2=new JButton("SUB");
		b3=new JButton("CLEAR");

		p2.setLayout(new FlowLayout());

		p2.add(b1);
		b1.addActionListener(this);

		p2.add(b2);
		b2.addActionListener(this);

		p2.add(b3);
		b3.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ref=ae.getSource();
		if(ref instanceof JTextField)
		{
			s=f3.getText();
			repaint();
		}
		if(ref instanceof JButton)
		{
			s=ae.getActionCommand();
			if(s.equals("ADD"))
			{
				int a,b,sum;
				a=Integer.parseInt(f1.getText());
				b=Integer.parseInt(f2.getText());

				sum=a+b;
				String k;
				k=Integer.toString(sum);
				f3.setText(k);
				repaint();
			}
			if(s.equals("SUB"))
			{
				int a,b,sub;
				a=Integer.parseInt(f1.getText());
				b=Integer.parseInt(f2.getText());

				sub=a-b;
				String k;
				k=Integer.toString(sub);
				f3.setText(k);
				repaint();
			}
			if(s.equals("CLEAR"))
			{
				f1.setText("");
				f2.setText("");
				f3.setText("");
				repaint();
			}
		}
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString(s,150,150);
	}

} 
class frame_textfield
{
	public static void main(String []args)
	{
		textfield t=new textfield("FRAME_TEXTFIELD");

		t.setSize(250,400);
		t.setVisible(true);

		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}