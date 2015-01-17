package net.projecteuler.until10

import net.projecteuler.AbstractProblem
import math._
import scala.annotation.tailrec

/**
 * Problem 7 - 10001st prime
 */
object Problem007 extends AbstractProblem {

  private def isPrime(p: Long): Boolean = {
    p match {
      case 0 => false // to catch 0
      case 2 => true // to catch 2
      case p if (p % 2 != 0) => // to catch odd numbers
        val root = ceil(sqrt(p)).toLong
          (3L to root).filter(s => p % s == 0).isEmpty
      case _ => false
    }
  }

  @tailrec
  private def calculate(current: Long, required: Long, num: Long): Long = {

    if (num > Long.MaxValue / 2) System.exit(0) // emergency exit

    isPrime(num) match {
      case true =>
        if (current >= required) num else calculate(current + 1, required, num + 1)
      case false =>
        calculate(current, required, num + 1)
    }
  }

  override def result = calculate(0L, 10001L, 0L)
}
