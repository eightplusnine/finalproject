package midterm;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Picture extends Shape{
	public Picture(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled, boolean isGradient) {
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
		//g2d.drawImage("color.png", op, x1, y1);
	}
}
