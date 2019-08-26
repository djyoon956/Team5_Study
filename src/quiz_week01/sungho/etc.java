package quiz_week01.sungho;
import java.util.Scanner;

public class etc {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("아무 숫자나 입력해 주세요");
        int input = sc.nextInt();

        for( int i = 1 ; i < 10 ; i++){
            for(int j = input-1 ; j < input + 2; j++){
                System.out.printf("%d *"
                		+ " %d = %d \t", j, i, i*j);
            }
            System.out.println();
        }
    }
}
