package Team5_Final.hn;

import java.util.Calendar;

//함수 (날짜 처리)
//Edu_Date e = new ..
//e.함수

//[static] void date
//Edu_Date.date() 

//오버로딩 ... 함수의 이름은 같고 

public class Edu_Date {
	   public static String DateString(Calendar date) {
		   return date.get(Calendar.HOUR) + "시"
	              + (date.get(Calendar.MINUTE)) + "분"
	              + date.get(Calendar.SECOND) + "초";
   }
   public static String DateString(Calendar date , String opr) {
	   return date.get(Calendar.YEAR) + opr
	              + (date.get(Calendar.MONTH)+1) + opr
	              + date.get(Calendar.DATE);
   }
   
   //요구사항 : 
   //2019-01-1
   //1~9월까지 >> 01 , 02 .... 09
   //10,11,12,
   public static String monthFormat_DateString(Calendar date) {
	   String month="";
	   if((date.get(Calendar.MONTH)+1) < 10) {
		   month = "0" + (date.get(Calendar.MONTH)+1);
	   }else {
		   month = String.valueOf((date.get(Calendar.MONTH)+1));
	   }
	   return date.get(Calendar.YEAR) + "년"
       + month + "월"
       + date.get(Calendar.DATE) + "일";
   }
}







