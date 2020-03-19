package Main;

import javax.swing.JFrame;
import java.awt.Color;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
public class QuickSort {
    
    public int[] solution(int[] input){
        Draw.initialize();
        sort(input, 0, input.length-1);
        return input;
    }

    public void sort(int[] input, int low, int high){
        Draw.updateValues(input);
        if(high-low<1) return;
        int pivot = input[high];
        int lowest = low;
        for(int i=low;i<high;i++){
            if(input[i] <= pivot){
                int temp = input[lowest];
                input[lowest] = input[i];
                input[i] = temp;
                lowest++;
                Draw.updateValues(input);
            }
        }
        input[high] = input[lowest];
        input[lowest] = pivot;
        sort(input,low,lowest-1);
        sort(input,lowest,high);
    }
    
}