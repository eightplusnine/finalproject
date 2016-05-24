package midterm;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Square extends Shape{
	
	public Square (int x1, int y1, int x2, int y2, Color color){
		super(x1,y1,x2,y2,color);
	}

	public Square (int x1, int y1, int x2, int y2, Color color, boolean filled){
		super(x1,y1,x2,y2,color,filled);
	}
	
	public Square (int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled){
		super(x1,y1,x2,y2,color,color2, filled);
	}
	
	public Square (int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled, boolean isGradient) {
		super(x1,y1,x2,y2,color,color2, filled,isGradient);
	}
	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if(isGradient==true && color2!=null){
			g2d.setPaint(new GradientPaint(5,30,color,35,100,color2,true));			
		}else{
			g2d.setPaint(color);
		}

		if(filled){
			g2d.fillRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x1-x2), Math.abs(x1-x2));
		}else{
			g2d.drawRect(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x1-x2), Math.abs(x1-x2));			
		}
		
	}
	
}
