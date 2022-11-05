package Handson;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
class Up implements UnaryOperator<String> {
    public String apply(String str) {
        return str.toUpperCase();
    }
}
public class LambdaPrg6 {
    public static void main(String[] args){
        String str;
        ArrayList<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Good Morning");
        System.out.println("contents of the list:" +list);
        list.replaceAll(new Up());
       /* {
            @Override
            public String apply(String s) {
                return null;
            }
        });*/
        System.out.println("contents after replacing the list:" +list);
       // return str.toUpperCase();
    }
}
