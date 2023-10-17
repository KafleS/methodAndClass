 import java.util.Scanner;
public class getfactorial {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("enter the number you want to get the factorial");

       int b = sc.nextInt();
      if ( b<= 1){
          System.out.println(1);}
          else{
          System.out.println((b-1));

          }

    }
}
