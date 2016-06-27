package thresholding;

import org.junit.Test;
import static thresholding.Threshold.createMask;
import static centom.CenterOfMass.com;



import  static savePNG.savePNG.savePNG;;

public class ThresholdTests
{
	@Test
	public void createArrayAndSegmentTest() {
		// create an array with a circle in the center
		int height = 500;
		int width = 500;
		
		int x0 = 260;
		int y0 = 260;
		
		int[][] circle = new int[height][width];
		double radius = 70;
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				circle[i][j] = ((i - x0)*(i - x0) + (j - y0)*(j - y0) <= radius*radius) ? 100:0;
			}
		}
		String path = "/Users/dibrov/Documents/PhD/randomImages/";
		String name = "circle.png";
		
		savePNG(circle, path, name);
		
		double thresh = 5;
		int[][] segm = createMask(circle, thresh); 
		
		savePNG(segm, path, "segmented.png");		
		
		int[] cent = com(segm);
		
		System.out.println("find the com:");
		System.out.format("x, y is %d %d", cent[0], cent[1]);
	} 
	
	
}
