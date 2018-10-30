package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	private int iDepth;
	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return super.getiLength() * super.getiWidth() * this.iDepth;
		
	}
	@Override 
	public double area() {
		return 2 * (this.iDepth * super.getiLength() 
				+ super.getiLength() * super.getiWidth() +
				super.getiWidth() * this.iDepth);
	}
	public double perimeter() {
		throw new UnsupportedOperationException("Cannot find perimeter of cuboid!");
	}
	
	class SortByArea implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			return Double.compare(a.area(), b.area());
		
		}
	}
	class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid a, Cuboid b) {
			return Double.compare(a.volume(), b.volume());		
		
	}
		

}
}