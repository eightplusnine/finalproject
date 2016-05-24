package midterm;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Chess extends Shape{
	
	public Chess(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled, boolean isGradient) {
		super(x1,y1,x2,y2,color,color2,filled,isGradient);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		
		if(filled){
			if(color==null){
			g2d.setColor(Color.BLACK);
			g2d.fillOval(x1-800/34, y1-800/34, 800/17, 800/17);
			}
			else{
				g2d.setColor(color);
				g2d.fillOval(x1-800/34, y1-800/34, 800/17, 800/17);
			}
		}else{
			if(color2==null){
			g2d.setColor(Color.WHITE);
			g2d.fillOval(x1-800/34, y1-800/34, 800/17, 800/17);	
			}
			else{g2d.setColor(color2);
			g2d.fillOval(x1-800/34, y1-800/34, 800/17, 800/17);
			}
		}
		
		
	}

	
}