package Algorithms;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

List<Integer> scoreList = new ArrayList<>();
int aScore =0;
int bScore =0;

for(int i=0;i<a.size();i++){
    if(a.get(i)>b.get(i)){
        aScore++;
    }else if(b.get(i)>a.get(i)){
        bScore++;
    }
}
scoreList.add(aScore);
scoreList.add(bScore);
        return scoreList;

    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);
        b.add(99);
        b.add(16);
        b.add(8);
        List<Integer> c =compareTriplets(a,b);

        for(int d : c){
            System.out.println(d);
        }
    }
}
