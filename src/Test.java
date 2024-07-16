
public class Test {
	public static void main(String[] args) {
		
	int kor = 100;
	int eng = 10;
	int math = 10;
	int total = kor + eng + math;
	double ts = (double) total/3 ;
	
	if(ts>=90) {
		System.out.println("a입니다.");
	}
	if(ts>=80) {
		System.out.println("b입니다.");
	}
	if(ts>=70) {
		System.out.println("c입니다.");
	}
	if(ts>=60) {
		System.out.println("d입니다.");
	}else {
		System.out.println("탈락입니다.");
	}
	
	if(kor > eng && kor > math) {
		System.out.println(kor);
	}
}
}
