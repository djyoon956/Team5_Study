 /* package ch09.sungho;




public class Main {

    public static void main(String[] args) {

//        p110 : 05_01  : �븘�옒 肄붾뱶�뿉�꽌�뒗 �몢 媛쒖쓽 if臾몄쓣 �궗�슜�븯怨� �엳�떎. �씠瑜� �븯�굹�쓽 if臾몃쭔 �궗�슜�븯�룄濡� 蹂�寃쏀빐蹂댁옄
//        int num =120;
//        if(num > 0 && (num % 2==0)){
//            System.out.println("�뼇�닔�씠硫댁꽌 吏앹닔");
//        }

//        p112 : 05_02 : �삁�젣 CondOp.java 瑜� 議곌굔 �뿰�궛�옄瑜� �궗�슜�븯吏� �븡怨� ���떊�뿉 if~else 臾몄쓣 �궗�슜�븯�뒗 �삎�깭濡� �닔�젙�빐蹂댁옄
//        int num1 = 50;
//        int num2 = 100;
//        int big;
//        int diff;
//        big = 0;
//
//        if (num1 > num2) {big = num1; diff = num1-num2;}
//        else { big = num2; diff = num2-num1;}
//
//        System.out.println("�겙 �닔: " +big);  // �씠 遺�遺꾩뿉�꽌�뒗 big�� 珥덇린�솕�릺吏� �븡�븯�쑝誘�濡�, �쐞�뿉�꽌 珥덇린�솕源뚯� �븞�뻽�쑝硫� �삤瑜섍� �궃�떎.
//        System.out.println("�젅��媛�: "+diff);


//        p118 : 05_03_01 : �삁�젣 SwitchBreak.java 瑜� switch 臾몄씠 �븘�땶 if ~else臾몄쓣 �씠�슜�븯�뒗 �삎�깭濡� 蹂�寃쏀빐蹂댁옄
//        int n = 3;

//        if ( n == 1) System.out.println("Simple Java");
//        else if (n == 2) System.out.println("Funny Java");
//        else if (n == 3) System.out.println("Fantastic Java");
//        else System.out.println("The best programming language");
//        System.out.println("Do you like java?");


//        p118 : 05_03_02 : �븘�옒�쓽 肄붾뱶瑜� if ~else 臾몄씠 �븘�땶 switch臾몄쓣 �씠�슜�븯�뒗 �삎�깭濡� 蹂�寃쏀빐蹂댁옄


//        int n = 24;
//        if( n >= 0 && n < 10){
//            System.out.println("0�씠�긽 10誘몃쭔�쓽 �닔");
//        }else if (n >= 10 && n < 20){
//            System.out.println("10�씠�긽 20誘몃쭔�쓽 �닔");
//        }else if (n >= 20 && n < 30){
//            System.out.println("20�씠�긽 30誘몃쭔�쓽 �닔");
//        }else {
//            System.out.println("�쓬�닔 �샊�� 30 �씠�긽�쓽 �닔");
//        }


//        p122 : 05_4_1 : 1遺��꽣 99源뚯� �빀�쓣 援ы븯�뒗 �봽濡쒓렇�옩 whlie臾몄쓣 �씠�슜�빐�꽌 �옉�꽦�빐 蹂댁옄

//        int num = 1;
//        int result = 0;
//        while(num < 100) {
//            result += num; //
//            num++;
//        }
//        System.out.println(result);


//      p122 : 05_4_2 :  1~100源뚯� 異쒕젰�븯怨� �씠�뼱�꽌 嫄곌씀濡� 100�뿉�꽌 1源뚯� 異쒕젰�븯�뒗 �봽濡쒓렇�옩�쓣 �옉�꽦�빐蹂댁옄 �떒 媛�湲됱쟻 while, do~while臾몄쓣 �븳踰덉뵫 �궗�슜�빐蹂댁옄
//        int num = 0;
//        while(num <= 100){
//            System.out.println(num++);
//        }
//        do {
//            System.out.println(--num);
//        } while(num >1);


//      p122 : 05_4_3 : 100�씠�븯 �옄�뿰�닔 以묒뿉�꽌 2�쓽 諛곗닔�씠�옄 7�쓽 諛곗닔�씤 �닔瑜� 異쒕젰�븯怨� 洹� �닔�뱾�쓽 �빀�쓣 援ы빐�꽌 異쒕젰�븯�뒗 �봽濡쒓렇�옩�쓣 while臾몄쓣 �씠�슜�빐�꽌 留뚮뱾�씪
//        int sum = 0;
//        int num = 0;
//        while(num <= 1000) {
//            if( num % 2 == 0 && num % 7 == 0) {
//                System.out.println("2��7�쓽 怨듬같�닔 : " + num);
//                sum += num;
//            }
//            num++;
//        }
//        System.out.println("2�� 7�쓽 怨듬같�닔�뱾�쓽 �빀�� : "+ sum + "�엯�땲�떎");


//        p125 05_5_1 1遺��꽣 10源뚯��쓽 怨깆쓽 寃곌낵瑜� 異쒕젰�븯�뒗 �봽濡쒓렇�옩�쓣 for臾몄쓣 �씠�슜�빐�꽌 �옉�꽦�븳�떎.
//        int sum = 1;
//        int num = 1;
//        for (num = 1; num<=10; num++){
//            System.out.printf("[%d] * [%d] = [%d]\n", sum, num, sum *= num);
//        }


//    p125 05_05_2  援ш뎄�떒 以� 5�떒�쓣 異쒕젰�븯�뒗 �봽濡쒓렇�옩�쓣 for臾몄쓣 �씠�슜�빐�꽌 留뚮뱾�옄.

//        for (int n1 = 1; n1<10; n1++){
//            System.out.printf("5 * [%d] = [%d] \n" , n1, 5*n1);
//        }


//        p129 05_06_1 �삁�젣 ContinueBasic.java �뿉 議댁옱�븯�뒗 while臾몄쓣 for臾몄쑝濡� 蹂�寃쏀빐蹂댁옄

//        while((num++) < 100) {
//            if(((num % 5 ) != 0) || ((num % 7) != 0))         // a && b �쓽    諛섎��뒗   ~a || ~b �씠�떎.
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

      // <李멸퀬�옄猷�>  while臾� 議곌굔�떇 �븞�뿉 利앷컧�뿰�궛�옄�쓽 �뿭�븷
        int num = 0;
        while((++num) < 100) {    // �뿬湲곕�� 蹂대㈃ ++num�씪 寃쎌슦�뿉�뒗 癒쇱� 1�쓣 �뜑�븯怨� 100蹂대떎 �옉��吏� 鍮꾧탳�븳�떎.
            System.out.println("num: "+ num);
        }
        while((num++) < 100) {    // �뿬湲곕�� 蹂대㈃ num++�씪 寃쎌슦�뿉�뒗 癒쇱� 100蹂대떎 �옉��吏� 鍮꾧탳�븯怨� 1瑜� �뜑�븳�떎.
            System.out.println("num: "+ num);  // 洹몃옒�꽌 �몮�쓽 �떎�뻾�릺�뿀�쓣�븣 李⑥씠瑜� 蹂대㈃ �몮�떎 1遺��꽣 李띿뼱�궡吏�留�, 留덉�留� �닽�옄瑜� 100怨� 99濡� �떎瑜대떎.
        }
*/
//      p129 : 05_06_02 : �옄�뿰�닔 1遺��꽣 �떆�옉�빐�꽌 紐⑤뱺 ���닔瑜� �뜑�빐 �굹媛꾨떎. 洹몃━怨� 洹� �빀�씠 �뼵�젣 (紐뉗쓣 �뜑�뻽�쓣 �븣) 1000�쓣 �꽆�뼱�꽌�뒗吏�, 洹몃━怨� 1000�쓣 �꽆�뼱�꽑
//      媛믪� �뼹留덇� �릺�뒗吏� 怨꾩궛�븯�뿬 異쒕젰�븯�뒗 �봽濡쒓렇�옲�쓣 �옉�꽦�빐蹂댁옄
/*
        int sum = 0;
        int num = 0;
        int result = 0;
        while (true) {
            if (num % 2 != 0) {
                sum += num;
                result = sum;
                System.out.println(sum + " + " + num + " = " + result ); // �뒪�듃留� + �뒪�듃留� = �뒪�듃留� �씠湲� �븣臾몄뿉 sum + num �뿰�궛�씠 �븞�맂�떎.
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
//                System.out.println(num + " �뿉�꽌 1000�씠 �꽆�뒗�떎.");
//                System.out.println("�빀怨꾨뒗: " + sum);
//                break;
//            }
//            num++;
//
//        }

        // p135 05_7_1 : 援ш뎄�떒�쓽 吏앹닔 �떒�씠 2, 4, 6 8�떒留� 異쒕젰�븯�뒗 �봽濡쒓렇�옩�쓣 �옉�꽦�븯�릺 2�떒�� 2x2源뚯�, 4�떒�� 4x4源뚯�, 6�떒�� 6x6�떒源뚯� , 8�떒��
        // 8x8源뚯� 異쒕젰�븯�룄濡� �옉�꽦�븯�옄.
//        int num1 = 0;
//        for (int i = 1 ; i < 10; i++){
//            if( i % 2 ==0){
//                for ( num1 = 1; num1 <= i ; num1++){
//                        System.out.printf("[%d] * [%d] = [%d] \n", i, num1, i*num1);
//                }
//            }
//        }
//
//        //�쐞�쓽 肄붾뱶�뿉 break怨� 議곌굔�떇�쓣 �닔�젙�븯�뿬 留뚮뱺 吏앷뎄援ш뎄�떒
//        for(int i = 2; i < 10; i += 2) {
//            for(int j = 1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + (i * j));
//
//                if(j >= i)
//                    break;
//            }
//        }


        // p135 05_7_2 : �떎�쓬�떇�쓣 留뚯”�븯�뒗 紐⑤뱺 A�� B�쓽 議고빀�쓣 援ы븯�뒗 �봽濡쒓렇�옩�쓣 �옉�꽦�븯�옄.
        //    A   B
        // +  B   A
        // ----------
        //    9   9
//        for (int i = 0 ; i < 10 ; i++){
//            for (int j = 0 ; j < 10 ; j++){
//                if( i + j == 9 && (i + j < 10)){     //�굹�뒗 議곌굔�떇�뿉 �끉由ъ뿰�궛�옄瑜� �씠�슜�븯�뿬 議곌굔泥섎━
//                    System.out.println(i + "," + j);
//
//                }
//            }
//        }


//        for(int i = 0; i < 10; i++) {
//            for(int j = 0; j < 10; j++) {
//                if((i * 10 + j) + (j * 10 + i) == 99) //議곌굔�떇�뿉 �삤吏� �닔�떇�쑝濡쒕쭔 議곌굔 泥섎━
//                    System.out.println(i + ", " + j);
//            }
//        }




        //p142 06_1 : �젙�닔 �몮�쓣 �씤�옄濡� �쟾�떖諛쏆븘�꽌 �몢 �닔�쓽 �궗移숈뿰�궛 寃곌낵瑜� 異쒕젰�븯�뒗 硫붿냼�뱶�� �씠 留ㅼ냼�뱶瑜� �샇異쒗븯�뒗 main硫붿냼�뱶瑜� �젙�쓽�빐蹂댁옄. �떒 �굹�닓�뀍��
        //紐リ낵 �굹癒몄�瑜� 媛곴컖 異쒕젰�빐�빞�븳�떎.

//        simpleCal(12, 13);
//
//        public static void simpleCal(int num1, int num2) { //�씠 遺�遺꾩� �썝�옒 硫붿씤硫붿냼�뱶 諛뽰뿉 �엳�뼱�빞�븳�떎. 臾몄젣 �닚�꽌瑜� �쐞�빐 �븞�뿉�떎 �꽔�뿀�떎.
//            System.out.printf("[%d] + [%d] = [%d]\n " , num1 , num2, num1 + num2);
//            System.out.printf("[%d] - [%d] = [%d]\n " , num1 , num2, num1 - num2);
//            System.out.printf("[%d] * [%d] = [%d]\n " , num1 , num2, num1 * num2);
//            System.out.printf("[%d] / [%d] = [%d] , �굹癒몄��뒗 : [%d]]\n " , num1 , num2, num1 / num2, num1 % num2);
//        }


        //p142 06_2 : �젙�닔 �몮�쓣 �씤�옄濡� �쟾�떖諛쏆븘�꽌, "�몢 �닔�쓽 李⑥쓽 �젅��媛�"�쓣 怨꾩궛�븯�뿬 異쒕젰�븯�뒗 硫붿냼�뱶�� �씠 硫붿냼�뱶瑜� �샇異쒗븯�뒗 main 硫붿냼�뱶瑜� �젙�쓽�빐蹂댁옄.
        //�떒 硫붿냼�뱶 �샇異쒖떆 媛믪쓽 �닚�꽌�뿉 �긽愿��뾾�씠 �젅��媛믪씠 怨꾩궛�릺怨� 異쒕젰�릺�뼱�빞 �븳�떎.



/* p216 履� 09-1臾몄젣 �꽌�겢 �겢�옒�뒪 �젙�쓽�븯怨� 硫붿씤硫붿냼�뱶濡� 遺덈윭���꽌 �궗�슜�빐蹂닿린


class Circle2 {
    int radi;

    public Circle2(int x, int y, int r) {
        radi = r;
        point2 p = new point2(x, y);
    }

    public void cirCleInfo(){
        System.out.printf("r�� = %d �엯�땲�떎", radi);
    }

}

class point2 {
    int x, y;

    public point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showInfo(){
        System.out.printf("�썝�쓽 x,y�뒗 %d, %d �엯�땲�떎.", x, y);
    }
}

public static void Main(String[] args) {
    Circle2 c = new Circle2(2,4,2);
    c.cirCleInfo();
}


 */










/* p237 10_1 踰� 臾몄젣 �겢�옒�뒪蹂��닔�� �겢�옒�뒪 硫붿냼�뱶
�떎�쓬 main 硫붿냼�뱶�� �븿猿� �룞�옉�븯�뒗 Accumulator �겢�옒�뒪瑜� �젙�쓽�븯�옄. 洹몃━怨� Accumulator�겢�옒�뒪�뿉 main硫붿냼�뱶�룄 �꽔�뼱�꽌 而댄뙆�씪 諛� �떎�뻾�쓣 �븯�옄.











    }


}


*/


