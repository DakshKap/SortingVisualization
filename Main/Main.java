package Main;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        CountingSort cs = new CountingSort();
        int[] input = generateArray(1000);
        //Bubble Sort
        System.out.println("---Bubble Sort----");
        long before = System.currentTimeMillis();
        bs.solution(input);
        long after = System.currentTimeMillis();
        calculateTime(before, after);
        //Merge Sort
        System.out.println("---Merge Sort----");
        before = System.currentTimeMillis();
        ms.solution(input);
        after = System.currentTimeMillis();
        calculateTime(before, after);
        //Quick Sort
        System.out.println("---Quick Sort----");
        before = System.currentTimeMillis();
        qs.solution(input);
        after = System.currentTimeMillis();
        calculateTime(before, after);
        //Counting Sort
        System.out.println("---Counting Sort----");
        before = System.currentTimeMillis();
        cs.solution(input);
        after = System.currentTimeMillis();
        calculateTime(before, after);

        // //Test
        // System.out.print("Input: ");
        // printArray(input);
        // int[] output = bs.solution(input);
        // System.out.print("Output: ");
        // printArray(output);
    }
    public static int[] generateArray(int size){
        int[] outputArray = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            outputArray[i] = rd.nextInt(); // storing random integers in an array
         }
        return outputArray;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +", ");
        }
        System.out.println(" ");
    }
    public static void calculateTime(long before, long after){
        System.out.println("Time spent: " + (after-before) +"ms");
    }
	
}
