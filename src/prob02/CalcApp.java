package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		//인터페이스로
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		Arithmetic arit = null;
		int result = 0;
		switch(operation) {
		case "+":
			arit = new Add(a,b);
			result = arit.calculate(a,b);
			break;
		case "-":
			arit = new Sub(a,b);
			result = arit.calculate(a,b);
			break;
		case "*":
			arit = new Mul(a,b);
			result = arit.calculate(a,b);
			break;
		case "/":
			arit = new Div(a,b);
			result = arit.calculate(a,b);
			break;
		default:
			System.out.println("연산기호를 +,-,*,/ 중에서 다시 입력해주세요");
			return;
		}
		System.out.println(result);
		
	}
}
