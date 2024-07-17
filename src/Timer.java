
public class Timer {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i<=100; i+=3) {
			sum+=i;
		}	
		System.out.println(sum);
		
		int i = 0;
		while(i<=100) {
			System.out.println(i+=3);
			sum+=i;
		} System.out.println(sum);
	}
}

