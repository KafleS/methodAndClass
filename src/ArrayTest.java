public class ArrayTest {
    public static int foo(int a, int[] vals){
        int c = a/10;
        int b = vals[c]% vals.length;

        System.out.println("foo: "+vals[b]+", a = "+a+"b= "+b);
        vals [b] -= a;
        return c;
    }

    public static void main(String[] args) {
        int a = 12 ;
         int b = 8;
         int    c = -1;
         int [] arr = { 19, 28,37,46,50};

         c = foo(a, arr);
        System.out.println("A: " +a+ ","+c);

         c = foo(b, arr);
        System.out.println("B: " +b+","+c);

         for (int i = 0; i< arr.length; i++){
             System.out.println("arr["+i+"] = "+arr[i]);
         }
    }
}
