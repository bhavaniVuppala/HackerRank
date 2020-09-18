package Algorithms;


import java.util.ArrayList;
import java.util.List;
import java.io.*;

import java.util.stream.*;

import static java.util.stream.Collectors.toList;


public class DiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diff =0;
        int LRdiff = 0;
        int RLdiff =0;
        int arrSize = arr.size();
        System.out.println(arrSize);

        for(int i=0;i<arrSize;i++){
        LRdiff = LRdiff + arr.get(i).get(i);

        }
        for(int j=0;j<arrSize;j++){
            RLdiff = RLdiff+arr.get(j).get((arrSize-1)-j);
        }

        diff = LRdiff-RLdiff;
        if(diff<0){
diff = -diff;
        }
return diff;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);
        System.out.println("result"+result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
