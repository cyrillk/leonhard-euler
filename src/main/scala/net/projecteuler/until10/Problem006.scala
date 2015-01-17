package net.projecteuler.until10

import net.projecteuler.AbstractProblem

import scala.annotation.tailrec

/**
  * Sum square difference
  */ 
object Problem006 extends AbstractProblem {

  private def calculate(range: Seq[Int]):Int = {
    val z = range zip range.map(Math.pow(_, 2).toInt)

    z.foldLeft((0,0)) {
      case (a, b) =>
        (a._1 + b._1, a._2 + b._2)
    } match {
      case (a, b) =>
        Math.pow(a, 2).toInt - b
    }
  }

  override def result = calculate((1 to 100))
}
