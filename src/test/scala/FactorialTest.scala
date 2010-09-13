package com.meetup.indyscala.mathlib

import org.scalatest._
import org.scalatest.matchers._

class FactorialTest extends FunSuite with ShouldMatchers {
  test("1! == 1") {
    factorial(1) should be (1)
  }

  test("0! == 1") {
    factorial(0) should be (1)
  }

  test("3! == 6") {
    factorial(3) should be (6)
  }
}

// vim: set ts=4 sw=4 et:
