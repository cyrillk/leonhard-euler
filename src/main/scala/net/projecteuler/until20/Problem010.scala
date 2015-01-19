package net.projecteuler.until20

import net.projecteuler.AbstractProblem
import math._
import scala.annotation.tailrec

/**
 * Problem 10 - Summation of primes
 */
object Problem010 extends AbstractProblem {

  private def isPrime(p: Long): Boolean = {
    p match {
      case 2 => true // to catch 2
      case p if (p % 2 != 0) => // to catch odd numbers
        val root = ceil(sqrt(p)).toLong
        (3L to root).filter(s => p % s == 0).isEmpty
      case _ => false
    }
  }

  private final def Limit = 2000000L

  override def result = (2L until Limit).foldLeft(0L){
    case (a, b) if (isPrime(b)) => a + b
    case (a, _) => a
  }
}
