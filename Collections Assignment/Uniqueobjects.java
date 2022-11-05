import java.util.*;
public class Uniqueobjects {
    public static void main(String args[])
    {
        HashSet<String> obj=new HashSet<>();
        obj.add("Book");
        obj.add("Table");
        obj.add("Chair");
        obj.add("Book");
        obj.add("pen");
        obj.add("Mobile");
        obj.add("Plank");
        obj.add("Spoon");
        obj.add("Cooker");
        obj.add("table");
        obj.add(" ");
        obj.add("Book");
        System.out.println(obj);


    }
}