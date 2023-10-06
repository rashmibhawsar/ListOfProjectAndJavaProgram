package _5day;

public class house_patter1 {
    public static void main(String[] args) {
        char m='A';

        for(int i =1;i<=5;i++) {
            char l ='A';

            for(int j =5;j>=i;j--) {

                System.out.print(l++);}

            for(int ii =1;ii <i;ii++) {
                System.out.print("  ");}


            for(int k =5;k>=i;k--) {

                //char n='E';
                System.out.print(--l);



            }System.out.println();

        }

        //System.out.print(" "+(char)a);
        // TODO Auto-generated method stub

    }
}
