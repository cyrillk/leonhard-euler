package net.projecteuler.until20

import net.projecteuler.AbstractProblem
import math._
import scala.annotation.tailrec

/**
 * Problem 16 - Power digit sum
 */
object Problem016 extends AbstractProblem {

  private lazy val Power = 1000

  override def result = {
    val q = BigInt(2).pow(Power).toString()
    q.toSeq.map(_.asDigit).sum
  }
}
