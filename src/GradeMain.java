
public class GradeMain {

	public static void main(String[] args) {
		int kor = 90;
		int math = 90;
		int eng = 70;
		
		int pt = kor + math + eng;
		
		System.out.println( "국어 : " +kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("총점 : " + pt);
		System.out.println("평균 : " + pt/3 );
	}

}

