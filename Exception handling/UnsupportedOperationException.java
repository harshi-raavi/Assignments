import java.lang.*;
public class UnsupportedOperationException {
    public static void main(String[] args){
        int num1=12 , num2=0, results;
        try{
            results=num1/num2;
            System.out.println("The results is" + results);
        }
        catch(ArithmeticException e){
            System.out.println("UnsupportedOperationException");
        }
    }
}
