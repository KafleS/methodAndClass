import java.util.Scanner;

public class Midtermpractise {


    public static int facto( int n){
        if ( n<=1 ){
            return  1;
        }
        return facto(n-1)*n;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        while(str!="EXIT") {
            int n = sc.nextInt();
            System.out.println(facto( n));

        }
    }
}
