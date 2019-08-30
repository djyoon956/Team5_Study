package quiz_week01_02.sungho;


import java.util.Scanner;
public class ababab {

        public static void main(String[] args){


            while(true) {
                System.out.println(" \"짝수\" 나 \"홀수\" 만 입력해주세요 : ");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();

                switch(input) {
                    case "짝수":
                        for (int i = 2; i < 10; i++) {
                            if (i % 2 != 0)
                                continue;
                            for (int j = 1; j < 10; j++) {
                                if (j % 2 != 0)
                                    continue;
                                System.out.printf("%d x %d = %d \n", i, j, i * j);
                            }
                            System.out.println();
                        }
                        break;
                    case "홀수":
                        for (int i = 2; i < 10; i++) {
                            if(i%2==0)
                                continue;
                            for (int j = 1; j < 10; j++) {
                                if(i%2==0)
                                    continue;
                                System.out.printf("%d x %d = %d \n", i, j, i*j);
                            }
                            System.out.println();
                        }
                        break;
                    default:
                        System.out.println(" \"짝수\" 나 \"홀수\"만 입력 해 주세요; 숫자도 안됩니다.;;");
                        break;
                }

            }

        }
    }


//1. scanner로 "홀수"(String) 또는 "짝수"(String)를 입력받아 홀수면 구구단 홀수단을, 짝수면 짝수단 구구단을(switch문) 출력(for문)해주세요
//        홀수 또는 짝수를 입력하지 않으면 "홀수 또는 짝수가 아닙니다." 출력


