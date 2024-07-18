
public class Timer5 {

	public static void star(int a) {
		for (int i = 1; i <= a; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}

	public static double square(double num) {
		return num * num;
	}

	public static double avg(double a, double b, double c) {
		return (a + b + c) / 3.0;
	}

	public static String grade(double avg) {
		switch((int)avg/10) {
			case 9:
				return "수";
			case 8:
				return "우";
			case 7:
				return "미";
			case 6:
				return "양";
			case 5:
				return "가";
			default:
				return "F";
				
		}
	}
	
	public static double circleArea(double pi) {
		double area = pi * pi * Math.PI;
		return area;
	}
	
	public static double retangleArea(double width, double height) { 
		double area = width * height;
		return area;
	}
	
	public static void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과" + num1/num2);
	}
	
	public static void main(String[] args) {
		
		{
			int num= 10;
			System.out.println(num);
		}
		{
			int num= 10;
			System.out.println(num);
		}
		
		
		star(5);
		int result;
		result = adder(4, 5);
		double avg = avg(90,100,100);
		String grade = grade(avg);
		
		System.out.println(result);
		System.out.println(square(3.5));
		System.out.println(avg(100, 100, 96));
		System.out.println(grade);
		
		System.out.println(circleArea(10));
		
		System.out.println(retangleArea(14.5,16.7));
		divide(4,2);
		divide(9,0);
	}

}
