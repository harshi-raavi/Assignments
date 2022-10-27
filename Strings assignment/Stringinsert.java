 class Stringinsert {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("inserttext");
        s.insert(6, "-");
        System.out.println(s);
    }
}
