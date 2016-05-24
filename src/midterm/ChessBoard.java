package midterm;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ChessBoard extends Square{

	public ChessBoard(int x1, int y1, int x2, int y2, Color color, Color color2, boolean filled, boolean isGradient) {
		super(x1, y1, x2, y2, color, color2, filled, isGradient);
	}

	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		y2=y1+(x2-x1);
		for(int i=0;i<=14;i++){
			g2d.setStroke(new BasicStroke(2.0f));
			g2d.drawLine(100,50+800/14*i,900,50+800/14*i);
			g2d.drawLine(100+800/14*i,50,100+800/14*i,850);
		}
	}
}