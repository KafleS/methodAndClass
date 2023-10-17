import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap fun = new HashMap();
        fun.put("bobby", "@123");
        fun.put("suman", " kafle");
        fun.put("himal", "pandey");
        fun.remove("suman");
        System.out.println(fun);
        System.out.println(fun.containsKey("himal"));
        System.out.println(fun.size());
    }
}
