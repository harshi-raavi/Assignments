import java.lang.*;
public class Stringbuffer {
    public static void main(String[] args){
        StringBuffer s = new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println("StringBuffer=" +s);

        s.reverse();
        System.out.println("String buffer after reversing = " +s);
    }
}