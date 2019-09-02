package quiz_week01_03.hayeon;

import java.util.Scanner;
public class dd{
public static void main(String[] args){
int[] data=new int[5];
Scanner obj=new Scanner (System.in);
System.out.print("자료를 입력하세요:");
for(int i=0; i<5; i++){
System.out.print("  "+data[i]);
}
for(int i=0; i<4; i++){
for(int j=i+1; j<5; j++)
if(data[i]>data[j]){
int temp=data[i];
data[i]=data[j];
data[j]=temp;
}
}
System.out.println(" ");
for(int i=0; i<5; i++){
System.out.print(" "+data[i]);
}
}
} 