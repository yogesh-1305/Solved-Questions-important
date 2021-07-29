fun main(){

    val queue = Queue<String>()
    queue.add("12")
    queue.add("13")
    
    println(queue.peek())
}

class Queue<T>() { 

    private val data = ArrayList<T>()
    
    fun add(record: T){
        this.data.add(record)
    }

    fun remove(): Any?{
        return if(this.data.isNotEmpty()){
            this.data.removeAt(0)
        }else{
            null
        }
    }

    fun peek(): Any?{
        return if (this.data.isNotEmpty()){
            this.data.get(0)
        }else{
            null
        }
    }

    fun length() : Int{
        return this.data.size.toInt()
    }
}