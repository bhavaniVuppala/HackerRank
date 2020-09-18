package Algorithms;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PlusMinus {
    static void plusMinus(int[] arr) {

        Double posNum =0.0;
        Double negNum =0.0;
        Double zeros = 0.0;
        int arrSize =  arr.length;

        DecimalFormat df = new DecimalFormat("#.######");

for(int i=0;i<arrSize;i++){
    if(arr[i]<0){
        negNum++;
    }else if(arr[i]==0){
        zeros++;
    }else {
        posNum++;
    }

}
        System.out.printf("%8.6f", (posNum/arrSize));
        System.out.println("");
        System.out.printf("%8.6f",(negNum/arrSize));
        System.out.println("");
        System.out.printf("%8.6f",(zeros/arrSize));

    }

    public static void main(String[] args) {
        int[] arr = new int[]{-4,3,-9,0,4,1};
        plusMinus(arr);
    }
}
