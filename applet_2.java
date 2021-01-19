/*<Html>
<body>
<applet code="applet_2.class" width="400" height="400">
</applet>
</body>
</Html>*/
import java.applet.*;
import java.awt.*;

public class applet_2 extends Applet
{
	String s="hii";
	public void init()
	{
		s=s+"init";
	}
	public void start()
	{
		s=s+"start";
	}
	public void stop()
	{
		s=s+"stop";
	}
	public void paint(Graphics g) 
	{
		g.drawString("Hello world", 180, 100);
		
		g.setColor(Color.RED);
		g.drawLine(20,80,20,140);
		
		for(int i=50;i<400;i++)
		{
			g.setColor(Color.RED);
			g.fillRect(i,100,30,30);
			try{
			Thread.sleep(50);}
			catch(Exception e){}
		
				g.setColor(Color.white);
				g.fillRect(i,100,30,30);
		}
		
		for(int i=50;i<400;i++)
		{
			g.setColor(Color.RED);
			g.drawOval(i,20,30,30);
			try{
			Thread.sleep(50);}
			catch(Exception e){}
		
				g.setColor(Color.white);
				g.drawOval(i,20,30,30);
		}
		//g.drawRect(50,100,30,30);
		
		//g.setColor(Color.red);
		//g.fillRect(100,100,30,30);
		//g.setColor(Color.green);
		//g.drawOval(50,20,30,30);
		showStatus(s);
		
	}
}