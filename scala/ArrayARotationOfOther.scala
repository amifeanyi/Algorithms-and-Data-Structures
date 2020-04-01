import scala.util.control.Breaks._

class ArrayARotationOfOther{

	def isRotationOfTheOther(array1: Array[Int], array2: Array[Int]): Boolean = {
		if (array1.length != array2.length)	false
		
		val item_i = array1(0); var key_i = -1; var j = -1
		
		breakable
		{
			for((item, index) <- array2.view.zipWithIndex)
				if(item == item_i){
					key_i = index
					break;
				}
		}
		
		if(key_i == -1) false
		
		for((item, index) <- array1.view.zipWithIndex){
			//calculate the index to resume from in the second array
			j = (key_i + index) % array1.length
			if(item != array2(j))
				return false 
		}
		true
		
	}

}



object ArrayARotationOfOther extends App{
	val ar = new ArrayARotationOfOther
	
	val array1 = Array(1, 2, 3, 4)
	val array2 = Array(2, 3, 4, 1)

	println(ar.isRotationOfTheOther(array1, array2))
	
}