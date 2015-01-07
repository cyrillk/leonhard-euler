package net.projecteuler

/**
  * Even Fibonacci numbers
  */
object Problem002 extends AbstractProblem {

  final val Limit = 4000000

  def fib(nums: Seq[Int]): Seq[Int] = {
    nums match {
      case Nil => fib(nums :+ 1)
      case 1 :: Nil => fib(nums :+ 1)
      case _ :+ a :+ b =>
        val next = a + b
        if (next < Limit)
          fib(nums :+ next)
        else
          nums
    }
  }

  override def result = fib(Seq()).filter(_ % 2 == 0).sum
}
