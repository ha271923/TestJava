package NguyenQuangNinh;

import java.util.Arrays;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        if(list.length == 0) {
            return null;
        }

        if(list.length == 1) {
            return null;
        }

        Arrays.sort(list);


        int i = 0;
        int j = list.length -1;

        while ( i < j) {
            if(list[i] + list[j] < sum) {
                i++;
            } else if( list[i] + list[j] > sum){
                j--;
            } else {
                return new int[]{i,j};
            }
        }


        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 9, 5, 7, 3 }, 12);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}