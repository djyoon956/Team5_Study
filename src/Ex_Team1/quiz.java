package Ex_Team1;

public class quiz {
    public static void main(String[] args){


   car c1 = new car("smart", 100);
   c1.info();  //조회 실행 시 마크랑 같이 차종 가격이 출력되는 함수

   c1.check();   // 모든 차 누적대수 확인

   c1.check("smart");   // 차종별로 누적대수 확인





    }
}

class car{
    private String kind;
    private String number;
    private int price;
    static int carCount;
    static int cS;
    static int cW;
    static int cJ;


    car(String kind, int price){
        if(kind.equals("smart")) {
            this.kind = kind;
            this.price = price;
            carCount++;
            cS++;
        }else if(kind.equals("web")) {
            this.kind = kind;
            this.price = price;
            carCount++;
            cW++;
        }else if(kind.equals("java")){
            this.kind = kind;
            this.price = price;
            carCount++;
            cJ++;
        }else{
            System.out.println("옳바른 차종을 입력해주세요");
            return;
        }
    }

    public String getKind() {
        return kind;
    }

    public int getPrice() {
        return price;
    }

    void info(){
        if(kind.equals("smart")){
            for(int i = 0; i < 5; i++) {
                for (int j = 4; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i * 2 + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("차종 : "+ this.kind + "가격: "+this.price);
        }
        if(kind.equals("web")){
            for(int i = 0 ; i < 5; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 9; k > i * 2; k--) {
                    System.out.print("*");
                }
            System.out.println();
            }
            System.out.println("차종 : "+ this.kind + "가격: "+this.price);
        }
        if(kind.equals("java")){
            for( int i = 0; i < 5; i++){
                System.out.println("*********");
            }
            System.out.println("차종 : "+ this.kind + "가격: "+this.price);
        }
    }

    void check(){
        System.out.println("모든 차의 총 누적대수는 :" + carCount);
    }
    void check(String kind){
        if (this.kind.equals("smart")) {
            System.out.println("smart차종의 누적대수는 : "+ cS);
        }else if (this.kind.equals("web")){
            System.out.println("web차종의 누적대수는 : "+ cW);
        }else if (this.kind.equals("java")){
            System.out.println("java차종의 누적대수는 :" + cJ);
        }else {
            System.out.println("잘못입력하셨습니다 여기서도 잘 못 입력하면 시스템이 종료됩니다");
        }
    }

}
