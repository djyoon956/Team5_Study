package ch11.sungho;
public class ch11 {
    public static void main(String[] args){
        //다음 주민등록 번호의 중간에 삽입된 - 를 지우고 공백으로 채워서 출력하는 프로그램을 작성해보자
        String str = "990925-1012999";

        String s = str.substring(0,6);
        String s1 = str.substring(7);

        System.out.println(s + " " + s1);

        //다음 주민번호 중간에 삽입된 - 을 지우고 공백으로 채워서 출력하는 프로그램을 작성해보자. 단 StringBuiler클래스를 활용해서 빈번한 문자열의 생성이 발생하지 않도록
        //해야한다.

        StringBuilder str1 = new StringBuilder("990925-1012999");
        str1.replace(6, 7, " ");
        System.out.println(str1);





    }
}
