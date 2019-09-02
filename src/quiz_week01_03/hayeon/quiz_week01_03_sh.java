package quiz_week01_03.hayeon;




class start_h{
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < 10-(i*2); k++) {
                System.out.print(" ");
            }

            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 
    
    
    
    
    
    
    
    
    
    
 //   *         *         
//    * *     * *
  //  * * * * * *
//    * *     * *
//    *         *