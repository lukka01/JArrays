// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        print(arr);
//        minAndMax(arr);
//        minAndMax(new int[] {1, 10, 25, -13, 1000});
        int[] inArr = invert(arr);
        print(inArr);




    }

   public static void print(int[] arr) {
       for (int i : arr) {
           System.out.print(i + " ");
       }
   }

   public static void minAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(min > arr[i+1]) min = arr[i+1];
            if(max < arr[i+1]) max = arr[i+1];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
   }

   public static int[] invert (int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
           arr2[i] = arr[arr.length-1-i];
        }
        return arr2;
   }





//    public static void invert (int[] arr) {
//        int length = arr.length;
//        int[] temp = new int[length];
//       for (int i = 0; i < arr.length; i++) {
//           temp[i] = arr[length - 1 -i];
//           System.out.print(temp[i] + " ");
//       }
//    }
//    public static void invert2(int[] arr) {
//        for (int i = 0; i < arr.length/2; i++ ) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//    }




}