package ch07.sungho;

public class ch07 {
    public static void main(String[] args){

        triangle tri = new triangle(2,3);
        int var = tri.calD();
        System.out.println(var);


    }
}
//밑변과 높이 정보를 저장할 수 있는 Triangle 클래스를 정의하자. ( 그 안에 적절한 생성자도 정의하자.)그리고 밑변과 높이 정보를 변경할 수 있는
//메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께정의하자. 물론 이 클래스의 활용의 예를 보이는 main 메소드도 함께 작성해야한다.

class triangle{

    int w;
    int h;
    int demension;

    triangle(int w, int h){
        this.w = w;
        this.h = h;
    }

    int calD(){
       this.demension = this.w * this.h;
       return this.demension;
    }

}






