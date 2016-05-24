package midterm;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Flag extends Rect{

	public Flag(int x1, int y1, int x2, int y2, Color color, Color color2) {
		super(x1, y1, x2, y2, color, color2);
	}
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color);
		y2=y1+9*(x2-x1)/12;
		g2d.fillRect(Math.min(x1,x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2));
		
		g2d.setColor(Color.WHITE);
		g2d.fillRect(Math.min(x1,x2), Math.min(y1, y2)+Math.abs(y1-y2)*7/18, Math.abs(x1-x2), Math.abs(y1-y2)*2/9);
		g2d.fillRect(Math.min(x1,x2)+Math.abs(y1-y2)*7/18, Math.min(y1, y2), Math.abs(y1-y2)*2/9, Math.abs(y1-y2));
		
		g2d.setColor(color2);
		g2d.fillRect(Math.min(x1,x2), Math.min(y1, y2)+Math.abs(y1-y2)*8/18, Math.abs(x1-x2), Math.abs(y1-y2)*1/9);
		g2d.fillRect(Math.min(x1,x2)+Math.abs(y1-y2)*8/18, Math.min(y1, y2), Math.abs(y1-y2)*1/9, Math.abs(y1-y2));
		
		
	}
}
