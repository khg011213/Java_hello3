
public class Money2 {
	public static void main(String[] args) {
		int num = 5;
		
		if(num >= 5) {
			num = 10;
		}else {
			num = 20;
		}
		
		int n =1;
		switch(n) {
		case 1 :
			System.out.println("겨울입니다");
			break;
		case 2 :
			System.out.println("겨울입니다");
			break;
		case 3 :
			System.out.println("봄입니다");
			break;
		case 4 :
			System.out.println("봄입니다");
			break;
		case 5 :
			System.out.println("봄입니다");
			break;
		case 6 :
			System.out.println("여름입니다");
			break;
		case 7 :
			System.out.println("여름입니다");
			break;
		case 8 :
			System.out.println("여름입니다");
			break;
		case 9 :
			System.out.println("가을입니다");
			break;
		case 10 :
			System.out.println("가을입니다");
			break;
		case 11 :
			System.out.println("가을입니다");
			break;
		case 12 :
			System.out.println("겨울입니다");
			break;
			
		default:	
			System.out.println("잘못된 입력입니다.");
		}
		
		int month = 12;
		
		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("봄");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("여름");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("가을");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("겨울");
				break;
		}
		
		int count = 1;
		while(count<=100) {
			System.out.println(count + "번" + "hello world");
			count++;
		}
		count = 1;
		do {
			System.out.println(count + "번" + "hello world" );
			count++;
		}while(count <=100);
		
		for(int i = 1; i<=100; i++) {
			System.out.println(i + "번" + "hello world");
		}
		
		// 1부터 100까지의 합
		int sum = 0;
		for(int a =1; a<=100; a++) {
			sum+=a;
		}
		
		System.out.println(sum);
		
		for(int dan = 1; dan<=9; dan++)
		for(int i = 1; i<=9; i++ ) {
			System.out.println(dan + "단 : " + dan+ "*"+i +" = "+ dan*i);
		}
		
		
		for(int hol = 1; hol<=100; hol+=2) {
			if(hol%2==1) {
				System.out.println(hol);
			}
		}
		
		for(int i =100; i >=1; i-=2) {
			System.out.println(i);
		}
		
		sum =0;
		for(int hol = 1; hol<=100; hol++) {
			if(hol%3 != 0) {
				sum+= hol;
				System.out.println(sum);
			}
		}
		
		int i = 1;
		sum = 0;
		while(i <=100) {
			if(i%3!=0) {
				sum +=i;
			}
			System.out.println(sum);
			i++;
		}
		
		
	}
}
