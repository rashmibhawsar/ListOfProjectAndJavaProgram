package CJAVAInternal;


public class EvenDigitSum {
    public EvenDigitSum() {
    }
    
    
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum=0;
            for(int i=1; i <=number ; i++) {
               
                if (i % 2 == 0) {
                    sum += i;
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        int result = getEvenDigitSum(5);
        if (result >= 0) {
            System.out.println("sum of even digit is  " + result);
        } else {
            System.out.println("invalid input");
        }

    }


}
