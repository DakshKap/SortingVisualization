package Main;

class SelectionSort{
    public int[] solution(int[] input){
        Draw.initialize("Selection Sort");
        Draw.updateValues(input);
        int currIndex = 0, sIndex=0;
        while(currIndex < input.length){
            int min = input[currIndex];
            for(int i=currIndex;i<input.length;i++){
                if(min>input[i]){
                    sIndex = i;
                    min = input[i];
                }
            }
            input[sIndex] = input[currIndex];
            input[currIndex] = min;
            Draw.updateValues(input);
            currIndex++;
            sIndex = currIndex;
        }
        return input;
    }
}