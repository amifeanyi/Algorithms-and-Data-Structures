import java.util.Map;
import java.util.HashMap;


public class FirstNonRepeatingCharacter{

    public static Object findFirstNonRepeatingCharater(String text){
      Map<Character, Integer> dataSet = new HashMap<>();

      for(char c : text.toCharArray()){
        if(dataSet.containsKey(c)){
          dataSet.put(c, dataSet.get(c) + 1);
        }
        else{
          dataSet.put(c, 1);
        }
      }


      for (Map.Entry<Character, Integer> entry : dataSet.entrySet()) {
        if(entry.getValue() == 1)
          return entry.getKey();
      }
      return null;
    }


    public static void main(String[] args) {
        String data = "ababc";
        System.out.println(findFirstNonRepeatingCharater(data));
    }
}
