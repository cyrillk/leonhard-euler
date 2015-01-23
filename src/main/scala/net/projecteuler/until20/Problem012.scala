package net.projecteuler.until20

import net.projecteuler.AbstractProblem
import math._
import scala.annotation.tailrec

/**
 * Problem 12 - Highly divisible triangular number
 */
object Problem012 extends AbstractProblem {

  private lazy val limit: Long = 500

  private def middle(x: Long) = math.ceil(x.toDouble / 2).toLong

  @tailrec
  private def find(a: Long, previousSum: Long = 0): Long = {
    val b = previousSum + a // (1L to a).sum

    if (b % 2 == 0) {
      val n = ((1L to middle(b)) :+ b).count(b % _ == 0)
      if (n > limit) b else find(a + 1, b)
    } else {
      find(a + 1)
    }
  }

  override def result = find(1)
}
