package ch05.sungho;

public class sungho {
    public static void main(String[] args){
        //        p110 : 05_01  : ?? μ½λ??? ? κ°μ ifλ¬Έμ ?¬?©?κ³? ??€. ?΄λ₯? ??? ifλ¬Έλ§ ?¬?©??λ‘? λ³?κ²½ν΄λ³΄μ
//        int num =120;
//        if(num > 0 && (num % 2==0)){
//            System.out.println("???΄λ©΄μ μ§μ");
//        }

//        p112 : 05_02 : ??  CondOp.java λ₯? μ‘°κ±΄ ?°?°?λ₯? ?¬?©?μ§? ?κ³? ??? ? if~else λ¬Έμ ?¬?©?? ??λ‘? ?? ?΄λ³΄μ
//        int num1 = 50;
//        int num2 = 100;
//        int big;
//        int diff;
//        big = 0;
//
//        if (num1 > num2) {big = num1; diff = num1-num2;}
//        else { big = num2; diff = num2-num1;}
//
//        System.out.println("?° ?: " +big);  // ?΄ λΆ?λΆμ?? big?? μ΄κΈ°??μ§? ???Όλ―?λ‘?, ??? μ΄κΈ°?κΉμ? ???Όλ©? ?€λ₯κ? ??€.
//        System.out.println("? ??κ°?: "+diff);


//        p118 : 05_03_01 : ??  SwitchBreak.java λ₯? switch λ¬Έμ΄ ?? if ~elseλ¬Έμ ?΄?©?? ??λ‘? λ³?κ²½ν΄λ³΄μ
//        int n = 3;

//        if ( n == 1) System.out.println("Simple Java");
//        else if (n == 2) System.out.println("Funny Java");
//        else if (n == 3) System.out.println("Fantastic Java");
//        else System.out.println("The best programming language");
//        System.out.println("Do you like java?");


//        p118 : 05_03_02 : ??? μ½λλ₯? if ~else λ¬Έμ΄ ?? switchλ¬Έμ ?΄?©?? ??λ‘? λ³?κ²½ν΄λ³΄μ


//        int n = 24;
//        if( n >= 0 && n < 10){
//            System.out.println("0?΄? 10λ―Έλ§? ?");
//        }else if (n >= 10 && n < 20){
//            System.out.println("10?΄? 20λ―Έλ§? ?");
//        }else if (n >= 20 && n < 30){
//            System.out.println("20?΄? 30λ―Έλ§? ?");
//        }else {
//            System.out.println("?? ?Ή?? 30 ?΄?? ?");
//        }


//        p122 : 05_4_1 : 1λΆ??° 99κΉμ? ?©? κ΅¬ν? ?λ‘κ·Έ?¨ whlieλ¬Έμ ?΄?©?΄? ??±?΄ λ³΄μ

//        int num = 1;
//        int result = 0;
//        while(num < 100) {
//            result += num; //
//            num++;
//        }
//        System.out.println(result);


//      p122 : 05_4_2 :  1~100κΉμ? μΆλ ₯?κ³? ?΄?΄? κ±°κΎΈλ‘? 100?? 1κΉμ? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±?΄λ³΄μ ?¨ κ°?κΈμ  while, do~whileλ¬Έμ ?λ²μ© ?¬?©?΄λ³΄μ
//        int num = 0;
//        while(num <= 100){
//            System.out.println(num++);
//        }
//        do {
//            System.out.println(--num);
//        } while(num >1);


//      p122 : 05_4_3 : 100?΄? ??°? μ€μ? 2? λ°°μ?΄? 7? λ°°μ?Έ ?λ₯? μΆλ ₯?κ³? κ·? ??€? ?©? κ΅¬ν΄? μΆλ ₯?? ?λ‘κ·Έ?¨? whileλ¬Έμ ?΄?©?΄? λ§λ€?Ό
//        int sum = 0;
//        int num = 0;
//        while(num <= 1000) {
//            if( num % 2 == 0 && num % 7 == 0) {
//                System.out.println("2??7? κ³΅λ°°? : " + num);
//                sum += num;
//            }
//            num++;
//        }
//        System.out.println("2?? 7? κ³΅λ°°??€? ?©?? : "+ sum + "???€");


//        p125 05_5_1 1λΆ??° 10κΉμ?? κ³±μ κ²°κ³Όλ₯? μΆλ ₯?? ?λ‘κ·Έ?¨? forλ¬Έμ ?΄?©?΄? ??±??€.
//        int sum = 1;
//        int num = 1;
//        for (num = 1; num<=10; num++){
//            System.out.printf("[%d] * [%d] = [%d]\n", sum, num, sum *= num);
//        }


//    p125 05_05_2  κ΅¬κ΅¬?¨ μ€? 5?¨? μΆλ ₯?? ?λ‘κ·Έ?¨? forλ¬Έμ ?΄?©?΄? λ§λ€?.

//        for (int n1 = 1; n1<10; n1++){
//            System.out.printf("5 * [%d] = [%d] \n" , n1, 5*n1);
//        }


//        p129 05_06_1 ??  ContinueBasic.java ? μ‘΄μ¬?? whileλ¬Έμ forλ¬ΈμΌλ‘? λ³?κ²½ν΄λ³΄μ

//        while((num++) < 100) {
//            if(((num % 5 ) != 0) || ((num % 7) != 0))         // a && b ?    λ°λ??   ~a || ~b ?΄?€.
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

      // <μ°Έκ³ ?λ£?>  whileλ¬? μ‘°κ±΄? ?? μ¦κ°?°?°?? ?­? 
        int num = 0;
        while((++num) < 100) {    // ?¬κΈ°λ?? λ³΄λ©΄ ++num?Ό κ²½μ°?? λ¨Όμ? 1? ??κ³? 100λ³΄λ€ ???μ§? λΉκ΅??€.
            System.out.println("num: "+ num);
        }
        while((num++) < 100) {    // ?¬κΈ°λ?? λ³΄λ©΄ num++?Ό κ²½μ°?? λ¨Όμ? 100λ³΄λ€ ???μ§? λΉκ΅?κ³? 1λ₯? ???€.
            System.out.println("num: "+ num);  // κ·Έλ? ?? ?€????? μ°¨μ΄λ₯? λ³΄λ©΄ ??€ 1λΆ??° μ°μ΄?΄μ§?λ§?, λ§μ?λ§? ?«?λ₯? 100κ³? 99λ‘? ?€λ₯΄λ€.
        }
*/
//      p129 : 05_06_02 : ??°? 1λΆ??° ???΄? λͺ¨λ  ???λ₯? ??΄ ?κ°λ€. κ·Έλ¦¬κ³? κ·? ?©?΄ ?Έ?  (λͺμ ??? ?) 1000? ??΄??μ§?, κ·Έλ¦¬κ³? 1000? ??΄? 
//      κ°μ? ?Όλ§κ? ??μ§? κ³μ°??¬ μΆλ ₯?? ?λ‘κ·Έ?­? ??±?΄λ³΄μ
/*
        int sum = 0;
        int num = 0;
        int result = 0;
        while (true) {
            if (num % 2 != 0) {
                sum += num;
                result = sum;
                System.out.println(sum + " + " + num + " = " + result ); // ?€?Έλ§? + ?€?Έλ§? = ?€?Έλ§? ?΄κΈ? ?λ¬Έμ sum + num ?°?°?΄ ???€.
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
//                System.out.println(num + " ?? 1000?΄ ???€.");
//                System.out.println("?©κ³λ: " + sum);
//                break;
//            }
//            num++;
//
//        }

        // p135 05_7_1 : κ΅¬κ΅¬?¨? μ§μ ?¨?΄ 2, 4, 6 8?¨λ§? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±?? 2?¨?? 2x2κΉμ?, 4?¨?? 4x4κΉμ?, 6?¨?? 6x6?¨κΉμ? , 8?¨??
        // 8x8κΉμ? μΆλ ₯??λ‘? ??±??.
//        int num1 = 0;
//        for (int i = 1 ; i < 10; i++){
//            if( i % 2 ==0){
//                for ( num1 = 1; num1 <= i ; num1++){
//                        System.out.printf("[%d] * [%d] = [%d] \n", i, num1, i*num1);
//                }
//            }
//        }
//
//        //?? μ½λ? breakκ³? μ‘°κ±΄?? ?? ??¬ λ§λ  μ§κ΅¬κ΅¬κ΅¬?¨
//        for(int i = 2; i < 10; i += 2) {
//            for(int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//
//                if(j >= i)
//                    break;
//            }
//        }


        // p135 05_7_2 : ?€??? λ§μ‘±?? λͺ¨λ  A?? B? μ‘°ν©? κ΅¬ν? ?λ‘κ·Έ?¨? ??±??.
        //    A   B
        // +  B   A
        // ----------
        //    9   9
//        for (int i = 0 ; i < 10 ; i++){
//            for (int j = 0 ; j < 10 ; j++){
//                if( i + j == 9 && (i + j < 10)){     //?? μ‘°κ±΄?? ?Όλ¦¬μ°?°?λ₯? ?΄?©??¬ μ‘°κ±΄μ²λ¦¬
//                    System.out.println(i + "," + j);
//
//                }
//            }
//        }


//        for(int i = 0; i < 10; i++) {
//            for(int j = 0; j < 10; j++) {
//                if((i * 10 + j) + (j * 10 + i) == 99) //μ‘°κ±΄?? ?€μ§? ???Όλ‘λ§ μ‘°κ±΄ μ²λ¦¬
//                    System.out.println(i + ", " + j);
//            }
//        }




    }
}
