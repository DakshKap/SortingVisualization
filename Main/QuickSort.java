package Main;

public class QuickSort{
    public int[] solution(int[] input){
        if(input.length <= 1) return input;
        sortIt(input, 0,input.length-1);
        return input;
    }
    public void sortIt(int[] input, int low, int high){
        if(low == high || low>high) return;
        int pivot = input[(low+high)/2];
        int start = low;
        int end = high;
        while(start < end){
            if(input[start] == pivot ) start++;
            if(input[end] == pivot ) end--;
            if(input[start] > pivot && input[end] < pivot){
                int temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                start++;
                end++;
            }else if(input[start] > pivot){
                end--;
            }else if(input[end] < pivot){
                start++;
            }
        }
        sortIt(input, low, (low+high)/2);
        sortIt(input,(low+high)/2, high);
    }
}