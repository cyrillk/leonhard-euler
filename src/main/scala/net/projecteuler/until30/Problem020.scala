package net.projecteuler.until20

import net.projecteuler.AbstractProblem
import math._
import scala.annotation.tailrec

/**
 * Problem 20 - Factorial digit sum
 */
object Problem020 extends AbstractProblem {

  private def fact(num: Int): BigInt = (1 to num).toSeq.foldLeft(BigInt(1))((a, b) => a * b)

  override def result = fact(100).toString.toSeq.map(_.asDigit).sum
}
