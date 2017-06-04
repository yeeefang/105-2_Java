
public class Q1 {

	public static void main(String[] args) {
		RightTriangle r1 = new RightTriangle();
		RightTriangle r2 = new RightTriangle(5,5);
		
		System.out.println("Right Triangle 1:");
		printRightTriangle(r1);
		System.out.println("Right Triangle 2:");
		printRightTriangle(r2);
		r1.setWidth(5);
		r1.setHeight(12);
		System.out.println("\nRight Triangle 1 is updated!\n");
		System.out.println("Right Triangle 1:");
		printRightTriangle(r1);
		System.out.println("\nArray of right triangles:");
		RightTriangle[] arr = new RightTriangle[3];
		for(int i=0;i<arr.length;i++){
			arr[i] = new RightTriangle(Math.random()*10,Math.random()*10);
			System.out.println("Right Triangle " + "[" + i + "]");
			System.out.println("Area = " + arr[i].getArea());
		}
		RightTriangle r3 = findMaxArea(arr);
		System.out.println("The maximum area is: " + r3.getArea());
	}
	
	public static void printRightTriangle(RightTriangle R){
		System.out.println("width = " + R.getwidth() + " height = " + R.getheight() + " slope = "+R.getslope());
		System.out.println("Area = " + R.getArea());
		System.out.println("Perimeter = " + R.getPerimeter()+ "\n");
	}
	public static RightTriangle findMaxArea(RightTriangle[] arr){
		double temp = 0;
		int order = 0;
		for(int i=0; i<3;i++){
			if(arr[i].getArea() > temp){
				temp = arr[i].getArea();
				order = i;
			}
		}
		return arr[order];
	}

}

class RightTriangle{
	private double width=3.0;
	private double height=4.0;
	private double slope=5.0;
	RightTriangle(){
		
	}
	RightTriangle(double width, double height){
		this.width = width;
		this.height = height;
		this.slope = Math.pow((width*width)+(height*height),0.5);
	}
	
	public void setWidth(double a){
		width = a;
		slope = Math.pow((width*width)+(height*height),0.5);
	}
	public void setHeight(double a){
		height = a;
		slope = Math.pow((width*width)+(height*height),0.5);
	}
	public double getwidth(){
		return width;
	}
	public double getheight(){
		return height;
	}
	public double getslope(){
		return slope;
	}
	
	public double getArea(){
		return width*height/2;
	}
	
	public double getPerimeter(){
		return width+height+Math.pow((width*width)+(height*height), 0.5);
	}
	
}