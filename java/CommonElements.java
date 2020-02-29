import java.util.List;
import java.util.ArrayList;


public class CommonElements{

    public static int[] findCommonElements(int[] item1, int[] item2){
      List<Integer> result = new ArrayList<>();

      int p1 = 0; int p2 = 0;

      while(p1 < item1.length && p2 < item2.length){
          if(item1[p1] == item2[p2]){
            result.add(item1[p1]);
            p1 += 1;
            p2 += 1;
          }
          else if(item1[p1] > item2[p2])
              p2 += 1;
          else
              p1 += 1;
      }

      return result.stream().mapToInt(i -> i).toArray();

    }

    public static void main(String args[]){

      int[] item1 = {1, 3, 4, 6, 7, 9};
      int[] item2 = {1, 2, 4, 5, 9, 10};

      int[] result = findCommonElements(item1, item2);

      for(int i : result)
          System.out.println(i);

    }

}
