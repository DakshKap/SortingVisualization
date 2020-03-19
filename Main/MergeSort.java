package Main;

import java.util.Arrays;

class MergeSort{
    int[] inputBase;
    public int[] solution(int[] input){  
        //Draw.initialize("Merge Sort");
        inputBase = Arrays.copyOf(input, input.length);
        //Draw.updateValues(inputBase);
        return sortUpdated(input,0,input.length);
    }
    
    public int[] sortUpdated(int[] input, int start, int end){
        if(end-start == 1) return input;
        int pivot = (start+end)/2;
        return mergeUpdated( sortUpdated(input, start, pivot) , sortUpdated(input, pivot+1, end),start,pivot,pivot+1,end);
    }

    public int[] mergeUpdated(int[] first, int[] second,int fStart, int fEnd,int sStart, int sEnd){
        //Draw.updateValues(inputBase);
        int fir = fStart, sec = sStart, out=0;
        int[] output = new int[(fEnd-fStart) + (sEnd-sStart)+2];
        while(fir<=fEnd || sec<=sEnd){
            if(fir>fEnd){
               
                inputBase[sec] = second[sec];
                output[out] = second[sec];
                sec++;
                out++;
               // Draw.updateValues(inputBase);
            }else if(sec>sEnd){
                inputBase[fir] = first[fir];
                output[out] = first[fir];
                fir++;
                out++;
               // Draw.updateValues(inputBase);
            }else{
                if(first[fir]<second[sec]){
                    
                    inputBase[fir] = first[fir];
                    output[out] = first[fir];
                    fir++;
                    out++;
                    //Draw.updateValues(inputBase);
                }else{
                    inputBase[sec] = second[sec];
                    output[out] = second[sec];
                    sec++;
                    out++;
                    //Draw.updateValues(inputBase);
                }
            }
        }
        return output;
    }

    public int[] sort(int[] input){
        if(input.length == 1) return input;
        int pivot = input.length/2;
        return merge( sort(Arrays.copyOfRange(input, 0, pivot)) , sort(Arrays.copyOfRange(input, pivot, input.length)));
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