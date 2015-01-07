package net.projecteuler

import math._

/**
  * The prime factors of 13195 are 5, 7, 13 and 29.
  * What is the largest prime factor of the number 600851475143 ?
  */
object Problem003 extends AbstractProblem {

  final lazy val Num: Long  = 600851475143L // 13195L

  def primes = {

    val maxFactor = ceil(sqrt(Num)).toInt

    println("Max possible factor: " + maxFactor)

    (3 until maxFactor).collect {
      case p if (p % 2 != 0) =>
        val root = ceil(sqrt(p)).toInt
        val factors = (3 to root).filter(s => p % s == 0)
        if (factors.isEmpty) Some(p) else None
    }.collect {
      case Some(n) => n
    }
  }

  def calc(localPrimes: Seq[Int]) = {
    localPrimes.reverse.maxBy(s => Num % s == 0)
  }

  override def result = calc(primes)
}
