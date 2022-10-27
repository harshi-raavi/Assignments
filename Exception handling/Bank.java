public class Bank {
    double balance;

    public Bank() {
        balance = 0; //account with zero balance
    }

    public Bank(double intialbalance) {
        balance = intialbalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) throws IllegalAccessError {
        if (amount < 0) {
            throw new IllegalAccessError("Amount is under zero");
        }
        balance = balance - amount;
    }

    public double getbalance() {
        return balance;

    }



        public static void main(String[] args){
            Bank checking=new Bank();
            checking.deposit(2000);
            checking.withdraw(-1000);
            System.out.println(checking.getbalance());
        }

}
