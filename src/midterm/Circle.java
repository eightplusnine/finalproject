package midterm;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape{
	public Circle(int x1, int y1, int x2, int y2, Color color){
		super(x1,y1,x2,y2,color);
	}

	public Circle(int x1, int y1, int x2, int y2, Color color, boolean filled){
		super(x1,y1,x2,y2,color,filled);
	}
	
	public Circle(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled){
		super(x1,y1,x2,y2,color,color2,filled);
	}
	
	public Circle(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled, boolean isGradient) {
		super(x1,y1,x2,y2,color,color2,filled,isGradient);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if(isGradient==true && color2!=null){
		  g2d.setPaint(new GradientPaint(5,30,color,35,100,color2,true));
		}else{
		  g2d.setPaint(color);	
		}
		//g.setColor(color);
		
		if(filled){
			g2d.fillOval(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(x1-x2));
		}else{
			g2d.drawOval(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(x1-x2));			
		}
		
	}

	@Override
	public String toString() {
		return "Oval [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", color=" + color + ", color2=" + color2
				+ ", isGradient=" + isGradient + ", filled=" + filled + "]";
	}
	
}