     /*    
      
       *
     *  *
   *   *   *
 *   *   *    */
package _5day;

public class pattern_4 {
    public static void main(String[] args) {
        int temp=0;

        for(int i =1;i<5;i++) {


            for(int ii =(7-temp);ii >=1;--ii) {
                System.out.print(" ");
            }temp=temp+2;


            for(int k =1;k<=i;k++) {
                System.out.print("*   ");
            }
            System.out.println();

        }

    }
	


}        