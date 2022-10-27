import java.util.Scanner;

public class Armstrong {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            int n=sc.nextInt();
            int temp=n;
            int res=0;
            while(temp>0){
                int ld=temp%10;
                res=res+ld*ld*ld;
                temp=temp/10;
            }
            if(res == n){
                System.out.println("number is armstrong");
            }
            else{
                System.out.println("numbr is not armstrong");

            }
        }

    }

