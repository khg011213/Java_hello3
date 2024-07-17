
public class Method {
	
	public static void hiEveryone() {
		for (int i = 1; i<=5; i++ ) {
			System.out.println("I say hello");
		}
		
	}	
//함수 () 안에는 자료형 변수선언가능// 
	
	public static void add(int a, int b) {
		int result;
		result = a+ b;
		System.out.println(result);
	}
	
	public static void printStar(int star) {
		for (int i = 1; i <= star; i++) {
			for(int j= 1; j<= i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
			
			
	}
	
	public static void main(String[] args) {
//		System.out.println("Hello world");
		hiEveryone();
		add(5,7);
		add(15,49);
		printStar(5);
	}	
}
