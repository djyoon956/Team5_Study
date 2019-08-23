package Ex_Team2;


public class two_review {
    public static void main(String[] args){
        goods g1 = new goods(1011, 1000, "라면", "식품", "할인상품");
        g1.info();

    }
}


class goods{
    private int bar;
    private int price;
    private String name;
    private String kind;
    private String sale;


    public int getBar() {   //바코드와 상품이름, 종류는 겟터로 확인만 가능하
        return bar;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public void setPrice(int price) {    //가격과 세일 유무는 셋터 함수로 수정 가능하다.
        this.price = price;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    goods(int bar, int price, String name, String kind, String sale) {
        this.bar = bar;
        this.price = price;
        this.name = name;
        this.kind = kind;
        this.sale = sale;
    }


    void info(){   // 가격 바코드 상품명은 한번에 확인 가능하다.
        System.out.println("가격:"+ this.price+" 바코드 : "+ this.bar + " 상품명 : "+ this.name);
    }

}

