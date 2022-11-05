package Handson;

import java.util.*;
interface Consumer {
    int results();
}
public class LambdaPrg5 {
    static String firstLetterWord(String str){
        String results=" ";
        boolean v=true;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ' ') {
                v = true;
            } else if (str.charAt(i) != ' '&& v == true) {
                results += str.charAt(i);
                v = false;
            }
        }
            return results;
        }
        public static void main(String[] args){
        String str="Hi welcome everyone";
        String str2="Full Stack Team";
        System.out.println(firstLetterWord(str));
        System.out.print(firstLetterWord(str2));
    }
}
