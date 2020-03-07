import java.util.Set;
import java.util.HashSet;

public class SumOfTwo{

	private static boolean isSumOfTwo(int[] items1, int[] items2, int targetValue){
		Set<Integer> compliments = null;
		
		if(items1.length < items2.length){
			compliments = buildCompliments(items1, targetValue);
			for(int i : items2)
				if(compliments.contains(i))
					return true;
		}
		else{
			compliments = buildCompliments(items2, targetValue);	
			for(int i : items1)
				if(compliments.contains(i))
					return true;
		}
		
		
		return false;
			
	}
	
	private static Set<Integer> buildCompliments(int[] items, int targetValue){
		Set<Integer> compliments = new HashSet<>();
		for(int i : items)
			compliments.add(targetValue - i);
		return compliments;
	}
	
	public static void main(String args[]){
		int[] items1 = {0, -19, 3, 10000, 78};
		int[] items2 = {99, 10, 9283, 32, 0, 11};
		
		System.out.print("[");
		for(int i : items1)
			System.out.print(i + ",");
		System.out.println("]");
		
		System.out.print("[");
		for(int i : items2)
			System.out.print(i + ",");
		System.out.println("]");
		
		System.out.println("Sum of two: " + isSumOfTwo(items1, items2, -19));
	}
	

}

