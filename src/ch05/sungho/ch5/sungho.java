package ch05.sungho.ch5;

public class sungho {
    public static void main(String[] args){
        //        p110 : 05_01  : 아래 코드에서는 두 개의 if문을 사용하고 있다. 이를 하나의 if문만 사용하도록 변경해보자
//        int num =120;
//        if(num > 0 && (num % 2==0)){
//            System.out.println("양수이면서 짝수");
//        }

//        p112 : 05_02 : 예제 CondOp.java 를 조건 연산자를 사용하지 않고 대신에 if~else 문을 사용하는 형태로 수정해보자
//        int num1 = 50;
//        int num2 = 100;
//        int big;
//        int diff;
//        big = 0;
//
//        if (num1 > num2) {big = num1; diff = num1-num2;}
//        else { big = num2; diff = num2-num1;}
//
//        System.out.println("큰 수: " +big);  // 이 부분에서는 big은 초기화되지 않았으므로, 위에서 초기화까지 안했으면 오류가 난다.
//        System.out.println("절대값: "+diff);


//        p118 : 05_03_01 : 예제 SwitchBreak.java 를 switch 문이 아닌 if ~else문을 이용하는 형태로 변경해보자
//        int n = 3;

//        if ( n == 1) System.out.println("Simple Java");
//        else if (n == 2) System.out.println("Funny Java");
//        else if (n == 3) System.out.println("Fantastic Java");
//        else System.out.println("The best programming language");
//        System.out.println("Do you like java?");


//        p118 : 05_03_02 : 아래의 코드를 if ~else 문이 아닌 switch문을 이용하는 형태로 변경해보자


//        int n = 24;
//        if( n >= 0 && n < 10){
//            System.out.println("0이상 10미만의 수");
//        }else if (n >= 10 && n < 20){
//            System.out.println("10이상 20미만의 수");
//        }else if (n >= 20 && n < 30){
//            System.out.println("20이상 30미만의 수");
//        }else {
//            System.out.println("음수 혹은 30 이상의 수");
//        }


//        p122 : 05_4_1 : 1부터 99까지 합을 구하는 프로그램 whlie문을 이용해서 작성해 보자

//        int num = 1;
//        int result = 0;
//        while(num < 100) {
//            result += num; //
//            num++;
//        }
//        System.out.println(result);


//      p122 : 05_4_2 :  1~100까지 출력하고 이어서 거꾸로 100에서 1까지 출력하는 프로그램을 작성해보자 단 가급적 while, do~while문을 한번씩 사용해보자
//        int num = 0;
//        while(num <= 100){
//            System.out.println(num++);
//        }
//        do {
//            System.out.println(--num);
//        } while(num >1);


//      p122 : 05_4_3 : 100이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고 그 수들의 합을 구해서 출력하는 프로그램을 while문을 이용해서 만들라
//        int sum = 0;
//        int num = 0;
//        while(num <= 1000) {
//            if( num % 2 == 0 && num % 7 == 0) {
//                System.out.println("2와7의 공배수 : " + num);
//                sum += num;
//            }
//            num++;
//        }
//        System.out.println("2와 7의 공배수들의 합은 : "+ sum + "입니다");


//        p125 05_5_1 1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성한다.
//        int sum = 1;
//        int num = 1;
//        for (num = 1; num<=10; num++){
//            System.out.printf("[%d] * [%d] = [%d]\n", sum, num, sum *= num);
//        }


//    p125 05_05_2  구구단 중 5단을 출력하는 프로그램을 for문을 이용해서 만들자.

//        for (int n1 = 1; n1<10; n1++){
//            System.out.printf("5 * [%d] = [%d] \n" , n1, 5*n1);
//        }


//        p129 05_06_1 예제 ContinueBasic.java 에 존재하는 while문을 for문으로 변경해보자

//        while((num++) < 100) {
//            if(((num % 5 ) != 0) || ((num % 7) != 0))         // a && b 의    반대는   ~a || ~b 이다.
//                continue;
//            count++;
//            System.out.println(num);
//        }
//        System.out.println("count: " + count);
/*
       int count = 0;
        for (int i = 0 ; i < 100 ; i++){
            if((i % 5 == 0) && (i % 7 == 0)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("count : "+ count);

        int count1 = 0;
        int num1 = 0;
        for (num1 = 0; num1 < 100 ; num1++){
            if((num1 % 5 != 0) || (num1 % 7 != 0 )){
                continue;
            }
            count1++;
            System.out.println(num1);
        }
        System.out.println("count: " + count1);

      // <참고자료>  while문 조건식 안에 증감연산자의 역할
        int num = 0;
        while((++num) < 100) {    // 여기를 보면 ++num일 경우에는 먼저 1을 더하고 100보다 작은지 비교한다.
            System.out.println("num: "+ num);
        }
        while((num++) < 100) {    // 여기를 보면 num++일 경우에는 먼저 100보다 작은지 비교하고 1를 더한다.
            System.out.println("num: "+ num);  // 그래서 둘의 실행되었을때 차이를 보면 둘다 1부터 찍어내지만, 마지막 숫자를 100과 99로 다르다.
        }
*/
//      p129 : 05_06_02 : 자연수 1부터 시작해서 모든 홀수를 더해 나간다. 그리고 그 합이 언제 (몇을 더했을 때) 1000을 넘어서는지, 그리고 1000을 넘어선
//      값은 얼마가 되는지 계산하여 출력하는 프로그랭을 작성해보자
/*
        int sum = 0;
        int num = 0;
        int result = 0;
        while (true) {
            if (num % 2 != 0) {
                sum += num;
                result = sum;
                System.out.println(sum + " + " + num + " = " + result ); // 스트링 + 스트링 = 스트링 이기 때문에 sum + num 연산이 안된다.
            }
            if (sum > 1000)
                break;
            num++;
        }

        System.out.println("over1000 when this num : "+num);
        System.out.println("over1000 then sum : "+sum);

*/

//        int sum = 0;
//        int num = 1;
//        while(true) {
//            if(num % 2 != 0)
//                System.out.printf("[%d] + [%d] = [%d] \n", sum, num, sum += num);
//
//            if(sum > 1000) {
//                System.out.println(num + " 에서 1000이 넘는다.");
//                System.out.println("합계는: " + sum);
//                break;
//            }
//            num++;
//
//        }

        // p135 05_7_1 : 구구단의 짝수 단이 2, 4, 6 8단만 출력하는 프로그램을 작성하되 2단은 2x2까지, 4단은 4x4까지, 6단은 6x6단까지 , 8단은
        // 8x8까지 출력하도록 작성하자.
//        int num1 = 0;
//        for (int i = 1 ; i < 10; i++){
//            if( i % 2 ==0){
//                for ( num1 = 1; num1 <= i ; num1++){
//                        System.out.printf("[%d] * [%d] = [%d] \n", i, num1, i*num1);
//                }
//            }
//        }
//
//        //위의 코드에 break과 조건식을 수정하여 만든 짝구구구단
//        for(int i = 2; i < 10; i += 2) {
//            for(int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//
//                if(j >= i)
//                    break;
//            }
//        }


        // p135 05_7_2 : 다음식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하자.
        //    A   B
        // +  B   A
        // ----------
        //    9   9
//        for (int i = 0 ; i < 10 ; i++){
//            for (int j = 0 ; j < 10 ; j++){
//                if( i + j == 9 && (i + j < 10)){     //나는 조건식에 논리연산자를 이용하여 조건처리
//                    System.out.println(i + "," + j);
//
//                }
//            }
//        }


//        for(int i = 0; i < 10; i++) {
//            for(int j = 0; j < 10; j++) {
//                if((i * 10 + j) + (j * 10 + i) == 99) //조건식에 오직 수식으로만 조건 처리
//                    System.out.println(i + ", " + j);
//            }
//        }




    }
}
