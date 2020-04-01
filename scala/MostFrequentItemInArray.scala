import scala.collection.mutable.HashMap

class MostFrequentItemInArray{

	def findMostFrequentItemInArray(inputArray: Array[Int]) = {
		var max_count = 1; var max_item = -1
		val dataSet = HashMap.empty[Int, Int]
		
		for(i <- inputArray){
			
			if(dataSet.contains(i))
				dataSet(i) += 1
			else
				dataSet(i) = 1
			
			
			if(dataSet(i) > max_count){
				max_count = dataSet(i)
				max_item = i
			}
			
		}
		max_item
	}

}


object MostFrequentItemInArray extends App{
	val mfi = new MostFrequentItemInArray
	val inputData = Array(1, 2, 3, 5, 4, 2, 1, 2)
	println(mfi.findMostFrequentItemInArray(inputData))
}