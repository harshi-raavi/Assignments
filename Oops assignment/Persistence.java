abstract class Persistence {
    abstract void persist();

}
class FilePersistence extends Persistence{
    void persist(){
        System.out.println("data is stored in files");
    }
}
class DatabasePersistence extends Persistence{
    void persist(){
        System.out.println("data is stored in databases");
    }
}
class Data
{
    public static void main(String args[]){
        FilePersistence f=new FilePersistence();
        DatabasePersistence d=new DatabasePersistence();
        f.persist();
        d.persist();
    }
}

