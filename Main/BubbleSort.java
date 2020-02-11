package Main;

public class BubbleSort{

    public int[] solution(int[] input){
        int swaps = -1;
        while(swaps != 0){
            swaps = 0;
            for(int i=0;i<input.length-1;i++){
                if(input[i] > input[i+1]){
                    int temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                    swaps++;
                }
            }
        }
        return input;
    }
}