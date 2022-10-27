public class Single {
    static Single st = new Single();

    private Single() {
        System.out.println("Constructor will invoke only or singletone");
    }

    static Single getInstance() {
        return st;

    }
}
    class Test
    {
        public static void main(String args[])
        {
            Single st1=Single.getInstance();
            Single st2=Single.getInstance();
            System.out.println(st1);
            System.out.println(st2);
        }
    }

