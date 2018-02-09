import java.util.Scanner;

public class OperClass {
	//int num1;//재료
	//int num2;//재료
	//AddClass ac;
	Hab ac;//변해야함
	NumVo nc;//고정
	
	//생성자
	public OperClass() {
		System.out.println("계산기 프로그램");
		ac = new SubClass();
		nc = new NumVo();
	}
	
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 입력 숫자 : ");
		nc.setNum1(sc.nextInt());
		System.out.println("두번째 입력 숫자 : ");
		nc.setNum2(sc.nextInt());
	}
	
	public void printResult() {
		ac.Calc(nc);
	}

}
