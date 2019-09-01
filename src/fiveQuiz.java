
import java.util.Scanner;

class mind{   //마인드 클래스 입니다. 이놈이 여러분이 인성을 분석하는 역할을 합니다.
    private int evil ;
    private int angel ;
    private int strange ;
    private int normal ;

    boolean evilZero, normalZero, strangeZero, angelZero; //기본값 false
    static int order = 0;

    public void setEvil(int evil) {
        this.evil = evil;
    }

    public void setAngel(int angel) {
        this.angel = angel;
    }

    public void setStrange(int strange) {
        this.strange = strange;
    }

    public void setNormal(int normal) {
        this.normal = normal;
    }

    void analyzeYourInSung() {
        while (true) {
            subEvil();
            subAngel();
            subNormal();
            subStrange();
            checkOrder();
        }
    }

  // 여기서 부턴 출력 함수들입니다. 일정한 점수가 높은 쪽의 결과를 출력합나디 ex) 악마 선택지를 많이 선택하여 악마점수가 높을 경우 "악마도보고배워간다는 말"을 출력받음
    void printEvil() { System.out.println("악마도 보고 배우고 갑니다. 지옥에서 평생 교수자리를 얻으셨어요 어서 가세요.");}
    void printAngel() { System.out.println("하느님이 당신의 선행을 보고 계실 겁니다.");}
    void printStrange() { System.out.println("당신이 지극히 정상이라고 생각하실 겁니다, 그건 당신만의 생각이에요.");}
    void printNormal() { System.out.println("에이 그냥 보통 사람이군요 재미없긴");}
    void printAll() { System.out.println("세상에 당신은 악마&천사 이면서도 이상하면서도 보통 사람이에요 끔찍한 혼종입니다");}
    void printEA() {System.out.println("당신은 천사와 악마입니다.");}
    void printES() {System.out.println("당신은 조금 이상한 악마이군요");}
    void printEN() {System.out.println("걍 보통 악마이시네요...그렇게 살지마세요.");}
    void printAS() {System.out.println("이상한 천사이네요. 주변에 친구 많죠?");}
    void printAN() {System.out.println("보통천사에요. 가끔씩 착한척하시는군요 ㅎㅎ");}
    void printSN() {System.out.println("보통 이상한 사람이시군요. 혹시 AB형이세요?");}

    void checkOrder(){  //누가 먼저 점수가 0이 되냐에 따라 순서가 결정되어 그에 따른 결과를 보여 줄 수 있음.
        if (order == 3) {    //딱 하나의 점수만이 높을 때 이쪽으로 로직이 흐름
            if (evilZero == false) {
                printEvil();
                System.exit(0);
            } else if (angelZero == false){
                printAngel();
                System.exit(0);
            } else if (strangeZero == false){
                printStrange();
                System.exit(0);
            } else {
                printNormal();
                System.exit(0);
            }

        }else if( order == 4) {                 // 모든 점수가 균일 할 때 악마:2,천사:2, 이상한놈:2, 보통놈:2  각각 다 2점일 경우
            printAll(); System.exit(0);

        }else if(order == 2){     // 두 개의 점수가 공동 1위 일 때는 이 쪽 로직으로 온다.
            if(evilZero == false && angelZero == false){
                printEA();
                System.exit(0);
            }else if(evilZero == false && strangeZero == false){
                printES();
                System.exit(0);
            }else if(evilZero == false && normalZero == false){
                printEN();
                System.exit(0);
            }else if(angelZero == false && strangeZero == false){
                printAS();
                System.exit(0);
            }else if(angelZero == false && normalZero == false){
                printAN();
                System.exit(0);
            }else {
                printSN();
                System.exit(0);
            }
        }
    }

    void subEvil() {    //여기서 부터는 4가지 점수 중 어떤 점수가 가장 높은지 알아보기 위해 각 점수당 1점씩 빼는 역할을 하는 함수들입니다.
        if (evilZero == false) {
            if (evil > 0)
                evil--;
            else {
                evilZero = true;
                order++;
            }
        }
    }

    void subAngel(){
        if( angelZero == false) {
            if (angel > 0)
                angel--;
            else {
                angelZero = true;
                order++;
            }
        }
    }

    void subStrange(){
       if(strangeZero == false) {
           if (strange > 0)
               strange--;
           else {
               strangeZero = true;
               order++;
           }
       }
    }

    void subNormal(){
        if(normalZero == false) {
            if (normal > 0)
                normal--;
            else {
                normalZero = true;
                order++;
            }
        }
    }



}

class person{   // 여러분이 인성검사를 하게 되면, 이 클래스로 정보가 입력 됩니다.
    int evil;
    int angel;
    int strange;
    int normal;
}


public class fiveQuiz {  //여기서 while문으로 여러분은 인성검사를 받게 됩니다. 총 8문제이며.. 번호 말고 문자 눌르면 안되여...ㅋㅋㅋㅋ오류낰ㅋㅋㅋㅋ이거 어떻게하더라
    public static void main(String[] args){
        person you  = new person();
        mind m = new mind();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("문제1) 오늘 아침에 일어 났을 때 기분은?");
            System.out.println("1. 아 짜증나 오늘 나와 처음으로 눈 마주친 놈 죽는다.");
            System.out.println("2. 아 오늘 아침도 온전히 잠에서 깨서 다행이다 정말 아름다워");
            System.out.println("3. 아 오줌마려");
            System.out.println("4. 아 미친 학원가야돼");
            int answer = sc.nextInt();
            if ( answer == 1){
                you.evil++;
                break;
            }else if (answer == 2){
                you.angel++;
                break;
            }else if ( answer == 3){
                you.strange++;
                break;
            }else if ( answer == 4){
                you.strange++;
                break;
            }else {
                System.out.println("보기 숫자 외 다른 입력을 하셨습니다 다시 해주세요");
                continue;
            }
        }
        while (true){
            System.out.println("문제2) 누군가 당신에게 길을 물어 봅니다. (당신도 그 길을 모르고 있습니다.)");
            System.out.println("1. 아 그 길 이길로 쭉 가셔서 457버스 타고 3정거장가면 됩니다. 진짜입니다.");
            System.out.println("2. 아 저도 모르겠는데(이미 손으로는 카카오맵을 켜고 검색까지 했다.)따라오세요 안내를 시작합니다.");
            System.out.println("3. 아 서울역가시죠. 일단 서울역가면 어디든지 갈 수 있어요");
            System.out.println("4. 아 저 종교 안믿구요. 이런거 하지마세요");
            int answer = sc.nextInt();
            if ( answer == 1){
                you.evil++;
                break;
            }else if (answer == 2){
                you.angel++;
                break;
            }else if ( answer == 3){
                you.strange++;
                break;
            }else if ( answer == 4){
                you.normal++;
                break;
            }else {
                System.out.println("보기 숫자 외 다른 입력을 하셨습니다 다시 해주세요");
                continue;
            }
        }
        while (true){
            System.out.println("문제3) 길을 걷고 있는데 갑자기 낯선 이가 당신의 연락처를 달라고 합니다");
            System.out.println("1. 아 폰 주세요 (도망)");
            System.out.println("2. 아 저에게도 이런 일이...하느님 감사합니다");
            System.out.println("3. 아 이 분 이랑 같이 서울역가서 저한테 전화 해주시면 번호드릴께요");
            System.out.println("4. 아 if( 잘생김/이쁨 == true){준다} else {전 가정이 있는 사람입니다..}");
            int answer = sc.nextInt();
            if ( answer == 1){
                you.evil++;
                break;
            }else if (answer == 2){
                you.angel++;
                break;
            }else if ( answer == 3){
                you.strange++;
                break;
            }else if ( answer == 4){
                you.normal++;
                break;
            }else {
                System.out.println("보기 숫자 외 다른 입력을 하셨습니다 다시 해주세요");
                continue;
            }
        }

        while (true){
            System.out.println("문제4) 길을 가다가 길에 지갑을 발견 했습니다. ");
            System.out.println("1. 얼른가서줍줍, 현근만 쏙 뺌, 주민등록번호로 야동사이트 가입, 나머지는 굳이 세절기 넣어 세절");
            System.out.println("2. 이런! 그 자리에 가만히 서 있는다. 지갑을 안을 살짝 보고, 10만원 아래면, 더 넣어준다.");
            System.out.println("3. 가다가 갑자기 자기 지갑도 떨어뜨린다. 그리고 자기 지갑을 줍는 척 하면서 그 지갑도 줍는다.");
            System.out.println("4. 일단 줍고, 치킨집으로 간다. 그리고 그 사람에게 연락한다.");
            int answer = sc.nextInt();
            if ( answer == 1){
                you.evil++;
                break;
            }else if (answer == 2){
                you.angel++;
                break;
            }else if ( answer == 3){
                you.strange++;
                break;
            }else if ( answer == 4){
                you.normal++;
                break;
            }else {
                System.out.println("보기 숫자 외 다른 입력을 하셨습니다 다시 해주세요");
                continue;
            }
        }

        while (true){
            System.out.println("문제5) 버스를 탔는데 만원이고 전 여친/남친이 유일한 빈 자리에 옆에 앉아있습니다. 당신은 다시 내릴 수 없습니다");
            System.out.println("1. 그냥 앉는다.(그 전 여/남친만이 당신을 기억하고있고, 버스에서 뛰어내리고싶다.)");
            System.out.println("2. 그때 내가 너무 정말 미안했어..ㅜㅜ 아니 왜 버스타고 다녀 ㅜㅜ 내일 차 한 대 보낼께");
            System.out.println("3. 어이쿠 기사님 제가 운전 할께요 저기 앉으세요 (난 2종 자동 이다)");
            System.out.println("4. 미친 미친 미친 미친 미친 미친 미친 미친 ");
            int answer = sc.nextInt();
            if ( answer == 1){
                you.evil++;
                break;
            }else if (answer == 2){
                you.angel++;
                break;
            }else if ( answer == 3){
                you.strange++;
                break;
            }else if ( answer == 4){
                you.normal++;
                break;
            }else {
                System.out.println("보기 숫자 외 다른 입력을 하셨습니다 다시 해주세요");
                continue;
            }
        }


        while (true){
            System.out.println("문제6) 당신은 소개팅 중 입니다. 근데 갑자기 상대가 애니 원피스의'루피'에 대해서 어떻게 생각하는지 물어봅니다.");
            System.out.println("1. 애니 좋아하시는구나 잠시만요 화장실 좀 갔다올께요.");
            System.out.println("2. ㅎㅎㅎㅎㅎ 루피 저 좋아해요 (폰으로 루피 검색 중)");
            System.out.println("3. 집에 저 그 밀집모자 있는데 그거 싸게 팔께요 50이구요 네고는 안되요 이미 싸게드리는거에요");
            System.out.println("4. 힘든 하루를 보내고, 다음날 기어쌔컨드 모드로 주선자를 없애버린다.");
            int answer = sc.nextInt();
            if ( answer == 1){
                you.evil++;
                break;
            }else if (answer == 2){
                you.angel++;
                break;
            }else if ( answer == 3){
                you.strange++;
                break;
            }else if ( answer == 4){
                you.normal++;
                break;
            }else {
                System.out.println("보기 숫자 외 다른 입력을 하셨습니다 다시 해주세요");
                continue;
            }
        }

        while (true){
            System.out.println("문제7) 만원인 엘레베이터에 타고 한참을 올라가야하는데, 어디선가 방귀소리가 들린다.");
            System.out.println("1. 긴급 정지버튼을 과감히 누른다. ( 범인 찾을 때 까지 못 나가 )");
            System.out.println("2. ...아 죄송합니다...제가 배탈이 나서..( 내가 아니지만 그 누군가를 위해 )");
            System.out.println("3. 아..거참..사람도 많은데.. 그 빨리 배출 하신 분 다음 층에서 내리세요 ( 다음 층에서 내림 )");
            System.out.println("4. 놀란척하면서, 살짝 웃는다.( 사실 나임 )");
            int answer = sc.nextInt();
            if ( answer == 1){
                you.evil++;
                break;
            }else if (answer == 2){
                you.angel++;
                break;
            }else if ( answer == 3){
                you.strange++;
                break;
            }else if ( answer == 4){
                you.normal++;
                break;
            }else {
                System.out.println("보기 숫자 외 다른 입력을 하셨습니다 다시 해주세요");
                continue;
            }
        }


        while (true){
            System.out.println("문제8) 여자/남자 친구랑 데이트 중 입니다. 옷을 사자며, 유니클로로 가자고 합니다.");
            System.out.println("1. 요세 일본불매운동하는거몰라? 안되겠다 자기 카드 나한테 맏겨 ( 집가서 유니클로 특가세일 다 삼)");
            System.out.println("2. 유니클로 말고 딴 데 가자 (유니클로 상점에 들어가 메니저에게 미안하다고 사과하고 나온다) ");
            System.out.println("3. 혼또? 데스까? 와타시아 니뽄진데스네 소까 유니클로 팔아줘야데스네 ");
            System.out.println("4. 근데..저기 사람 너무 없는데? 가지말자... 알바 존나 편하겠다.");
            int answer = sc.nextInt();
            if ( answer == 1){
                you.evil++;
                break;
            }else if (answer == 2){
                you.angel++;
                break;
            }else if ( answer == 3){
                you.strange++;
                break;
            }else if ( answer == 4){
                you.normal++;
                break;
            }else {
                System.out.println("보기 숫자 외 다른 입력을 하셨습니다 다시 해주세요");
                continue;
            }
        }

        m.setEvil(you.evil);     // 여러분의 인성검사 토대로 만들어진 person 클래스의 멤버값들을 mind 클래스로 입력합니다.
        m.setAngel(you.angel);   //이하동일
        m.setStrange(you.strange);  //이하동일
        m.setNormal(you.normal);  //이하동일
        m.analyzeYourInSung();   //mind 클래스의 분석 함수를 이용해서 여러분의 인성검사의 대한 결과를 보여줍니다.
    }

}


