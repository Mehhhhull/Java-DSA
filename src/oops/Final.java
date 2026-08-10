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

//why in java main is static???
//Final f1=new Final();
//f1.main();
//but as static, therefore Final.main();
//therefore all method/ function inside the main is static

class Randomm{

    static final double PI;

    static{
        PI=3.14;
    }
}
