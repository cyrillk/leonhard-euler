package net.projecteuler.until20

import net.projecteuler.AbstractProblem
import math._
import scala.annotation.tailrec

/**
  * Problem 17 - Number letter counts
  * 
  * Brute Force Solution )
 */
object Problem017 extends AbstractProblem {

  private def count(num: Int, prefix: String = ""): String = {
    val s = num match {
      case 1 => prefix + "one"
      case 2 => prefix + "two"
      case 3 => prefix + "three"
      case 4 => prefix + "four"
      case 5 => prefix + "five"
      case 6 => prefix + "six"
      case 7 => prefix + "seven"
      case 8 => prefix + "eight"
      case 9 => prefix + "nine"
      // ..
      case 10 => prefix + "ten"
      case 11 => prefix + "eleven"
      case 12 => prefix + "twelve"
      case 13 => prefix + "thirteen"
      case 14 => prefix + "fourteen"
      case 15 => prefix + "fifteen"
      case 16 => prefix + "sixteen"
      case 17 => prefix + "seventeen"
      case 18 => prefix + "eighteen"
      case 19 => prefix + "nineteen"
      // ..
      case _ if (num / 10 == 2) => prefix + "twenty" + count(num % 10)
      case _ if (num / 10 == 3) => prefix + "thirty" + count(num % 10)
      case _ if (num / 10 == 4) => prefix + "forty" + count(num % 10)
      case _ if (num / 10 == 5) => prefix + "fifty" + count(num % 10)
      case _ if (num / 10 == 6) => prefix + "sixty" + count(num % 10)
      case _ if (num / 10 == 7) => prefix + "seventy" + count(num % 10)
      case _ if (num / 10 == 8) => prefix + "eighty" + count(num % 10)
      case _ if (num / 10 == 9) => prefix + "ninety" + count(num % 10)
      // ..
      case _ if (num / 100 == 1) => "onehundred" + count(num % 100, "and")
      case _ if (num / 100 == 2) => "twohundred" + count(num % 100, "and")
      case _ if (num / 100 == 3) => "threehundred" + count(num % 100, "and")
      case _ if (num / 100 == 4) => "fourhundred" + count(num % 100, "and")
      case _ if (num / 100 == 5) => "fivehundred" + count(num % 100, "and")
      case _ if (num / 100 == 6) => "sixhundred" + count(num % 100, "and")
      case _ if (num / 100 == 7) => "sevenhundred" + count(num % 100, "and")
      case _ if (num / 100 == 8) => "eighthundred" + count(num % 100, "and")
      case _ if (num / 100 == 9) => "ninehundred" + count(num % 100, "and")
      // ..
      case 1000 => "onethousand"
      case _ => "" // 0
    }
    // println(">>> " + s)
    s
  }

  override def result = {
    (1 to 1000).map(count(_)).foldLeft(0)((a,b) => a + b.length)
  }
}
