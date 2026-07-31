package Array;

public class MultiDImentionalArray {
    public static void main(String[] args){
//        int[][] marks=new int[3][3];//rows,col
//        marks[0][0]=23;
//        marks[0][1]=25;
//        marks[0][2]=45;
//
//        marks[1][0]=2;
//        marks[1][1]=65;
//        marks[1][2]=75;
//
//        marks[2][0]=63;
//        marks[2][1]=35;
//        marks[2][2]=47;
//
//        for(int row=0;row<marks.length;row++){
//            for (int col=0;col<marks[row].length;col++){
//                System.out.print(marks[row][col]+" ");
//            }
//            System.out.println();
//        }

        //Multidimentional Array each with different length
        int[][] marks=new int[3][];

        marks[0]=new int[1];
        marks[1]=new int[2];
        marks[2]=new int[3];

        marks[0][0]=23;

        marks[1][0]=24;
        marks[1][1]=19;

        marks[2][0]=29;
        marks[2][1]=93;
        marks[2][2]=8;

        /*
        []
        [] []
        [] [] []
         */


            for(int row=0;row<marks.length;row++){
            for (int col=0;col<marks[row].length;col++){
                System.out.print(marks[row][col]+" ");
            }
            System.out.println();
        }



    }
}
