package Algorithms;

public class VeryBigSum {
    static long aVeryBigSum(long[] ar) {
long arrSum = 0;

for(int i=0;i<ar.length;i++){
    arrSum = arrSum +ar[i];
}

return arrSum;
    }

    public static void main(String[] args) {
        System.out.println(1000000001);
        System.out.println(aVeryBigSum(new long[]{1000000001,1000000002,1000000003,1000000004,1000000005}));
    }
}
