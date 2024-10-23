public class Main {


    public static void main(String[] args) {

        //Question :  Find Largest Element in an Array: Write a program to find the largest element in a given integer array.

        int[] arr = {1,45,88,45,78,12,20};
        System.out.println(largestElementInArray(arr));
    }

    private static int largestElementInArray(int[] arr) {

        int length = arr.length;

        int max = arr[0];
        // here we will iterate over the array one by one
        for (int i =0 ; i < length-1 ; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
