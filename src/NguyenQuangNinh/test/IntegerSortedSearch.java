package NguyenQuangNinh.test;
import java.util.*;

public class IntegerSortedSearch
{
    public static int[] sortSearch(int[] sortedArray, int lessThan)
    {
        List<Integer> ninhList = new ArrayList<Integer>();
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < sortedArray.length; i++) {
            hs.add(sortedArray[i]);
        }

        ninhList.addAll(hs);

        Collections.sort(ninhList, Collections.reverseOrder());

        ninhList.removeIf(item -> item >= lessThan);

        return convertIntegers(ninhList);
    }

    public static int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++)
        {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] results = IntegerSortedSearch.sortSearch(new int[] { 1, 2, 3, 1, 0, 0 ,0, 3 ,98, 98, 2, 2, 2, 0, 0, 0, 2 }, 4);
        for(int item : results) {
            System.out.print(item + " ");
        }
    }
}