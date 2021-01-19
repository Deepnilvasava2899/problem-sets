import java.applet.*;
import java.awt.*;
/*
<applet code = "moving_circle" height = 800 width = 800></applet>
*/
public class moving_circle extends Applet implements Runnable{
	Thread t;
	int x =15;
	int y = 15;
	/*circle(int x , int y){
		this.x =x;
		this.y = y;
	}*/
	public void run(){
		
		for(int i = 0 ; i<=100;++i){
			x += i;
			y += i;
			repaint();
		}
	}
	public void init(){
		setBackground(Color.gray);
		t= new Thread(this);
		t.start();
	}
	public void start(){

	}
	public void stop(){

	}
	public void paint(Graphics g){
		g.drawString("welcom ",0,0);
		g.setColor(Color.red);
		g.drawOval(x,y,x+10,y+10);

	}

}