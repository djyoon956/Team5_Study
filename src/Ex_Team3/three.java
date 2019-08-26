package Ex_Team3;
import java.util.Scanner;

public class three {
    public static void main(String[] args){
        bitcamp b1 = new bitcamp("박성호  ", "010-5233-3298", "32234234  "); //여기서 카드번호 안하면 객체생성못
        b1.info();
        b1.choose();
        b1.showYourclass(); // 학원 등록 후, 자기 강의 번호 확인해주는 메소드

    }
}


class bitcamp{
    private String name;
    private String phoneN;
    private String cardN;
    private int classN;
    private boolean result;

    bitcamp(String name, String phoneN, String cardN){
        this.name = name;
        this.phoneN = phoneN;
        this.cardN = cardN;
        this.result = true;

    }

    void info(){
        System.out.println("이름 :  " + "  "  + name + "휴대폰번호 : " + phoneN + "   "+ "카드번호 : " + cardN);
    }


    public int getClassN() {
        return classN;
    }

    public String getName() {
        return name;
    }

    public String getPhoneN() {
        return phoneN;
    }

    public String getCardN() {
        return cardN;
    }

    public void setPhoneN(String phoneN) {
        this.phoneN = phoneN;
    }

    void choose(){
        if(this.result == true) {
            do {
                int choiceN;

                System.out.println("학원을 선택해 주세요: ");
                System.out.println("1번 : java, 2번 : python, 3번 : 종로 ");
                Scanner sc = new Scanner(System.in);
                choiceN = sc.nextInt();
                if (choiceN == 1) {
                    this.classN = 1;
                    System.out.println("축하합니다 자바 강의에 등록하셨습니다.");
                    break;
                } else if (choiceN == 2) {
                    this.classN = 2;
                    System.out.println("축하합니다 파이썬 서초본원 강의에 등록하셨습니다.");
                    break;
                } else if (choiceN == 3) {
                    this.classN = 3;
                    System.out.println("축하합니다  C언어 종로점 강의에 등록하셨습니다.");
                    break;
                } else {
                    System.out.println("1~3번 만 눌러주세요 잘 못 입력하셨습니다. ");
                    continue;
                }
            } while (true);
        }else{
            System.out.println("카드번호가 없으면 학원 등록을 할 수 없습니다.");
        }


    }

    void showYourclass(){
        int number;
        number = this.getClassN();
        System.out.println("현재 당신의 강의번호는 : "+ number);
    }
}
