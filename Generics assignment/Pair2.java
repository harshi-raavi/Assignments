import java.util.*;
    class Pair2<K,V> {
        String Key;
        String Value;

        public Pair2(String Key, String Value) {
            this.Key = Key;
            this.Value = Value;
        }

    }
    class Pair3{
        public static void main(String[] args){
                HashMap<String, String> map = new HashMap<>();
                map.put("Today is", "new java.util.Data()");
                System.out.println(map.get("Iterating HashMap..."));
                for(Map.Entry m: map.entrySet()){
                    System.out.println(m.getKey() + " : " + m.getValue());
                }
        }
    }


