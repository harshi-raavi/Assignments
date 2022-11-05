package Handson;

import java.util.*;
import java.lang.*;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
    String os();
}
@Test(os="it is a testcase")
class Annotationexa
{
    String mode;
    Annotationexa(String mode)
    {
        this.mode= mode;
    }
}
public class Annotation1
{
    public static void main(String args[]) throws Exception
    {
        Annotationexa n=new Annotationexa("test case annotation");
        Class c=n.getClass();
        Annotation o=c.getAnnotation(Test.class);
        Test s=(Test)o;
        System.out.println(s.os());
    }
}
