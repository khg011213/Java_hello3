
public class IntegerLiterals {

	public static void main(String[] args) {
		
		byte n1 = 2;

		System.out.println((byte) (n1 << 1) + "");
		System.out.println((byte) (n1 << 2) + "");
		System.out.println((byte) (n1 << 3) + "");
		
		int num1 = 5;
		int num2 = 7;
		
		if (num1 == num2) {
			
			System.out.println("같습니다.");
		}  
		if(num1 < num2) {
			System.out.println("num2가 더 큽니다");
		}
		if(num1 > num2) {
			System.out.println("num1이 더 큽니다");
		}
		
		int num = 12;
		
		if (num%2 == 1 ) {
			System.out.println("홀수입니다. ");
		}else if (num%2 == 0) {
			System.out.println("짝수입니다. ");
		}
		
		int num3 = 50;
		
		if ((num >= 1) && (num <=100)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if ( num3<=1) {
			System.out.println("false입니다.");
		}else if(num3<=100) {
			System.out.println("0이상 100미만입니다");
		}else {
			System.out.println("100이상입니다");
		}
		
		if ((num%2 == 0) && (num%3 == 0)) {
			System.out.println("2와 3의 배수입니다");
		} else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
		
		int kor = 90;
		int eng = 85;
		int math = 90;
		int total = kor + eng + math;
		double ts = (double) total/3 ;
		
		System.out.println(ts);
		
		if(90<=ts) {
			System.out.println("a입니다.");
		}else if(80<=ts) {
			System.out.println("b입니다.");
		}else if(70<=ts) {
		System.out.println("c입니다.");
		}else if(60<=ts) {
			System.out.println("d입니다.");
		} else {
			System.out.println("탈락입니다.");
		}
		
		int nem1 = 60;
		int nem2 = 70;
		int nem3 = 50;
		int max;
		
		int mid = nem1;
		
		if( (nem1  <= nem2) && (nem1 >= nem3)||(nem1  <= nem3) && (nem1 >= nem2)) {
			mid = nem1;
			System.out.println( mid +"중간값은 1입니다");
		}
		
		int result = true ? 1 : 0;
		System.out.println(result);
		
		result = (1>10) ? 1 : 0;
		System.out.println(result);
		
		boolean bool = (1>10) ? true : false;
		System.out.println(bool);
		
		
		bool = (1<10) ? true : false;
		System.out.println(bool);
		
		
		
//		if((nem1 >= nem2) && (nem1>= nem3)) {
//			max = nem1;
//		}else if ((nem2 >= nem1) && (nem2>= nem3)) {
//			max = nem2;
//		}else if ((nem3 >= nem1) && (nem3>= nem2)) {
//			max = nem3;
//		}
//		
//		max = nem1;
//		
//		if (max <= nem2) {
//			max= nem2;
//		}
//		if (max <= nem3) {
//			max= nem3;
//		}
//		
//		System.out.println(max);
//		
//		if (nem1 >= nem2) {
//			if(nem1>= nem3) {
//				max = nem1;
//			}
//		}else if (nem2 >= nem1) {
//			if(nem2>= nem3) {
//				max = nem2;
//			}
//			else {
//				max = nem3;
//			}	
//		}
//	
//		
//		
	}
	
}


