import java.util.Scanner;
public class Tmarksavg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double avg=0.0;
        System.out.println("Enter 3 sub marks");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        avg=(a+b+c)/3;
        System.out.println("avg = "+avg);
    }
}
