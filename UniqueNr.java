package Codewars;

import java.util.Arrays;

public class UniqueNr {
    public static double findUniq(double arr[]){
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}
