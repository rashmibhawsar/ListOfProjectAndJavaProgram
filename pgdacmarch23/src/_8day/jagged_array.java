package _8day;
//array with different length
public class jagged_array {
    public static void main(String[] args) {
        int num[][]=new int[3][];
        num[0] = new int[3];
        num[1] = new int[2];
        num[2] = new int[4];
        for (int i=0;i<num.length;i++)
        {
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*100);
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }
    }
}
