fun selectionSort(array: Array<Int>): Array<Int> {
	for(i in 0..array.size-1) {
		var minIndex = i
		for (j in i..array.size-1){
			if (array[j] < array[minIndex]) {
				minIndex = j
			}
		}
		
		if (i != minIndex){
			var temp = array[i]
			array[i] = array[minIndex]
			array[minIndex] = temp
		}
	}
	return array
}
