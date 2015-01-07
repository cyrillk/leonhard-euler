package net.projecteuler

import AbstractProblem._

trait AbstractProblem extends App {

  def result: Any

  run(result, getClass.getSimpleName)
}

object AbstractProblem {

  def run(code: => Any, source: String) {
    val (time, res) = elapsed(code)
    println(s"$source completed in $time ns. Result: $res")
  }

  def elapsed(code: => Any) = {
    val start = System.nanoTime
    (System.nanoTime - start, code)
  }
}
