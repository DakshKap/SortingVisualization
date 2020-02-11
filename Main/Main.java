package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		
    }
    public int[] generateArray(int size){
        int[] outputArray = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            outputArray[i] = rd.nextInt(); // storing random integers in an array
         }
        return outputArray;
    }
	
}
