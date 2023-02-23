package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Color color1 = new Color (220,80,120);
		Color color2 = new Color (0,0,0);
		StdDraw.setPenColor(color1);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		StdDraw.setPenColor(color2);
		StdDraw.filledEllipse(0.5, 0.5, 0.18, 0.15);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.3);
	}
}