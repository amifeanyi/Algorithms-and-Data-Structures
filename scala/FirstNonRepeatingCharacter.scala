import scala.collection.mutable.LinkedHashMap

class FirstNonRepeatingCharacter{
	
	def findFirstNonRepeatingCharacter(text: String) = {
		val dataSet = LinkedHashMap.empty[Char, Int]
		
		for(c <- text){
			if(dataSet.contains(c))
				dataSet(c) = dataSet(c) + 1
			else
				dataSet(c) = 0
		}
		
		val res = for((k, v) <- dataSet; n = k; if (v == 0) )	 
		yield n
		
		if (!res.isEmpty) res.head
	}
	
}

object FirstNonRepeatingCharacter {
	
	def main(args: Array[String]): Unit = {
		val fnrChar = new FirstNonRepeatingCharacter()
		
		if(args.length != 0)
			println(fnrChar.findFirstNonRepeatingCharacter(args(0)))
		else	
			println(fnrChar.findFirstNonRepeatingCharacter("ababc"))
	}
}