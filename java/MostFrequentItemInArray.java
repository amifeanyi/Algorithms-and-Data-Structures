import java.util.Map;
import java.util.HashMap;

public class MostFrequentItemInArray{

    public static int mostFrequent(int[] items){
        int max_count = 1; int max_item = -1;
        Map<Integer, Integer> count = new HashMap<>();

        for(int i : items){
          if(count.containsKey(i))
            count.put(i, count.get(i) + 1);
          else
            count.put(i, 1);

          if(count.get(i) > max_count){
            max_count = count.get(i);
            max_item = i;
          }

        }

        return max_item;
    }

    public static void main(String args[]){
      int[] items = {1, 2, 3, 5, 4, 1, 2, 4};
      System.out.println(mostFrequent(items));
    }

}
