package net.projecteuler

import AbstractProblem._

trait AbstractProblem extends App {

  def result: Any

  run(result, getClass.getSimpleName)
}

object AbstractProblem {

  def run(code: => Any, source: String) {
    val (time, res) = elapsed(code)
    println(s"$source completed in $time ms. Result: $res")
  }

  def elapsed(code: => Any) = {
    val start = System.nanoTime
    val result = code
    ((System.nanoTime - start) / 1e6, result)
  }
}
