import java.util.Set;
import java.util.HashSet;

public class UniqueCharacter{


    public static boolean isUniqueByIteratiion(String text){
      if(text == null)  return false;

      for(int i = 0; i < text.length(); i++)
        for(int j = i + 1; j < text.length(); j++)
          if(text.charAt(i) == text.charAt(j))
               return false;
      return true;
    }

    public static boolean isUniqueUsingSet(String text){
      Set dataSet = new HashSet();
      if(text == null)  return false;

      for(int i = 0; i < text.length(); i++)
        dataSet.add(text.charAt(i));

      if(text.length() == dataSet.size()) return true;
      return false;
    }

    public static void main(String args[]){

      System.out.println(isUniqueByIteratiion(null));
      System.out.println(isUniqueByIteratiion(""));
      System.out.println(isUniqueByIteratiion("foo"));
      System.out.println(isUniqueByIteratiion("bar"));
      System.out.println("--------------------------------------------------------");
      System.out.println(isUniqueUsingSet(null));
      System.out.println(isUniqueUsingSet(""));
      System.out.println(isUniqueUsingSet("foo"));
      System.out.println(isUniqueUsingSet("bar"));

    }
}
