public class Stringappend {
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer("StringBuffer");
        String str=new String(" is a peel class of string");
        sbf.append(str);
        System.out.println("Result after appending = " +sbf);
        sbf=new StringBuffer("that provides much of");
        str=new String(" the functionality of strings");
                sbf.append(str);
        System.out.println("Result after appending = " +sbf);
    }
}
