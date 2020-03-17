package Main;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        CountingSort cs = new CountingSort();
        RadixSort rs = new RadixSort();
        int[] input = generateArray(1000);
        //int[] input = new int[]{89,55,57,54,12,51,54,93,55,6,26,45,79,99,40,84,67,78,5,6,57,14,56,56,25,11,10,35,83,65,11,12,84,92,45,58,49,38,39,4,40,12,29,91,18,85,13,65,65,100,46,47,100,58,42,38,1,54,87,8,66,9,8,28,68,86,25,17,91,91,23,51,75,38,99,24,69,93,11,14,56,42,28,41,18,92,83,85,66,42,13,71,7,49,100,12,74,65,58,25};
        //int[] input = new int[]{89,55,57,54,12,51,54,93,55,6,26,45};
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
        //Radix Sort
        System.out.println("---Radix Sort----");
        before = System.currentTimeMillis();
        rs.solution(input);
        after = System.currentTimeMillis();
        calculateTime(before, after);

        // //Test
        // System.out.print("Input: ");
        // printArray(input);
        // int[] output = bs.solution(input);
        // System.out.print("Output: ");
        //printArray(output);
    }
    public static int[] generateArray(int size){
        int[] outputArray = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            outputArray[i] = rd.nextInt(10000); // storing random integers in an array
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
