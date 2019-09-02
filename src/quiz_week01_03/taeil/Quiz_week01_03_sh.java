package quiz_week01_03.taeil;

class Main{
    public static void main(String[] args){
    
        //반지름이 3인 원의 넓이를 구하시오
        Circle c = new Circle(3);
        c.printInfo();
    

    }
}


class Circle{
    int r;
    int demension;
    Circle(int r){
        this.r = r;
    
        this.demenstion = Math.PI * r * r;
        
        
    }
    
    void printInfo(){
        System.out.println("원의 넓이는 : " + this.demenstion);
        
    }
}