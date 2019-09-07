package AButelma;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
 
        int i = sortedArray.length - 1;
        
        while (sortedArray[i] > lessThan && i > 0) {
            
            i--;
        }
        
        return i + 1;
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}
