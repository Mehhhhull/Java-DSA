package Array;

public class ArrayBasics {
    public static void main(String[] args){
        int[] rollNums=new int[3];
//        int rollNums[]=new int[3];
        //101, 102,103

        int x=101;
        for (int i = 0; i < rollNums.length; i++) {
            rollNums[i]=x;
            x++;
        }

        for (int i = 0; i < rollNums.length; i++) {
            System.out.println(rollNums[i]);
        }
    }
}
