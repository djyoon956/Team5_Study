package ch13.sungho;
public class ch13 {

    static int max ;
    static int min ;

    public static int minValue(int[] arr){
        for ( int i=0; i<arr.length; i++){
            min = min < arr[i] ? min : arr[i];
        }
        return min;
    }


    public static int maxValue(int[] arr){
        for(int value : arr){
            max = max > value ? max : value;
        }
        return max;
    }


    public static void main(String[] args){
        //int 형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최댓값, 최솟값을 찾아서 반환하는 매소드를 각각 다음의 형태로 정의하자.
        int[] arr = new int[5];

        for( int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        System.out.println(minValue(arr));
        System.out.println(maxValue(arr));





    }
}
