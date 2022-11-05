import java.util.HashSet;
import java.util.Iterator;

public class Employees {
  int id;
  String name;
  Float salary;
  String department;
  public Employees(int id,String name, float salary,String department) {
    this.id=id;
    this.name=name;
    this.salary=salary;
    this.department=department;
  }
  public int hashCode(){
      return id;
  }
 public boolean equals(Object obj) {
     Employees employees = (Employees) obj;
 return (id == employees.id);
  }
 public String toString() { return id+ "," + name+","+salary+","+department;}
}
class MainClass{
    public static void main(String[] args) {
        HashSet<Employees> Set = new HashSet<>();
        Set.add(new Employees(1, "harshi", 10000, "sales"));
        Set.add(new Employees(2, "varshi", 20000, "developer"));
        Set.add(new Employees(3, "bhagyam", 10000, "marketing"));
        Iterator<Employees> itr = Set.iterator();
        {
            while (itr.hasNext()) {
                Employees employee = (Employees) itr.next();
                System.out.println(employee.toString());
            }
        }
    }
}

