//You shouldn't need to modify this file.
//You should only comment-out lines you don't need yet.
//(Ctrl + / is the hotkey for fast-comment)

public class Runner_RectPrism {

	public static void main(String[] args) {

		//Make a new RectanglePrism with defaults
		RectPrism r1 = new RectPrism();
		
		//Testing 
		System.out.println("First Prism: Surface Area: " + r1.getSurfaceArea() );
		System.out.println("Expected: 6.0\n");
		
		System.out.println("First Prism: Volume: " + r1.getVolume() );
		System.out.println("Expected: 1.0\n");
		
		//Scale test:
		r1.scale(2);
		System.out.println("First Prism: Scale by 2 on all sides: " + r1.getDimensions() );
		System.out.println("Expected: 2.0 x 2.0 x 2.0\n");
		
		//Scale(overloaded) test:
		r1.scale(2, .25, 4);
		System.out.println("First Prism: Scale by 2 x 0.25 x 4: " + r1.getDimensions() );
		System.out.println("Expected: 4.0 x 0.5 x 8.0\n");
		
		// SECOND PRISM
		//Make a new RectanglePrism with 2, 4, 1.5
		//
		RectPrism r2 = new RectPrism(2, 4, 1.5);
		System.out.println("\nSecond Prism Creating with (2, 4, 1.5): " + r2.getDimensions() );
		System.out.println("Expected: 2.0 x 4.0 x 1.5\n");
		
		//Testing 
		System.out.println("Second Prism: Surface Area: " + r2.getSurfaceArea() );
		System.out.println("Expected: 34.0\n");
		
		System.out.println("Second Prism: Volume: " + r2.getVolume() );
		System.out.println("Expected: 12.0\n");
		
		//Set Length method.
		r2.setLength(1);
		System.out.println("Second Prism: Length to 1: " + r2.getDimensions() );
		System.out.println("Expected: 1.0 x 4.0 x 1.5\n");
		
		//Set Width method.
		r2.setWidth(1.5);
		System.out.println("Second Prism: Width to 1.5: " + r2.getDimensions() );
		System.out.println("Expected: 1.0 x 1.5 x 1.5\n");
		
		//Set Height methods.
		r2.setHeight(2.0);
		System.out.println("Second Prism: Height to 2: " + r2.getDimensions() );
		System.out.println("Expected: 1.0 x 1.5 x 2.0\n");
		
		//Check for calculations
		System.out.println("Second Prism: Volume: " + r2.getVolume() );
		System.out.println("Expected: 3.0\n");
		
		//Set all method.
		r2.setLWH(2,3,4);
		System.out.println("Second Prism: Set all to (2,3,4): " + r2.getDimensions() );
		System.out.println("Expected: 2.0 x 3.0 x 4.0\n");
		
		//Check calculations
		System.out.println("Second Prism: Volume: " + r2.getVolume() );
		System.out.println("Expected: 24.0\n");

	}

}
