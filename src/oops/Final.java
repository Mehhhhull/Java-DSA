package oops;

public class Final {
    public static void main(String[] args){
        Randomm r1=new Randomm();
        System.out.println(r1.PI);
        //cant reassign as its final

        final int x;
        x=4; //for only one time
        System.out.println(x);
    }
}

class Randomm{
    final double PI=3.14;
}
