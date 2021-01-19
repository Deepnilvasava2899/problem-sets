/*<Html>
<body>
<applet code="new_applet.class" width="400" height="400">
</applet>
</body>
</Html>*/
import java.applet.*;
import java.awt.*;

public class new_applet extends Applet
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
		g.drawString("3cp03", 180, 60);
		
		g.setColor(Color.blue);
		g.drawLine(20,80,20,140);
		g.drawRect(50,100,30,30);
		
		g.setColor(Color.red);
		g.fillRect(100,100,30,30);
		g.setColor(Color.green);
		g.drawOval(50,20,30,30);
		showStatus(s);
		
	}
}