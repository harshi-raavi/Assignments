import java.util.Scanner;

public class Tax {
    public Tax() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("enter your age");
        int var2 = var1.nextInt();
        System.out.println("enter your gender[m/f]:");
        char var3 = var1.next().charAt(0);
        if (var3 != 'f' && var3 != 'F') {
            if (var3 != 'm' && var3 != 'M') {
                System.out.println("invalid gender");
            } else if (var2 > 65) {
                System.out.println("wrong category");
            } else {
                System.out.println("enter your income:");
                double var4 = var1.nextDouble();
                double var6;
                if (var4 <= 180000.0D) {
                    var6 = 0.0D;
                } else if (var4 > 181001.0D && var4 <= 300000.0D) {
                    var6 = (var4 - 181001.0D) * 0.1D;
                } else if (var4 > 300001.0D && var4 <= 500000.0D) {
                    var6 = (var4 - 300001.0D) * 0.2D;
                    var6 += 34000.0D;
                } else {
                    var6 = (var4 - 1000000.0D) * 0.3D;
                    var6 += 94000.0D;
                }

                System.out.println("\nincome tax is Invalid");
            }
        } else {
            System.out.println("wrong category");
        }

    }
}
