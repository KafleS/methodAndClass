import java.security.Security;
import java.util.HashSet;
import java.util.Set;

public class findduplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,8,6,2,1,8,7};
        Set<Integer> uniquenumber = new HashSet<>();

        for ( int i = 0; i < arr.length-1; i++){
            if ( uniquenumber.contains(arr[i])){
                System.out.println(arr[i]);

            }
            else {
                uniquenumber.add(arr[i]);

            }

        }
    }
}
