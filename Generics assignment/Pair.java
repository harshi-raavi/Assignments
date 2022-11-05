import java.util.*;
class Pair <K,V> {
    String Key;
    String Value;
    public Pair(String Key, String Value) {
        this.Key = Key;
        this.Value = Value;
    }
}
class Pair1{
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put("4","four");
        map.put("5","five");
        System.out.println(map.get("Iterating HashMap..."));
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
