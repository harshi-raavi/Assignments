
import java.lang.String;
import java.util.*;
class Contacts
{
    String name;
    String email;
    char gender;
    Contacts( String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class number
{
    int phno;
    number(int phno)
    {
        this.phno=phno;
    }

    @Override
    public String toString() {
        return "number{" +
                "phno=" + phno +
                '}';
    }
}
class Sortbyphno implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        return i2.compareTo(i1);
    }
}
class TreeExample
{
    public static void main(String[] args)
    {
        number n1=new number(647528916);
        number n2=new number(647528919);
        number n3=new number(647528915);
        Contacts c1=new Contacts("a","agmail.com",'f');
        Contacts c2=new Contacts("b","bgmail.com",'f');
        Contacts c3=new Contacts("c","cgmail.com",'f');
        TreeMap<number,Contacts> t1 = new TreeMap<number,Contacts>(new Sortbyphno());
        t1.put(n1,c1);
        t1.put(n2,c2);
        t1.put(n3,c3);
        System.out.println(t1);
        Set s1=t1.keySet();
        System.out.println(s1);
        Collection s2=t1.values();
        System.out.println(s2);
        Set s3=t1.entrySet();
        System.out.println(s3);
    }
}
