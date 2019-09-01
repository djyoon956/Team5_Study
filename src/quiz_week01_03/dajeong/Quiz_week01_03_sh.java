package quiz_week01_03.dajeong;
import java.util.Scanner;


public class Quiz_week01_03_sh {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println(" 야 숫자 넣어봐 문자는 넣지마 큰 일 나니깐");
        System.out.println(" 입력 1: ");
        numbers[0] = sc.nextInt();
        System.out.println(" 입력 2: ");
        numbers[1] = sc.nextInt();
        System.out.println(" 입력 3: ");
        numbers[2] = sc.nextInt();
        System.out.println(" 입력 4: ");
        numbers[3] = sc.nextInt();
        System.out.println(" 입력 5: ");
        numbers[4] = sc.nextInt();

        int tmp = 0;
        for (int i = 0 ; i < numbers.length-1 ; i++) {
            for (int j = 0; j < numbers.length-1;j++) {
                if (numbers[j] > numbers[j + 1]) {
                    tmp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
            System.out.print(i+1 + "번 째 정렬입니다. :" );
            for(int k = 0 ; k < numbers.length; k++){
                System.out.print("  [" + numbers[k] + "]" + " ");
            }
            System.out.println();
        }


    }
}
