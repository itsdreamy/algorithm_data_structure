package Basic;

public class SumofArray {
    public static int arraysum(int[] arr, int n) {
        if (n < 0) {
            return 0;
        } else
            return arraysum(arr, n - 1) + arr[n - 1];   
    }

    // public static int arraysum(int[] arr, int index) {
    //     if (index == arr.length) {
    //         return 0;
    //     } else
    //         return arr[index] + arraysum( arr, index + 1);   
    // }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 5, 7, 10 };
        System.out.println("The sum of the Array is " + arraysum(arr, arr.length));
        // System.out.println("The sum of the Array is " + arraysum(arr, 0));
    }
}
