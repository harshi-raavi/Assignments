public class Stringfun {
    public static void main(String[] args) {
        String s1="Java String pool refers to collection of Strings which are stored in heap memory";
        String s1Lower=s1.toLowerCase();
        System.out.println(s1Lower);
        String s1Upper=s1.toUpperCase();
        System.out.println(s1Upper);
        String replacing=s1.replace('a', '$');
        System.out.println(replacing);
        System.out.println(s1.contains("collection"));
        String str2="java string pool refers to collecton of strings which are stored in heap memory";
        System.out.println(s1.contains(str2));
        System.out.println(s1.equals(str2));

    }
}
