/*
<Html>
<body>
<applet code="myapplet.class" width=100 height=100>
</applet>
</body>
</html>
*/
import java.applet.*;
import java.awt.*; // here the graphics class is used 
public class myapplet extends Applet
{
	String s="HII there this code is written by deepnil";
	public void init()// this function is used for initialization
	{
		s=s+"init";
	}
	public void start() // this fucntion is used to start
	{
		s=s+"init";
	}
	public void stop()
	{
		s=s+"stop";
	}
	public void paint(Graphics g)
	{
		g.drawString("3cp03", 180, 60);
		
		g.setColor(Color.blue);
		g.drawLine(30,40,30,140);
		g.drawRect(80,200,100,70);
		
		g.setColor(Color.red);
		g.fillRect(100,100,30,30);
		g.setColor(Color.green);
		g.drawOval(50,20,30,30);
		showStatus(s);
		g.drawString("this is one ",100,100);
	}


}
