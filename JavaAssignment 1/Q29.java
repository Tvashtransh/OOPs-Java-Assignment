import java.util.HashMap;
import java.util.Map;
public class Q29 {
}
// 29. Write a Java Program to Find Duplicate Elements in a 1D Array and Find Their Frequency of Occurrence

class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 2};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) { frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);}
        System.out.println("Duplicate elements and their frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) { System.out.println(entry.getKey() + " : " + entry.getValue()); } } } }
