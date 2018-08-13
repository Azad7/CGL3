 
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Emo extends JFrame
{

	public Emo()
	{
		setTitle("Emo");
		setSize(960,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(250, 200, 350, 350);
		//g.setColor(Color.YELLOW)
		//g.dOval(250,200,350,350);
		

		
		g.setColor(Color.black);
	g.fillRect(310,290,80,8);
		
		g.setColor(Color.black);
		g.fillRect(460,290,80,8);
		
		g.setColor(Color.black);
	g.fillRect(355,460,150,8);
		
		
		
//		g.setColor(Color.black);
//		g.fillOval(310,290,80,8);
		
//		g.setColor(Color.black);
//		g.fillOval(460,290,80,8);
		
		g.setColor(Color.black);
		g.fillOval(355,460,150,8);
		
		



		
	
		
	}
	public static void main(String[] args) 
	{
		Emo f = new Emo();
	}

}

