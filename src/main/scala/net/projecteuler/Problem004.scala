package net.projecteuler

import scala.annotation.tailrec

/**
  * A palindromic number reads the same both ways. The largest palindrome made from 
  * the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest palindrome 
  * made from the product of two 3-digit numbers.
  */ 
object Problem004 extends AbstractProblem {

  private def isPair(head: Char, last: Char): Boolean = {
    head == last
  }

  def polindrome(chars: Seq[Char]): Boolean = {
    if (chars.size == 2 || chars.size == 3)
      isPair(chars.head, chars.last)
    else if (isPair(chars.head, chars.last)) {
      polindrome(chars.drop(1).dropRight(1))
    } else 
      false
  }

  def pols(nums: Seq[Int]): Option[Int] = {
    nums.find {
      case n =>
        polindrome(n.toString.toSeq)
    }
  }

  import scala.collection.mutable.SetBuilder

  @tailrec
  def mults(a: Int, b: Int, s: SetBuilder[Int, Set[Int]]): Set[Int] = {

    if (b > 1) {
      mults(a, b - 1, s += a * b) // dec 2nd number
    } else if (a > 1) {
      mults(a - 1, a - 1, s += a * b) // dec 1st number
    } else {
      s.result // return set of multiplications
    }
  }

  override def result = {
    val m = mults(999, 999, new SetBuilder[Int, Set[Int]](Set()))
    pols(m.toSeq.sorted.reverse)
  }
}
