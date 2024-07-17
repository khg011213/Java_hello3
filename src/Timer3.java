
public class Timer3 {

	public static void main(String[] args) {
		int count = 0;
		for(int num = 1; num <= 100; num ++) {
			if(num%3 == 0 && num%4 ==0) {
				count ++;
				System.out.println(num);
			}
		}System.out.println(count);
		

			
		for(int i = 2; i <=	9; i++ ){	
			for (int j = 1; j<10; j++)
				if((i*j)%2==1) {
					
				
				System.out.println(i + "*" + j + "=" + (i*j));
				}
		}
		}
		
	}


