package Handson;
import java.util.ArrayList;
public class LambdaPrg4 {
    public static void main(String[] args){
       ArrayList<Integer> arr = new ArrayList<Integer>();
       arr.add(10);
       arr.add(20);
       arr.add(40);
       arr.add(50);
       System.out.println(arr);
      // arr.removeAll(arr);
      // System.out.println(arr);
        arr.removeIf(n -> (n>30));
        System.out.println(arr);

    }
}
