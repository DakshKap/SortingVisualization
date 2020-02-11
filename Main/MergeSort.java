package Main;

import java.util.Arrays;

class MergeSort{
    public int[] solution(int[] input){  
        return sort(input);
    }
    public int[] sort(int[] input){
        if(input.length == 1) return input;
        int pivot = input.length/2;
        return merge( sort(Arrays.copyOfRange(input, 0, pivot)), sort(Arrays.copyOfRange(input, pivot, input.length)));
    }

    public int[] merge(int[] first, int[] second){
        int fir = 0, sec = 0, out=0;
        int[] output = new int[first.length + second.length];
        while(fir<first.length || sec<second.length){
            if(fir>=first.length){
                output[out] = second[sec];
                sec++;
                out++;
            }else if(sec>=second.length){
                output[out] = first[fir];
                fir++;
                out++;
            }else{
                if(first[fir]<second[sec]){
                    output[out] = first[fir];
                    fir++;
                    out++;
                }else{
                    output[out] = second[sec];
                    sec++;
                    out++;
                }
            }
        }
        return output;
    }
}