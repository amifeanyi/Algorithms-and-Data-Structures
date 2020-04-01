import scala.collection.mutable.Set

class UniqueCharacter{

	def isUnique(inputData: String): Boolean = {
		if(inputData == null) return false
		
		val dataSet = Set[Char]()
		
		for(c <- inputData.toCharArray())
			dataSet += c
		
		if(inputData.length() == dataSet.size) return true
		false
	}

}



object UniqueCharacter extends App{
	val uniqueCharacter = new UniqueCharacter
	
	println(uniqueCharacter.isUnique("java"))
	println(uniqueCharacter.isUnique("python"))
	println(uniqueCharacter.isUnique(null))
	
}