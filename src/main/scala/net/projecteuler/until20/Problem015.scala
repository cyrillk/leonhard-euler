package net.projecteuler.until20

import net.projecteuler.AbstractProblem
import math._
import scala.annotation.tailrec

/**
 * Problem 15 - Lattice paths
 *
 * Solved with a combinatorics formula
 */
object Problem015 extends AbstractProblem {

  private def fact(num: Int): BigInt = (1 to num).toSeq.foldLeft(BigInt(1))((a, b) => a * b)

  private def calc(n: Int, r: Int): BigInt = fact(n) / (fact(r) * fact(n - r))

  override def result = calc(40, 20)
}
