package pkgShape;

import java.util.Collections;

public class Rectangle extends Shape{
	int iWidth;
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	int iLength;
	
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

	@Override
	public double perimeter() {
		return 2 * (iWidth + iLength);
	} 


	
	

}
