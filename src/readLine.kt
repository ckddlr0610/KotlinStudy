fun main(args:Array<String>){

    /**
     * 데이터가 문자 하나인 경우
     */
    print("Enter name: ")
    var name = readLine() // 반드시 String값으로 입력받는다
    var age = 24
    var job : String?
    job = "Student"
    println("name:"+name)
    println("age:"+age)
    println("job:"+job)

    /**
     * 데이터를 숫자로 받는 경우
     */
    print("Enter Integer:")
    var i : Int = readLine()!!.toInt()
    print("Enter Double:")
    var d : Double = readLine()!!.toDouble()
    println(i+d)

    /**
     * 여러 변수를 입력받는 경우
     */
    print("Enter size:")
    var size:Int = readLine()!!.toInt()
    var array=  Array<Int>(size) { readLine()!!.toInt()}
    var sum = 0
    for(item in array) {
        sum += item
    }
    print("Sum : $sum")
}

