package quiz_week01_03.dajeong;


import java.util.Scanner;



public class Quiz_week01_03_ti {
	public static void main(String[] args) {
//		1. ����ڿ��� ���ڸ� 5�� �Է¹޴´�.
//		>> ����ڴ¹����� ���ڸ� �Է��Ѵٴ� �����Ͽ� �ڵ��Ѵ�.
//		��� ����) �Է� 1 >> 10
//			    �Է� 2 >> 9
//			    �Է� 3 >> 8
//			    �Է� 4 >> 1
//			    �Է� 5 >> 2
//		2. �Է� ���� ���ڸ� 1���� �迭�� �����Ѵ�.
//		3. �ش� �迭�� ���� ���ķ� �����Ѵ�.
//		4. ȸ���� ���� ��Ȳ�� ������ش�.
//		��� ����) 1ȸ ���� : x x x x x 
//				2ȸ ���� : x x x x x
//				nȸ ���� : x x x x x

		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("�Է� " + (i + 1) + " >>");
			inputs[i] = Integer.parseInt(scanner.nextLine());
		}
		scanner.close();

		for (int i = 0; i < inputs.length; i++) {
			for (int j = 0; j < inputs.length - 1; j++) {
				if (inputs[j] > inputs[j + 1]) {
					int temp = inputs[j + 1];
					inputs[j + 1] = inputs[j];
					inputs[j] = temp;
				}
			}
			System.out.printf("%dȸ ���� : ", i + 1);
			for (int value : inputs)
				System.out.print(value + " ");
			System.out.println();
		}
	}
}