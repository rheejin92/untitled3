def fibonacci(size: Int): Array[Int] = {
  require(size >= 0, "Size should be non-negative")

  if (size == 0) {
   Array()
  } else if (size == 1) {
    Array(0)
  } else {
    val fibArray = new Array[Int](size)
    fibArray(0) = 0
    fibArray(1) = 1

    for (i <- 2 until size) {
      fibArray(i) = fibArray(i - 1) + fibArray(i - 2)
    }

    fibArray

  }
}

val size = 10 // 원하는 크기
val fibonacciArray = fibonacci(size)
println(s"Fibonacci 배열 ($size 크기) : ${fibonacciArray.mkString(",")}")