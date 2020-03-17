package Main;

import javax.swing.JFrame;
import java.awt.Color;
public class QuickSort {
    JFrame frame = new JFrame("Quick Sort");
    Draw draw = new Draw();
    public int[] solution(int[] input){
        sort(input, 0, input.length-1);
        return input;
    }

    public void sort(int[] input, int low, int high){
        paintArray(input);
        if(high-low<1) return;
        int pivot = input[high];
        int lowest = low;
        for(int i=low;i<high;i++){
            if(input[i] <= pivot){
                int temp = input[lowest];
                input[lowest] = input[i];
                input[i] = temp;
                lowest++;
            }
        }
        input[high] = input[lowest];
        input[lowest] = pivot;
        sort(input,low,lowest-1);
        sort(input,lowest,high);
    }
    public void paintArray(int[] input){
        frame.setVisible(true);
        frame.setSize(620, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw.setBackground(Color.BLACK);
        draw.values = input;
        frame.add(draw);
        draw.drawing();
    }

}