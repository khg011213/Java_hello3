//메모리 주소를 한번에 cpu에 전송할수있는 최대가 32//
class A{
	int num; //인스턴스 변수//
	int kor,eng,math;
}
//참조형 변수 선언시 class의 이름을 사용한다. class이름과 같은 함수는//
public class Timer6 {

	public static void main(String[] args) {
		A a;
		a = new A();
		//new 객체 = 인스턴스 생성 키워드//
		a.num = 3;
		System.out.println(a.num);

		System.out.println(a);
		
		a.kor = 90;
		a.eng = 90;
		a.math = 80;
		
		System.out.println("국어" + a.kor);
		System.out.println("영어" + a.eng);
		System.out.println("수학" + a.math);
	}

}
