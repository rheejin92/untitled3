//- 2차원 행렬을 나타 내는 타입 Matrix 를 선언 하고, Matrix 의 곱셈을 표현 하는 operator 를 정의 해 보세요.
//- hint
//alias 에 대한 생성자
type Row = Array[Int]

case class Matrix(data: Array[Row]) {
  def * (other: Matrix) : Matrix = {
    val result = for {
      row <- data
    } yield for {
      col <- other.data.transpose
    } yield row zip col map { case (a,b) => a * b } sum

    Matrix(result.map(_.toArray))
  }
}

object Matrix {
  def apply(rows: Row*): Matrix = Matrix(rows.toArray)
}

val matrix1 = Matrix(
  Row(1,2),
  Row(3,4)
)

val matrix2 = Matrix(
  Row(5,6),
  Row(7,8)
)

val resultMatrix = matrix1 * matrix2

println("Matrix Multiplication Result:")
resultMatrix.data.foreach(row => println(row.mkString("")))





