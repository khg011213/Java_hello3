//이름 짓는버 낙타 타법 뱀 타법
public class Pie2 {

	public static void main(String[] args) {
		for( int i= 1; i <=5; i++ ) {
			for( int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		for( int i= 1; i <=5; i++ ) {
			for( int j = 5; j >= i; j--) {
				System.out.print("*");
			}System.out.println();
		}
		
		for( int i= 1; i <=5; i++ ) {

			for(int k = 5; k >= i; k--) 
				System.out.print(" ");			
			for(int j = 1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int i= 1; i <=5; i++) {
			for (int j =5; j>=i; j--) {
				System.out.print("*");
			}System.out.println( );
		}
	}
}

