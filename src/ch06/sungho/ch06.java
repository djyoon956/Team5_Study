package ch06.sungho;
public class ch06 {
    public static void main(String[] args){
        //문제  06_1 정수 둘을 인자로 전달받아서 두 수의 사칙연산 결과를 출력하는 메소드와 이 메소드를 호출하는 main메소드를 정의해보자.
        //단 나눗셈은 나머지를 각각 출력해야한다.
//        Simple a = new Simple();
//        a.simpleCal(4,5);
//
//
//    }
//
//
//class Simple{
//    void simpleCal(int a, int b){
//        System.out.println(a + "+" + b + "=" + (a + b));
//        System.out.println(a + "x" + b + "=" + (a * b));
//        System.out.println(a + "/" + b + "=" + (a / b));
//        System.out.println(a + "-" + b + "=" + (a - b));
//    }



            //06_2 정수 둘을 인자로 전달받아서 , 두 수의 "차의 절대값"을 계산하여 출력하는 메소드와 이 메소드를 호출하는 main 메소드를 정의해보자.
            //단 메소드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되고 출력되어야 한다.


//            class absolute{
//
//                private int ab(int a, int b){
//                    int ab = a > b ? a-b : b-a;
//                    return ab;
//                }
//
//
//
//            }
//
//            absolute a = new absolute();
//            System.out.println(a.ab(4,6));

            //문제 06_2 인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드와 원의 둘레를 계산해서 변환하는 메소드를 각각 정의하고,
            //이 둘을 호출하는 main 메소드를 정의하자

//            class circle{
//
//                double dimension;
//                double l;
//                private double circleD(int r){
//                    dimension = Math.PI * r * r;
//                    return dimension;
//                }
//
//                private double circleL(int r){
//                    l = Math.PI * 2 * r;
//                    return l;
//                }
//
//            }
//
//            circle c = new circle();
//            System.out.println(c.circleD(30));
//            System.out.println(c.circleL(30));
//

            //06_1_2 1~100까지 모든 소수를
            // 전달 받은 값이 소수인지 아닌지를 판단하여 소수인 경우 투르 아닌 경우 펄스를 반환하는 메소드를 만들고 이를 이용하여 1~100까지의 소수를 출력하자
//            class prime {
//                int i;
//                int check = 0;
//
//                prime(int i) {
//                    if(i>100){
//                        System.out.println();
//                    }
//                    this.i = i;
//                    int n = 1;
//                    while (n <= 100) {
//                        n++;
//                        if( n > i)
//                            break;
//                        if (i % n == 0)
//                            check++;
//                    }
//                    if (check > 1) {
//                        System.out.println("소수가 아닙니다");
//                        System.out.println("현재의 check 값: " + check);
//                    } else if (check == 1) {
//                        System.out.println("소수가 맞습니다!");
//                        System.out.println("현재의 check 값: " + check);
//                    } else {
//                        System.out.println("이런 이런 100보다 큰 수를 입렬 하셨군요");
//                        System.out.println("현재의 check 값: " + check);
//                    }
//
//                }
//
//            }
//
//
//            prime p = new prime(121);
//

//            100을 넘는 i 를 입력하면 n이 100까지 밖에 안올라가서 100 이상의 자기자신으로 나눌수가 없다.
//            따라서 i 가 100이 넘으면 그걸 처리 할 장치가 필요하다.

            //p154 문제 06_3
            //인자로 정수 n을 전달받아서 2의 n승을 계산하여 반환하는 메소드를 재귀의 형태로 정의하고, 이를 호출하는 main메소드를 정의하자
            //재귀 함수 정의? 알아볼것
//           class self {
//                int f(int n) {
//                    if( n == 1){
//                        return 2;
//                    }else
//                        return  2 * f( n- 1);
//                }
//            }
//
//            self s = new self();
//            System.out.println(s.f(6));

            //06_3 인자로 십진수 정수를 전달 받아서 이에 해당하는 이진수 표현을 출력하는 메소드를 재귀형태로 정의하고 이를 호출하는 main 메소드를 정의해보자
//            void bin(int num){
//                return bin(num-1);      //이거 모르겠음 어케 풀어야 하는지
//                return num/2
//            }

        }
}
