package ch05.sungho;

public class sungho {
    public static void main(String[] args){
        //        p110 : 05_01  : ?•„?˜ ì½”ë“œ?—?„œ?Š” ?‘ ê°œì˜ ifë¬¸ì„ ?‚¬?š©?•˜ê³? ?ˆ?‹¤. ?´ë¥? ?•˜?‚˜?˜ ifë¬¸ë§Œ ?‚¬?š©?•˜?„ë¡? ë³?ê²½í•´ë³´ì
//        int num =120;
//        if(num > 0 && (num % 2==0)){
//            System.out.println("?–‘?ˆ˜?´ë©´ì„œ ì§ìˆ˜");
//        }

//        p112 : 05_02 : ?˜ˆ? œ CondOp.java ë¥? ì¡°ê±´ ?—°?‚°?ë¥? ?‚¬?š©?•˜ì§? ?•Šê³? ???‹ ?— if~else ë¬¸ì„ ?‚¬?š©?•˜?Š” ?˜•?ƒœë¡? ?ˆ˜? •?•´ë³´ì
//        int num1 = 50;
//        int num2 = 100;
//        int big;
//        int diff;
//        big = 0;
//
//        if (num1 > num2) {big = num1; diff = num1-num2;}
//        else { big = num2; diff = num2-num1;}
//
//        System.out.println("?° ?ˆ˜: " +big);  // ?´ ë¶?ë¶„ì—?„œ?Š” big?? ì´ˆê¸°?™”?˜ì§? ?•Š?•˜?œ¼ë¯?ë¡?, ?œ„?—?„œ ì´ˆê¸°?™”ê¹Œì? ?•ˆ?–ˆ?œ¼ë©? ?˜¤ë¥˜ê? ?‚œ?‹¤.
//        System.out.println("? ˆ??ê°?: "+diff);


//        p118 : 05_03_01 : ?˜ˆ? œ SwitchBreak.java ë¥? switch ë¬¸ì´ ?•„?‹Œ if ~elseë¬¸ì„ ?´?š©?•˜?Š” ?˜•?ƒœë¡? ë³?ê²½í•´ë³´ì
//        int n = 3;

//        if ( n == 1) System.out.println("Simple Java");
//        else if (n == 2) System.out.println("Funny Java");
//        else if (n == 3) System.out.println("Fantastic Java");
//        else System.out.println("The best programming language");
//        System.out.println("Do you like java?");


//        p118 : 05_03_02 : ?•„?˜?˜ ì½”ë“œë¥? if ~else ë¬¸ì´ ?•„?‹Œ switchë¬¸ì„ ?´?š©?•˜?Š” ?˜•?ƒœë¡? ë³?ê²½í•´ë³´ì


//        int n = 24;
//        if( n >= 0 && n < 10){
//            System.out.println("0?´?ƒ 10ë¯¸ë§Œ?˜ ?ˆ˜");
//        }else if (n >= 10 && n < 20){
//            System.out.println("10?´?ƒ 20ë¯¸ë§Œ?˜ ?ˆ˜");
//        }else if (n >= 20 && n < 30){
//            System.out.println("20?´?ƒ 30ë¯¸ë§Œ?˜ ?ˆ˜");
//        }else {
//            System.out.println("?Œ?ˆ˜ ?˜¹?? 30 ?´?ƒ?˜ ?ˆ˜");
//        }


//        p122 : 05_4_1 : 1ë¶??„° 99ê¹Œì? ?•©?„ êµ¬í•˜?Š” ?”„ë¡œê·¸?¨ whlieë¬¸ì„ ?´?š©?•´?„œ ?‘?„±?•´ ë³´ì

//        int num = 1;
//        int result = 0;
//        while(num < 100) {
//            result += num; //
//            num++;
//        }
//        System.out.println(result);


//      p122 : 05_4_2 :  1~100ê¹Œì? ì¶œë ¥?•˜ê³? ?´?–´?„œ ê±°ê¾¸ë¡? 100?—?„œ 1ê¹Œì? ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•´ë³´ì ?‹¨ ê°?ê¸‰ì  while, do~whileë¬¸ì„ ?•œë²ˆì”© ?‚¬?š©?•´ë³´ì
//        int num = 0;
//        while(num <= 100){
//            System.out.println(num++);
//        }
//        do {
//            System.out.println(--num);
//        } while(num >1);


//      p122 : 05_4_3 : 100?´?•˜ ??—°?ˆ˜ ì¤‘ì—?„œ 2?˜ ë°°ìˆ˜?´? 7?˜ ë°°ìˆ˜?¸ ?ˆ˜ë¥? ì¶œë ¥?•˜ê³? ê·? ?ˆ˜?“¤?˜ ?•©?„ êµ¬í•´?„œ ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ whileë¬¸ì„ ?´?š©?•´?„œ ë§Œë“¤?¼
//        int sum = 0;
//        int num = 0;
//        while(num <= 1000) {
//            if( num % 2 == 0 && num % 7 == 0) {
//                System.out.println("2??7?˜ ê³µë°°?ˆ˜ : " + num);
//                sum += num;
//            }
//            num++;
//        }
//        System.out.println("2?? 7?˜ ê³µë°°?ˆ˜?“¤?˜ ?•©?? : "+ sum + "?…?‹ˆ?‹¤");


//        p125 05_5_1 1ë¶??„° 10ê¹Œì??˜ ê³±ì˜ ê²°ê³¼ë¥? ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ forë¬¸ì„ ?´?š©?•´?„œ ?‘?„±?•œ?‹¤.
//        int sum = 1;
//        int num = 1;
//        for (num = 1; num<=10; num++){
//            System.out.printf("[%d] * [%d] = [%d]\n", sum, num, sum *= num);
//        }


//    p125 05_05_2  êµ¬êµ¬?‹¨ ì¤? 5?‹¨?„ ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ forë¬¸ì„ ?´?š©?•´?„œ ë§Œë“¤?.

//        for (int n1 = 1; n1<10; n1++){
//            System.out.printf("5 * [%d] = [%d] \n" , n1, 5*n1);
//        }


//        p129 05_06_1 ?˜ˆ? œ ContinueBasic.java ?— ì¡´ì¬?•˜?Š” whileë¬¸ì„ forë¬¸ìœ¼ë¡? ë³?ê²½í•´ë³´ì

//        while((num++) < 100) {
//            if(((num % 5 ) != 0) || ((num % 7) != 0))         // a && b ?˜    ë°˜ë??Š”   ~a || ~b ?´?‹¤.
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

      // <ì°¸ê³ ?ë£?>  whileë¬? ì¡°ê±´?‹ ?•ˆ?— ì¦ê°?—°?‚°??˜ ?—­?• 
        int num = 0;
        while((++num) < 100) {    // ?—¬ê¸°ë?? ë³´ë©´ ++num?¼ ê²½ìš°?—?Š” ë¨¼ì? 1?„ ?”?•˜ê³? 100ë³´ë‹¤ ?‘??ì§? ë¹„êµ?•œ?‹¤.
            System.out.println("num: "+ num);
        }
        while((num++) < 100) {    // ?—¬ê¸°ë?? ë³´ë©´ num++?¼ ê²½ìš°?—?Š” ë¨¼ì? 100ë³´ë‹¤ ?‘??ì§? ë¹„êµ?•˜ê³? 1ë¥? ?”?•œ?‹¤.
            System.out.println("num: "+ num);  // ê·¸ë˜?„œ ?‘˜?˜ ?‹¤?–‰?˜?—ˆ?„?•Œ ì°¨ì´ë¥? ë³´ë©´ ?‘˜?‹¤ 1ë¶??„° ì°ì–´?‚´ì§?ë§?, ë§ˆì?ë§? ?ˆ«?ë¥? 100ê³? 99ë¡? ?‹¤ë¥´ë‹¤.
        }
*/
//      p129 : 05_06_02 : ??—°?ˆ˜ 1ë¶??„° ?‹œ?‘?•´?„œ ëª¨ë“  ???ˆ˜ë¥? ?”?•´ ?‚˜ê°„ë‹¤. ê·¸ë¦¬ê³? ê·? ?•©?´ ?–¸? œ (ëª‡ì„ ?”?–ˆ?„ ?•Œ) 1000?„ ?„˜?–´?„œ?Š”ì§?, ê·¸ë¦¬ê³? 1000?„ ?„˜?–´?„ 
//      ê°’ì? ?–¼ë§ˆê? ?˜?Š”ì§? ê³„ì‚°?•˜?—¬ ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?­?„ ?‘?„±?•´ë³´ì
/*
        int sum = 0;
        int num = 0;
        int result = 0;
        while (true) {
            if (num % 2 != 0) {
                sum += num;
                result = sum;
                System.out.println(sum + " + " + num + " = " + result ); // ?Š¤?Š¸ë§? + ?Š¤?Š¸ë§? = ?Š¤?Š¸ë§? ?´ê¸? ?•Œë¬¸ì— sum + num ?—°?‚°?´ ?•ˆ?œ?‹¤.
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
//                System.out.println(num + " ?—?„œ 1000?´ ?„˜?Š”?‹¤.");
//                System.out.println("?•©ê³„ëŠ”: " + sum);
//                break;
//            }
//            num++;
//
//        }

        // p135 05_7_1 : êµ¬êµ¬?‹¨?˜ ì§ìˆ˜ ?‹¨?´ 2, 4, 6 8?‹¨ë§? ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?˜ 2?‹¨?? 2x2ê¹Œì?, 4?‹¨?? 4x4ê¹Œì?, 6?‹¨?? 6x6?‹¨ê¹Œì? , 8?‹¨??
        // 8x8ê¹Œì? ì¶œë ¥?•˜?„ë¡? ?‘?„±?•˜?.
//        int num1 = 0;
//        for (int i = 1 ; i < 10; i++){
//            if( i % 2 ==0){
//                for ( num1 = 1; num1 <= i ; num1++){
//                        System.out.printf("[%d] * [%d] = [%d] \n", i, num1, i*num1);
//                }
//            }
//        }
//
//        //?œ„?˜ ì½”ë“œ?— breakê³? ì¡°ê±´?‹?„ ?ˆ˜? •?•˜?—¬ ë§Œë“  ì§êµ¬êµ¬êµ¬?‹¨
//        for(int i = 2; i < 10; i += 2) {
//            for(int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//
//                if(j >= i)
//                    break;
//            }
//        }


        // p135 05_7_2 : ?‹¤?Œ?‹?„ ë§Œì¡±?•˜?Š” ëª¨ë“  A?? B?˜ ì¡°í•©?„ êµ¬í•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?.
        //    A   B
        // +  B   A
        // ----------
        //    9   9
//        for (int i = 0 ; i < 10 ; i++){
//            for (int j = 0 ; j < 10 ; j++){
//                if( i + j == 9 && (i + j < 10)){     //?‚˜?Š” ì¡°ê±´?‹?— ?…¼ë¦¬ì—°?‚°?ë¥? ?´?š©?•˜?—¬ ì¡°ê±´ì²˜ë¦¬
//                    System.out.println(i + "," + j);
//
//                }
//            }
//        }


//        for(int i = 0; i < 10; i++) {
//            for(int j = 0; j < 10; j++) {
//                if((i * 10 + j) + (j * 10 + i) == 99) //ì¡°ê±´?‹?— ?˜¤ì§? ?ˆ˜?‹?œ¼ë¡œë§Œ ì¡°ê±´ ì²˜ë¦¬
//                    System.out.println(i + ", " + j);
//            }
//        }




    }
}
