import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class jf extends JFrame implements ItemListener, ActionListener
{
	JPanel jp1;
	JPanel jp2;
	
	JCheckBox jcb1;
	JCheckBox jcb2;
	
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JTextField jtf;
	JLabel jl;
	
	String s=" ";
	
	jf(String title)
	{
		super(title);
		
		jp1=new JPanel();
		jp2=new JPanel();
		
		setLayout(new GridLayout(2,1));
		
		add(jp1);
		add(jp2);
		
		jcb1=new JCheckBox("A");
		jcb2=new JCheckBox("B");
		
		jp1.setLayout(new FlowLayout());
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		
		jl=new JLabel("Name");
		jtf=new JTextField(20);
		
		jb1=new JButton("Read");
		jb2=new JButton("Clear");
		
		jp2.setLayout(new FlowLayout());
		
		jp2.add(jl);
		jp2.add(jtf);
		jtf.addActionListener(this);
		
		jp2.add(jb1);
		jb1.addActionListener(this);
		
		jp2.add(jb2);
		jb2.addActionListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		s=jcb1.getText()+" "+jcb1.isSelected()+" "+jcb2.getLabel()+" "+jcb2.isSelected();
		repaint();
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ref=ae.getSource();
		
		if(ref instanceof JTextField)
		{
			s=jtf.getText();
			repaint();
		}
		else
		{
			s=ae.getActionCommand();
			
			if(s.equals("Read"))
			{
				s=jtf.getText();
			}
			if(s.equals("Clear"))
			{
				jtf.setText("");
			}
			
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString(s,100,100);
	}
}

class jf_main
{
	public static void main(String [] args)
	{
		jf jf_ref=new jf("Checkboxes, Buttons, Textfields and Panel");
		
		jf_ref.setSize(200,300);
		jf_ref.setVisible(true);
		
		jf_ref.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}