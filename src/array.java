public class array {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6,7};
        int sum = 9;
         int lowerValue = 0;
         int higherValue = arr.length-1;

         while( lowerValue< higherValue){
             if ( (arr[lowerValue]+arr[higherValue])<sum){
                 lowerValue++;
             }
             else if ((arr[lowerValue]+arr[higherValue])> sum){
                 higherValue--;
             }
             else if (( arr[lowerValue]+arr[higherValue])== sum){
                 System.out.println(arr[lowerValue]+","+arr[higherValue]);
                 lowerValue++;
                 higherValue--;
             }
         }
    }
}
