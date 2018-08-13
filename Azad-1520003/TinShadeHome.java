import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
public class TinShadeHome extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7133320073364785635L;
	private static TinShadeHome h;
	public TinShadeHome()
	{
		setTitle("TriangleDraw");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.drawLine(100, 250, 400, 250);
		g.setColor(Color.BLUE);
		g.drawLine(100, 250, 250, 100);
		g.setColor(Color.BLUE);
		g.drawLine(250, 100, 400, 250);
		
		
		g.setColor(Color.BLACK);
		g.drawLine(120, 250, 120, 500);
		
		g.setColor(Color.BLACK);
		g.drawLine(120, 500, 370, 500);
		
		g.setColor(Color.BLACK);
		g.drawLine(370, 500,370, 250);
		
		g.setColor(Color.BLACK);
	g.fillRect(220,350,60,150);
	
	g.setColor(Color.YELLOW);
	g.fillRect(150,300,50,50);
	
	g.setColor(Color.YELLOW);
	g.fillRect(300,300,50,50);
	}
	public static void main(String[] args) 
	{
		TinShadeHome h = new TinShadeHome();
	}

}







