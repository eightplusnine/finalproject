package midterm;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class OOXX extends Shape{
	
	public OOXX(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled, boolean isGradient) {
		super(x1,y1,x2,y2,color,color2,filled,isGradient);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		
		if(filled){
			g2d.setColor(color2);
			g2d.setStroke(new BasicStroke(5.0f));
			g2d.drawLine(x1, y1, x2, y2);
			g2d.drawLine(x2, y1, x1, y2);	
		}else{
			g2d.setColor(color);
			g2d.setStroke(new BasicStroke(5.0f));
			g2d.drawOval(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(x1-x2));
			
		}
		
		
	}

	
}