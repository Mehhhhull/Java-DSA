package Functions;

public class ScopeOfVariable {
   static String name="Mehul"; //global scope
    public static void main(String[] args){
        int x=5;//local scope
        int y=10;//local scope

        System.out.println(x+y);

        fun();
    }
    static void fun(){
        int x=6;//local scope
        int y=10;//local scope
        System.out.println(x+y);
        //In java, everything varible written inside a { } curly braces, the scope of it os inside the curly braces onlt
    }
}
