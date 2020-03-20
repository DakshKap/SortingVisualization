package Main;

import java.util.Map;
import java.util.TreeMap;

public class CountingSort{
    public int[] solution(int[] input){
        // Draw.initialize("Counting Sort");
        // Draw.updateValues(input);
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for(int i:input){
            if(countMap.containsKey(i)){
                int temp = countMap.get(i)+1;
                countMap.replace(i,temp);
            }else{
                countMap.put(i,1);
            }
        }
        int currIndex = 0;
        while(countMap.size()>0){
            Map.Entry<Integer,Integer> obj = countMap.pollFirstEntry();
            int temp = (int) obj.getKey();
            int tempIndex = (int) obj.getValue();
            for(int i=currIndex;i<currIndex+tempIndex;i++){
                input[i] = temp;
                // Draw.updateValues(input);
            }
            currIndex += tempIndex;
        }
        return input;
    }
}