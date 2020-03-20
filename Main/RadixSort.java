package Main;

public class RadixSort {
    
    public int[] solution(int[] input){
        // Draw.initialize("Radix Sort");
        // Draw.updateValues(input);
        int digCount = getMax(input);
        int exp = 1;
        for(int i=0;i<digCount;i++){
            countSort(input, exp);
            exp *= 10;
           
        } 
        return input; 
    }
    public void countSort(int[] input,int exp){
        int[] count = new int[10];
        int[] output = new int[input.length];
        for(int i:input){
            count[(i/exp)%10]++;
        }
        for(int i=1;i<10;i++)
            count[i] += count[i-1];

        for(int i=input.length-1;i>=0;i--){
            int temp = (input[i]/exp)%10;
            output[count[temp]-1] = input[i];
            count[temp]--;
        }
        for(int i=0;i<input.length;i++){
            input[i] = output[i];
           // Draw.updateValues(input);
        }
    }
    public int getMax(int[] input){
        int max = input[0];
        for(int i:input){
            if(i>max)
                max = i;
        }
        int digCount = 0;
        while(max != 0){
            max = max/10;
            digCount++;
        }
        return digCount;
    }
}