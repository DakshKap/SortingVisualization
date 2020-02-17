package Main;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        int[] input = new int[]{5,1,1,2,0,0};
        //int[] input = generateArray(10);
        System.out.println("Input: ");
        printArray(input);
        int[] output = qs.solution(input);
        System.out.print("Output: ");
        printArray(output);
    }
    public static int[] generateArray(int size){
        int[] outputArray = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            outputArray[i] = rd.nextInt(50); // storing random integers in an array
         }
        return outputArray;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +", ");
        }
        System.out.println(" ");
    }
	
}
