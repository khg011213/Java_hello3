
public class Timer3 {
	
	public static void star(int a) {
		for(int i = 1; i <= a; i++) {
			for (int k= 4; k>=i; k --) {
				System.out.print(" ");
			}
			for (int j =1 ; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
	}

	public static void main(String[] args) {
			star(5);
				
		}
	
		}
		
	


