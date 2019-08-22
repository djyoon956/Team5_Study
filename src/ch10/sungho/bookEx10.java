
class Accumelator {
    static int sum=0;

    static void add(int i) {
        sum += i;
    }

    static void showResult() {
        System.out.println(sum);
    }

    public static void main(String[] args){
        for(int i = 0; i < 10 ; i++)
            Accumelator.add(i);
        Accumelator.showResult();
    }

}







