public class Main {


    public static void main(String[] args) {

        //Question :  Find Largest Element in an Array: Write a program to find the largest element in a given integer array.

        int[] arr = {45,88,45,78,12,20};
        System.out.println(largestElementInArray(arr));
    }


    //I am  creating this method to find the largest element in a given array 
    private static int largestElementInArray(int[] arr) {

        //This variable will store the length of the array
        int length = arr.length;

        //here I am creating a variable max which initially store the Min value
        int max = Integer.MIN_VALUE;

        // here we will iterate over the array one by one
        for (int i =0 ; i < length-1 ; i++){


          //Here we are iterating over the array and comparing each element of the array 
            if(arr[i] > max)
                max = arr[i];

        }

        return max;
    }
}
