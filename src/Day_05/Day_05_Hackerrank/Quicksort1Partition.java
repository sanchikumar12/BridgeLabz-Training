package Day_05.Day_05_Hackerrank;


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

class Quicksort1PartitionResult {

    /*
     * Complete the 'quickSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
    
    int p =arr.get(0);
    
    ArrayList<Integer> less= new ArrayList<>();
    ArrayList<Integer> great=new ArrayList<>();
    ArrayList<Integer> equal =new ArrayList<>();
    
    int i =0;
    
    while(i<arr.size()){
        int _cur =arr.get(i);
        
        if(_cur==p){
            equal.add(_cur);
        }else if(_cur>p){
            great.add(_cur);
        }else if(_cur<p){
            less.add(_cur);
        }
       i++;  
    }
    
    ArrayList<Integer> all =new ArrayList<>();
     all.addAll(less);
     all.addAll(equal);
     all.addAll(great);

       return all;
    }

}

public class Quicksort1Partition {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Quicksort1PartitionResult.quickSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
