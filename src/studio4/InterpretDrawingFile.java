package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
		Boolean filled = in.nextBoolean();
		double p1 = in.nextDouble();
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();
		if (shapeType.equals("rectangle"))
		{
			if(filled == true)
			{
				StdDraw.filledRectangle(p1, p2, p3, p4);
			}
			else
			{
				StdDraw.rectangle(p1, p2, p3, p4);
			}
		
		}
		
		
		
	}
}
