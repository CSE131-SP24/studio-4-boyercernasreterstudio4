package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(104,104,216);
		StdDraw.filledRectangle(0.5,0.5,0.4,0.2);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(0.5, 0.6, 0.4, 0.025);
		StdDraw.filledRectangle(0.5, 0.4, 0.4, 0.025);
		StdDraw.filledRectangle(0.3, 0.5, 0.025, 0.2);
		StdDraw.filledRectangle(0.7, 0.5, 0.025, 0.2);
		StdDraw.filledCircle(0.5, 0.5, 0.04);
		StdDraw.filledRectangle(0.5, 0.46, 0.02, 0.015);
		StdDraw.setPenColor(104,104,216);
		Font font= new Font("Arial",Font.BOLD,25);
		StdDraw.setFont(font);
		StdDraw.text(0.5,0.6,"GANGDUMB");
	}
}