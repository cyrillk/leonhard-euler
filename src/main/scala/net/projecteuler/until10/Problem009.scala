package net.projecteuler.until10

import net.projecteuler.AbstractProblem
import math._

/**
  *  Problem 9 - Special Pythagorean triplet
  */
object Problem009 extends AbstractProblem {

  override def result = {
   val q = for {
      a <- 2 until 1000
      b <- a + 1 until 1000
      c = sqrt(a * a + b * b)
      if a + b + c == 1000
    } yield {
      (a * b * c).toInt
   }
   q.head
  }
}



