package Handson;

import java.util.HashMap;
import java.util.Map;

public class LambdaPrg7 {
    public static void main(String args[]){
        Map<String,String> list=new HashMap<>();
        list.put("hi","hello");
        list.put("java","team");
        StringBuilder str=new StringBuilder();
        for(Map.Entry<String,String> p:list.entrySet())
        {
            String str1=p.getKey()+p.getValue();
            System.out.println(str1);
            str.append(str1);
        }
        System.out.println(str);
    }
}
