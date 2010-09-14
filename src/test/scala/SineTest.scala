package com.meetup.indyscala.mathlib

import org.scalatest._
import org.scalatest.matchers._

import scala.math.{Pi, sqrt, abs}

import org.scalatest.prop.Checkers
import org.scalacheck.Arbitrary._
import org.scalacheck.Prop._

class SineTest extends FunSuite with ShouldMatchers with Checkers {
  test("sin(0) == 0") {
    sin(0) should be (0.0 plusOrMinus 1e-3)
  }

  test("sin(Pi/2) == 1") {
    sin(Pi/2) should be (1.0 plusOrMinus 1e-3)
  }

  test("sin(Pi/4) == sqrt(2)/2") {
    sin(Pi/4) should be (sqrt(2)/2 plusOrMinus 1e-3)
  }

  test("sin(x) == sin(x + 2*Pi)") {
    check((x: Double) => abs(sin(x) - sin(x + 2 * Pi)) < 1e-3)
  }  

  ignore("-Pi <= normalizeRadians(x) <= Pi") {
    check((x: Double) => {
      val n = normalizeRadians(x)
      (n >= -Pi) && (n <= Pi)
    })
  }  
}

// vim: set ts=4 sw=4 et:
