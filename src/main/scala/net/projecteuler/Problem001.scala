package net.projecteuler

object Problem001 extends AbstractProblem {

  override def result =
    (1 until 1000).foldLeft(0) {
      case (s, p) if (p % 3 == 0 || p % 5 == 0) => s + p 
      case (s, _) => s
    }
}
