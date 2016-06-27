package thresholding;

public 	class Threshold
{
	/* --- a function to create a binary mask out of a 2d array --- */
	public static int[][] createMask(int[][] imageArray, double thresholdValue) {
		
	// exception handling        
    if (imageArray == null) {
        throw new java.lang.NullPointerException("Array is null.");
    }
    
    int height = imageArray.length;
    
    if (height == 0) {
        throw new java.lang.IllegalArgumentException("Array is empty.");
    }
         
    int width = imageArray[0].length;
    
    if (width == 0) {
        throw new java.lang.IllegalArgumentException("first string of the input array is empty.");
    }
    
    // check
    System.out.println("height is: " + height + " width is : " + width);
		
		int[][] res = new int[height][width];
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				res[i][j] = (imageArray[i][j] >= thresholdValue) ? 1:0;
			}
		}
		
		return res;
	}
	
	
	
}
