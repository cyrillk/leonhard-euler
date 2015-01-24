package net.projecteuler.until20

import net.projecteuler.AbstractProblem
import math._
import scala.annotation.tailrec

/**
 * Problem 12 - Highly divisible triangular number
 */
object Problem012 extends AbstractProblem {

  private lazy val limit: Long = 500

  @tailrec
  private def find(a: Long, previousSum: Long): Long = {
    val next = previousSum + a
    val root = ceil(sqrt(next)).toLong
    val dels = (1L to root).filter(next % _ == 0)
    val nums = dels.map(next / _) ++ dels
    if (nums.distinct.length > limit) next else find(a + 1, next)
 }

  override def result = find(1, 0)
}
