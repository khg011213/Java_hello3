
public class Timer2 {

	public static void main(String[] args) {
		int dan = 3;
		for(int i= 1; i <=9; i++) {
			System.out.println(dan + "단 : " + (i * dan));
		}
		
		int kor = 100;
		int eng = 80;
		int math = 90;
		
		int ts = (kor >= eng && kor >= math) ? kor : 0 ;
		
		int num = 1;
		boolean search = false;
		while (num<100) {
			if( (num%5 == 0) && (num%7 == 0) ) {
				search = true;
				break;
			}
			
			num++;
		}
		
		if (search) {
			System.out.println(num);
		}
		
	}
}

