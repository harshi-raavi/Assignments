class Employee {
    String name;
    int salary;
    Employee()
    {
        name=null;
        salary=0;
    }
    Employee(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    int getSalary()
    {
        return salary;
    }
}
class Manager extends Employee{
    int hra,ta;
    Manager()
    {
        super();
        hra=ta=0;
    }
    Manager(String n,int sal,int h, int t){
        super(n,sal);
        hra=h;
        ta=t;
    }
    int getSalary()
    {
        return(super.getSalary()+hra+ta);
    }
}
class Labour extends Employee{
    int hra,ta;
    Labour()
    {
        super();
        hra=ta=0;
    }
    Labour(String n,int sal,int h,int t){
        super(n,sal);
        hra=h;
        ta=t;
    }
    int getSalary()
    {
        return(super.getSalary()+hra+ta);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Manager m1 = new Manager("harshi",20000,500,1500);
        Labour l = new Labour("sneha",10000,500,1000);
        System.out.println("slary of manager="+m1.getSalary());
        System.out.println("salary of labour"+l.getSalary());
    }
}
