package Main;

public class QuickSort{
    public int[] solution(int[] input){
        sort(input, 0, input.length-1);
        return input;
    }

    public void sort(int[] input, int low, int high){
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

}