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
	public void init()// to create an applet object wqe need to give a constructor with no parameters
	{
		s=s+"init";
	}
	public void start()// after init() we will use start to resume the execution of the applet object .
	// if the user comes back some time later the applet will be resumed web browser due to this 
	{
		s=s+"start";
	}
	public void stop()//the web browser closes the application from the html 
	//i.e it will stop any running threads currently executing
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