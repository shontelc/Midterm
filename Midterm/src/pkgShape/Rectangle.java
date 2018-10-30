package pkgShape;


public class Rectangle extends Shape{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength){
		this.iWidth = iWidth;
		this.iLength = iLength;
		
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	
	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		 return iWidth * iLength;		
	}

	public double perimeter() {
		return 2 * (iWidth + iLength);
	} 
	
	public int compare(Rectangle a, Rectangle b) {
		return Double.compare(a.area(), b.area());
	}


	
	

}
