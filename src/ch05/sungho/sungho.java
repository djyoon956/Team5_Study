package ch05.sungho;

public class sungho {
    public static void main(String[] args){
        //        p110 : 05_01  : ?��?�� 코드?��?��?�� ?�� 개의 if문을 ?��?��?���? ?��?��. ?���? ?��?��?�� if문만 ?��?��?��?���? �?경해보자
//        int num =120;
//        if(num > 0 && (num % 2==0)){
//            System.out.println("?��?��?��면서 짝수");
//        }

//        p112 : 05_02 : ?��?�� CondOp.java �? 조건 ?��?��?���? ?��?��?���? ?���? ???��?�� if~else 문을 ?��?��?��?�� ?��?���? ?��?��?��보자
//        int num1 = 50;
//        int num2 = 100;
//        int big;
//        int diff;
//        big = 0;
//
//        if (num1 > num2) {big = num1; diff = num1-num2;}
//        else { big = num2; diff = num2-num1;}
//
//        System.out.println("?�� ?��: " +big);  // ?�� �?분에?��?�� big?? 초기?��?���? ?��?��?���?�?, ?��?��?�� 초기?��까�? ?��?��?���? ?��류�? ?��?��.
//        System.out.println("?��??�?: "+diff);


//        p118 : 05_03_01 : ?��?�� SwitchBreak.java �? switch 문이 ?��?�� if ~else문을 ?��?��?��?�� ?��?���? �?경해보자
//        int n = 3;

//        if ( n == 1) System.out.println("Simple Java");
//        else if (n == 2) System.out.println("Funny Java");
//        else if (n == 3) System.out.println("Fantastic Java");
//        else System.out.println("The best programming language");
//        System.out.println("Do you like java?");


//        p118 : 05_03_02 : ?��?��?�� 코드�? if ~else 문이 ?��?�� switch문을 ?��?��?��?�� ?��?���? �?경해보자


//        int n = 24;
//        if( n >= 0 && n < 10){
//            System.out.println("0?��?�� 10미만?�� ?��");
//        }else if (n >= 10 && n < 20){
//            System.out.println("10?��?�� 20미만?�� ?��");
//        }else if (n >= 20 && n < 30){
//            System.out.println("20?��?�� 30미만?�� ?��");
//        }else {
//            System.out.println("?��?�� ?��?? 30 ?��?��?�� ?��");
//        }


//        p122 : 05_4_1 : 1�??�� 99까�? ?��?�� 구하?�� ?��로그?�� whlie문을 ?��?��?��?�� ?��?��?�� 보자

//        int num = 1;
//        int result = 0;
//        while(num < 100) {
//            result += num; //
//            num++;
//        }
//        System.out.println(result);


//      p122 : 05_4_2 :  1~100까�? 출력?���? ?��?��?�� 거꾸�? 100?��?�� 1까�? 출력?��?�� ?��로그?��?�� ?��?��?��보자 ?�� �?급적 while, do~while문을 ?��번씩 ?��?��?��보자
//        int num = 0;
//        while(num <= 100){
//            System.out.println(num++);
//        }
//        do {
//            System.out.println(--num);
//        } while(num >1);


//      p122 : 05_4_3 : 100?��?�� ?��?��?�� 중에?�� 2?�� 배수?��?�� 7?�� 배수?�� ?���? 출력?���? �? ?��?��?�� ?��?�� 구해?�� 출력?��?�� ?��로그?��?�� while문을 ?��?��?��?�� 만들?��
//        int sum = 0;
//        int num = 0;
//        while(num <= 1000) {
//            if( num % 2 == 0 && num % 7 == 0) {
//                System.out.println("2??7?�� 공배?�� : " + num);
//                sum += num;
//            }
//            num++;
//        }
//        System.out.println("2?? 7?�� 공배?��?��?�� ?��?? : "+ sum + "?��?��?��");


//        p125 05_5_1 1�??�� 10까�??�� 곱의 결과�? 출력?��?�� ?��로그?��?�� for문을 ?��?��?��?�� ?��?��?��?��.
//        int sum = 1;
//        int num = 1;
//        for (num = 1; num<=10; num++){
//            System.out.printf("[%d] * [%d] = [%d]\n", sum, num, sum *= num);
//        }


//    p125 05_05_2  구구?�� �? 5?��?�� 출력?��?�� ?��로그?��?�� for문을 ?��?��?��?�� 만들?��.

//        for (int n1 = 1; n1<10; n1++){
//            System.out.printf("5 * [%d] = [%d] \n" , n1, 5*n1);
//        }


//        p129 05_06_1 ?��?�� ContinueBasic.java ?�� 존재?��?�� while문을 for문으�? �?경해보자

//        while((num++) < 100) {
//            if(((num % 5 ) != 0) || ((num % 7) != 0))         // a && b ?��    반�??��   ~a || ~b ?��?��.
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

      // <참고?���?>  while�? 조건?�� ?��?�� 증감?��?��?��?�� ?��?��
        int num = 0;
        while((++num) < 100) {    // ?��기�?? 보면 ++num?�� 경우?��?�� 먼�? 1?�� ?��?���? 100보다 ?��??�? 비교?��?��.
            System.out.println("num: "+ num);
        }
        while((num++) < 100) {    // ?��기�?? 보면 num++?�� 경우?��?�� 먼�? 100보다 ?��??�? 비교?���? 1�? ?��?��?��.
            System.out.println("num: "+ num);  // 그래?�� ?��?�� ?��?��?��?��?��?�� 차이�? 보면 ?��?�� 1�??�� 찍어?���?�?, 마�?�? ?��?���? 100�? 99�? ?��르다.
        }
*/
//      p129 : 05_06_02 : ?��?��?�� 1�??�� ?��?��?��?�� 모든 ???���? ?��?�� ?��간다. 그리�? �? ?��?�� ?��?�� (몇을 ?��?��?�� ?��) 1000?�� ?��?��?��?���?, 그리�? 1000?�� ?��?��?��
//      값�? ?��마�? ?��?���? 계산?��?�� 출력?��?�� ?��로그?��?�� ?��?��?��보자
/*
        int sum = 0;
        int num = 0;
        int result = 0;
        while (true) {
            if (num % 2 != 0) {
                sum += num;
                result = sum;
                System.out.println(sum + " + " + num + " = " + result ); // ?��?���? + ?��?���? = ?��?���? ?���? ?��문에 sum + num ?��?��?�� ?��?��?��.
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
//                System.out.println(num + " ?��?�� 1000?�� ?��?��?��.");
//                System.out.println("?��계는: " + sum);
//                break;
//            }
//            num++;
//
//        }

        // p135 05_7_1 : 구구?��?�� 짝수 ?��?�� 2, 4, 6 8?���? 출력?��?�� ?��로그?��?�� ?��?��?��?�� 2?��?? 2x2까�?, 4?��?? 4x4까�?, 6?��?? 6x6?��까�? , 8?��??
        // 8x8까�? 출력?��?���? ?��?��?��?��.
//        int num1 = 0;
//        for (int i = 1 ; i < 10; i++){
//            if( i % 2 ==0){
//                for ( num1 = 1; num1 <= i ; num1++){
//                        System.out.printf("[%d] * [%d] = [%d] \n", i, num1, i*num1);
//                }
//            }
//        }
//
//        //?��?�� 코드?�� break�? 조건?��?�� ?��?��?��?�� 만든 짝구구구?��
//        for(int i = 2; i < 10; i += 2) {
//            for(int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//
//                if(j >= i)
//                    break;
//            }
//        }


        // p135 05_7_2 : ?��?��?��?�� 만족?��?�� 모든 A?? B?�� 조합?�� 구하?�� ?��로그?��?�� ?��?��?��?��.
        //    A   B
        // +  B   A
        // ----------
        //    9   9
//        for (int i = 0 ; i < 10 ; i++){
//            for (int j = 0 ; j < 10 ; j++){
//                if( i + j == 9 && (i + j < 10)){     //?��?�� 조건?��?�� ?��리연?��?���? ?��?��?��?�� 조건처리
//                    System.out.println(i + "," + j);
//
//                }
//            }
//        }


//        for(int i = 0; i < 10; i++) {
//            for(int j = 0; j < 10; j++) {
//                if((i * 10 + j) + (j * 10 + i) == 99) //조건?��?�� ?���? ?��?��?��로만 조건 처리
//                    System.out.println(i + ", " + j);
//            }
//        }




    }
}
