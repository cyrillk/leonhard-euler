package net.projecteuler

import scala.annotation.tailrec

/**
  * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
  * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? 
  */ 
object Problem005 extends AbstractProblem {

  @tailrec
  private def find(num: Long):Long = {

    if (num > Int.MaxValue) System.exit(0) // brakes on emergency

    (2 to 20) find(num % _ != 0) match {
      case Some(_) => find(num + 1)
      case None => num
    }
  }

  override def result = find(2)
}
