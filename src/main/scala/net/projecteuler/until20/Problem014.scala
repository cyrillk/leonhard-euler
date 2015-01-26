package net.projecteuler.until20

import net.projecteuler.AbstractProblem
import math._
import scala.annotation.tailrec

/**
 * Problem 14 - Longest Collatz sequence
 */
object Problem014 extends AbstractProblem {

  @tailrec
  private def find(num: Long, count: Long): Long = {
    num match {
      case 1 => count // exit rec
      case a if a % 2 == 0 => find(a / 2, count + 1)
      case b => find(b * 3 + 1, count + 1)
    }
  }

  override def result = {
    (1 until 1000000).map(n => (n, find(n, 1))).maxBy(_._2)._1
  }
}
