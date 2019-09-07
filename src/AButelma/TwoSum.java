/* 4) TWO SUM
 * Write a function that, when passed a list and a target sum, returns two distinct zero-based 
 * indices of any two of the numbers, whose sum is equal to the target sum. If there are no two
 * numbers, the function should return null.

For example, findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10) should return a single dimensional 
array with two elements and contain any of the following pairs of indices:

0 and 3 (or 3 and 0) as 3 + 7 = 10
1 and 5 (or 5 and 1) as 1 + 9 = 10
2 and 4 (or 4 and 2) as 5 + 5 = 10	*/

package AButelma;

import java.util.HashMap;

//SOLUCI� CON HASHMAP, SOLUCI� CON O(N), AUNQUE USA EL M�ODO containsKey() de la clase HashMap
//el cual supongo repasa toda la lista de keys, con lo cual creo que igual es O(N2)

public class TwoSum {
 public static int[] findTwoSum(int[] list, int sum) {
    
    HashMap<Integer,Integer> map= new HashMap<>();
    for (int i=0;i<list.length;i++){

        map.put(list[i],i);
    }


    for (int i=0;i<list.length;i++){
        int complement=sum-list[i];
        if(map.containsKey(complement)&&map.get(complement)!=i){
            return new int[] {i,map.get(complement)};

        }
    }
     
    return null;

 }

 public static void main(String[] args) {
     int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
     if(indices != null) {
         System.out.println(indices[0] + " " + indices[1]);
     }
 }
}

//SOLUCI� CON LOOPS ANIDADOS, O(N^2):

/*
public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        boolean found = false;
        int i = 0, j = 1;
        int[] indices = null;
        
        while (!found && i < list.length) {
            
            while (!found && j < list.length) {
                if (list[i] + list[j] == sum) {
                    indices = new int[] {i, j};
                    found = true;
                }
                
                j++;
            }
           
            i++;
            j = i + 1;
        }
        
        return indices;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
} */

