package prob01;

import java.util.Scanner;

public class Gugudan {
	static int resultNumber = 0;

	public static void main(String[] args) {
		int l = randomize(1, 9);
		int r = randomize(1, 9);

		resultNumber = l * r;

		int[] answerNumbers = randomizeAnswers();
		int loc = randomize(0, 8);
		answerNumbers[loc] = resultNumber;

		System.out.println(l + " x " + r + " = ?");

		int length = answerNumbers.length;
		for (int i = 0; i < length; i++) {
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}

			System.out.print(answerNumbers[i]);
		}

		System.out.print("\n\n");
		System.out.print("answer:");

		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		System.out.println();
		if (input == answerNumbers[loc]) {
			// if(input==(l*r)) { 는 그냥 곱한수와 비교 문제는 배열과 비교
			System.out.println("정답");
			return;
		}
		System.out.println("오답");
	}

	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}

	private static int[] randomizeAnswers() {

		final int COUNT_ANSWER_NUMBER = 9;
		final int MAX_ANSWER_NUMBER = 81;

		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];
		int occupied = 0;

		while (occupied < COUNT_ANSWER_NUMBER) {

			int random = (int) (Math.random() * MAX_ANSWER_NUMBER) + 1;

			boolean evaluted = false;
			// 9개의 배열에 랜덤값을 보여줘야된다.
			for (int i = 0; i < occupied; i++) {

				if (boardNumbers[i] == random) {
					evaluted = true;
					
				}
			}

			if (!evaluted) {
				boardNumbers[occupied++] = random;
			}
		}

		return boardNumbers;
	}
}
