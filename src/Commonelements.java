import java.util.*;

public class Commonelements {
    public static void main(String[] args) {
        int [] arr1 = {1,5,10,20,40,80};
        int  [] arr2 = {6,7,20,80,85};
        int [] arr3 = {3,5,20,30,9,80,100};

        Set<int[]> arr4 = new HashSet();
        arr4.add(arr1);
        System.out.println(arr4);



    }
}
