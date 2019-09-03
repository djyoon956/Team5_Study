package quiz_week01_03.dajeong;

import java.util.Scanner;

public class Quiz_week01_03_hn {
	public static void main(String[] args) {
//		1. 사용자에게 숫자를 5번 입력받는다.
//		>> 사용자는무조건 숫자만 입력한다는 가정하에 코딩한다.
//		출력 포맷) 입력 1 >> 10
//			    입력 2 >> 9
//			    입력 3 >> 8
//			    입력 4 >> 1
//			    입력 5 >> 2
//		2. 입력 받은 숫자를 1차원 배열에 저장한다.
//		3. 해당 배열을 버블 정렬로 정렬한다.
//		4. 회마다 정렬 상황을 출력해준다.
//		출력 포맷) 1회 정렬 : x x x x x 
//				2회 정렬 : x x x x x
//				n회 정렬 : x x x x x
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("숫자를 5개 입력해주세요.");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("입력" + (i+1) + ">> ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("버블정렬 시작 >>>>>>>");
		
		int temp=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print((i+1)+"회 정렬: ");
			for (int value : arr) {
				System.out.print(value);
			}
			System.out.println("");
		}
	}
}
