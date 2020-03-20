package Main;

import java.util.Arrays;

class MergeSort {
    int[] inputBase;
    
    public int[] solution(int[] input) {
        inputBase = Arrays.copyOf(input, input.length);
        //Draw.initialize("Merge Sort");
       // Draw.updateValues(inputBase);
        mergeSort(inputBase,0,inputBase.length-1);
        return inputBase;
    }
    public void mergeSort(int a[], int beg, int end) {
        int mid;
        if (beg < end) {
            mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    public void merge(int a[], int beg, int mid, int end) {
        int i = beg, j = mid + 1, k, index = beg;
        int temp[] = new int[a.length];
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp[index] = a[i];
                i = i + 1;
            } else {
                temp[index] = a[j];
                j = j + 1;
            }
            index++;
        }
        if (i > mid) {
            while (j <= end) {
                temp[index] = a[j];
                index++;
                j++;
            }
        } else {
            while (i <= mid) {
                temp[index] = a[i];
                index++;
                i++;
            }
        }
        k = beg;
        while (k < index) {
            a[k] = temp[k];
            //Draw.updateValues(inputBase);
            k++;
        }
    }

    // Old code using copy of arrays
    // public int[] solution(int[] input) {
    //     return sort(input);
    // }

    // public int[] sort(int[] input) {
    //     if (input.length == 1)
    //         return input;
    //     int pivot = input.length / 2;
    //     return merge(sort(Arrays.copyOfRange(input, 0, pivot)), sort(Arrays.copyOfRange(input, pivot, input.length)));
    // }

    // public int[] merge(int[] first, int[] second) {
    //     int fir = 0, sec = 0, out = 0;
    //     int[] output = new int[first.length + second.length];
    //     while (fir < first.length || sec < second.length) {
    //         if (fir >= first.length) {
    //             output[out] = second[sec];
    //             sec++;
    //             out++;
    //         } else if (sec >= second.length) {
    //             output[out] = first[fir];
    //             fir++;
    //             out++;
    //         } else {
    //             if (first[fir] < second[sec]) {
    //                 output[out] = first[fir];
    //                 fir++;
    //                 out++;
    //             } else {
    //                 output[out] = second[sec];
    //                 sec++;
    //                 out++;
    //             }
    //         }
    //     }
    //     return output;
    // }
}