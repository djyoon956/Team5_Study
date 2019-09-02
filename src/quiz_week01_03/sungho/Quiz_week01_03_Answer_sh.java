package quiz_week01_03.sungho;

/*class animal{
    String name;
    int old;
    tiger t;


    animal(){
        this("틀렸어" , 4444);  //기본값으로 부르면 무조건 이게 나오징 ㅋㅋㅋㅋㅋㅋ
    }

    //여기 코드는 당신이 수정해야 할 것이 있습니다. 완전 새롭게 다시 짜는게 아니라, '일부'만 수정 해 주세요.
    //---------------------------------------------------------------
    animal(String name, int old){
        this.name = name;
        this.old = old;
    }
    //---------------------------------------------------------------




    //여기 코드는 생성자가 있어야 하는데 당신이 만들어 주세요.
    //---------------------------------------------------------------
    animal(String name, int old, tiger t){
        this.name = name;
        this.old = old;
        this.t = t;
    }
    //---------------------------------------------------------------



    void printInfoOne(){
        System.out.println("현재 이 동물의 이름음 : " + this.name);
        System.out.println("현재 이 동물의 나이는 : " + this.old);

    }
    void printInfoTwo(){
        System.out.println("현재 이 동물의 이름음 : " + this.name);
        System.out.println("현재 이 동물의 나이는 : " + this.old);
        System.out.println("현재 이 동물의 종은 : " + t.variety);
    }
}


class tiger{
    String variety ;

    tiger(){
        this.variety = "틀렸어 이게아니야";
    }
    tiger(String variety){
        this.variety = variety;
    }
}




class overloadingAndPrivate {
    public static void main(String[] args) {

        // 위에 코드에 밑줄로 구분 한 부분에 적절한 작업을 해주시고, 여기 메인메소드에서 불러서 출력하세요.
        // 그래서 다음과 같이 똑같이 출력이 나오게 해주세요.
        // 주의 할 점 : 위에서 밑줄로 구분 된 곳만 수정 or 작성 해 주시고, 나머지 코드는 수정하지 마시고, 잘 보고 이용하세요.


        //현재 이 동물의 이름은 : 박성호
        //현재 이 동물의 나이는 : 31

        // 현재 이 동물의 이름은 : 피피
        // 현재 이 동물의 나이는 : 9
        // 현재 이 동물의 종은 : superCat

        animal a = new animal("박성호", 31);
        a.printInfoOne();
        System.out.println();
        animal a1 = new animal("피피", 9, new tiger("superCat"));
        a1.printInfoTwo();
    }
}


*/