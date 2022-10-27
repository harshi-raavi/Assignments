public class Savings {
    String name;
    int money;

    Savings(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void fixeddeposite() {
        System.out.println("money deposite is " + money);
    }

    public int totalMoney() {
        return money;
    }
}
class Current {
    String name;
    int moneyc;

    Current(String name, int moneyc) {
        this.name = name;
        this.moneyc = moneyc;
    }

    public int cashcredit() {
        System.out.println("money credited is " + moneyc);
        return moneyc;
    }

    public int totalMoney() {
        return moneyc;
    }
}
class Bank2{
    public static void main(String[] args){
        Savings s=new Savings("ha" , 100);
        s.fixeddeposite();
        int p=s.totalMoney();
        Current c=new Current("va" , 3000);
        c.cashcredit();
        int d=c.totalMoney();
        int y=p+d;
        System.out.println("total money in the bank is" +y);
    }
}
