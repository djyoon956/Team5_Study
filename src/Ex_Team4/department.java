package Ex_Team4;
import java.util.Scanner;

public class department {
    public static void main(String[] args){
       depart d1 = new depart("lg", 3);
       d1.infoAll();  //그냥 백화점 층이랑 브랜드 알려줌
       d1.findb();   // 층을 입력 받고 무슨 브랜드가 있는지 알려줌


    }


}


class depart {
    private String brand;
    private int floor;   //단 한 층에는 한 개의 브랜드만 존재

    depart(String brand, int floor) {
        this.brand = brand;
        this.floor = floor;
    }

    void infoAll(){
        System.out.println("이 백화점의 층: " + this.floor +","+" 이 층에 있는 브랜드: " + this.brand);
    }
    void findb() {

        do {
            Scanner sc = new Scanner(System.in);
            int input;
            System.out.println("층을 입력해 주세요: ");
            input = Integer.parseInt(sc.nextLine());
            if (input == this.floor) {
                System.out.println("해당 층의 브랜드는 : " + this.brand);
                break;

            }else {
                System.out.println("해당 층은 이 백화점에는 없습니다");
                continue;
            }
        } while (true);

    }


}




