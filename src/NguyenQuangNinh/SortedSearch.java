package NguyenQuangNinh;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        int start = 0;
        int end = sortedArray.length - 1;
        int mid = 0;
        while (start <= end && end - start > 5) {
            mid = (start + end) / 2;

            if (sortedArray[mid] >= lessThan) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        for(int i = start; i <= end; i++) {
            if(sortedArray[i] >= lessThan) {
                return i;
            }
        }

        if(sortedArray[start] >= lessThan) {
            return 0;
        } else {
            return end + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[]{5,6}, 4));
    }
}