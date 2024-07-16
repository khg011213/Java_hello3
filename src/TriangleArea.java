
public class TriangleArea {

	public static void main(String[] args) {
		double width = 10;
		final double pi = 3.14;
		double area = width*width*pi;
		System.out.println(" 반지름 : " + width);
		System.out.println(" 넓이 : " + area);
		
		boolean bool = 100>area;
		
		if(100<area) {
			System.out.println("100보다 작습니까?. " + false);
		}
	
		System.out.println(bool);
	}
}

