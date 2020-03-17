package Main;

public class RadixSort{
    public int[] solution(int[] input){
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

        for(int i:input){
            int temp = i/exp;
            output[count[temp%10]-1] = i;
            count[temp%10]--;
        }
        for(int i=0;i<input.length;i++){
            input[i] = output[i];
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