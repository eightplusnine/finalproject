package midterm;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class OOXXBoard extends Square{

	public OOXXBoard(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled, boolean isGradient) {
		super(x1, y1, x2, y2, color, color2, filled, isGradient);
	}

	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if(isGradient==true && color2!=null){
			g2d.setStroke(new BasicStroke(5.0f));
			g2d.setPaint(new GradientPaint(5,30,color,35,100,color2,true));			
		}else{
			g2d.setPaint(color);
		}
		g2d.setStroke(new BasicStroke(5.0f));
		g2d.drawLine(x1, y1+Math.abs(y2-y1)/3, x2, y1+Math.abs(y2-y1)/3);
		g2d.drawLine(x1, y1+Math.abs(y2-y1)*2/3, x2, y1+Math.abs(y2-y1)*2/3);
		g2d.drawLine(x1+Math.abs(x2-x1)/3, y1, x1+Math.abs(x2-x1)/3,y2);
		g2d.drawLine(x1+Math.abs(x2-x1)*2/3, y1, x1+Math.abs(x2-x1)*2/3, y2);
	}
}
