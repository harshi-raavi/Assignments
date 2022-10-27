import java.util.Scanner;
public class Marks {
    public static void main(String[] args){
        int sub1,sub2,sub3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks of subject1 :");
        sub1=sc.nextInt();
        System.out.println("enter the marks of subject2 :");
        sub2=sc.nextInt();
        System.out.println("enter the marks of subject3 :");
        sub3=sc.nextInt();
        if(sub1>60 && sub2>60 && sub3>60){
            System.out.println("PASSED");

        }
        else if((sub1>60 && sub2>60) || (sub2>60 && sub3>60) || (sub1>60 && sub3>60)){
            System.out.println("PROMPTED");
        }
        else if(sub1>60 || sub2>60 || sub3>60 || (sub1<60&&sub2<60&&sub3<60)){
            System.out.println("FAILED");
        }
    }
}
