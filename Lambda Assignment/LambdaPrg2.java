package Handson;

import java.util.*;
import java.util.function.Predicate;
interface Orders
{
    void criteria(int price);
}
class LambdaPrg2 {
    public static void main(String args[]) {
     // Predicate<Integer> pr = e ->(e>10000);
        // System.out.println(pr.test(15000));
        //int price=10002; /method2
      Orders pr=a->{
          if(a>10000){
              System.out.println("completed");
          }
          else
          {
              System.out.println("not completed/pending");
          }
      };
     pr.criteria(10002);
    }
}
