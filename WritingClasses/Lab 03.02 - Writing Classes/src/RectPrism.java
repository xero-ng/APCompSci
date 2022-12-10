
public class RectPrism {
	//Instance Variables
	double length;
	double width;
	double height;
	double surfaceArea;
	double volume;

	
	
	//2 Constructors - RectPrism()
	public RectPrism() {
		length = 1;
		width = 1;
		height = 1;
		surfaceArea = 1;
		volume = 1;
	}

	public RectPrism(double x, double y , double z) {
		length = x; 
		width = y;
		height = z;
	}
	
	
	
	//Accessor Methods
	//
	//getVolume()
	
	public double getVolume() {
		return(length * width * height);
	}
	//getSurfaceArea()
	
	public double getSurfaceArea() {
		return(2 * ((width * length) + (height * length) + (height * width)));
	}

	//getDimensions()
	public String getDimensions(){	
		return("The prism is " + length + " X " + width + " X " + height);
	}
	
	//Mutator Methods
	//
	//setLength(double)
	public void setLength(double len) {
		length = len;
	}
	//setWidth(double)
	public void setWidth(double wid) {
		width = wid;
	}
	//setHeight(double)
	public void setHeight(double hei) {
		height = hei;
	}
	//setLWH(double, double, double)
	public void setLWH(double p1, double p2, double p3) {
		length = p1;
		width = p2;
		height = p3;
	}
	
	
	//"Action" Methods (also mutators)
	//
	//scale(double)
	public void scale(double scaleFactor) {
		length = length * scaleFactor;
		width = width * scaleFactor;
		height = height * scaleFactor;
	}
	//scale(double, double, double) overloaded version
	public void scale(double scaleFactorL, double scaleFactorW, double scaleFactorH) {
		length = length * scaleFactorL;
		width = width * scaleFactorW;
		height = height * scaleFactorH;
	}
}
