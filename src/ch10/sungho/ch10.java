package ch10.sungho;

public class ch10 {
    public static void main(String[] args) {
        // 다음 main 메소드와 함께 동작하는 Accumulator 클래스를 정의하자. 그리고 Accumulatio 클래스에 main 메소드 넣어서 컴파일 및 실행을 하자.

        for (int i = 0; i < 10; i++) {
            ch10.add(i);
        }
        ch10.showResult();

    }

    static int sum;
    static int add(int i){
        sum += i;
        return sum;
    }

    static void showResult(){
        System.out.println(" sum : " + sum);
    }

}