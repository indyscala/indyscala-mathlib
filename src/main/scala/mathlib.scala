package com.meetup.indyscala

import scala.annotation.tailrec
import scala.math.{Pi, pow}

package object mathlib {
  def factorial(x: Int): BigInt = {
    @tailrec
    def factorial2(x: Int, acc: BigInt): BigInt = {
      x match {
        case 0 => acc
        case i => factorial2(i - 1,  acc * i)
      }
    }
    factorial2(x, 1)
  }

  def sin(r: Double): Double = {
    val norm = normalizeRadians(r)
    norm - pow(norm, 3)/factorial(3).doubleValue + pow(norm,5)/factorial(5).doubleValue - pow(norm,7)/factorial(7).doubleValue
  }

  def normalizeRadians(r: Double): Double = {
    val a = ((r + Pi) % (2 * Pi))
    val b = if (a < 0) { a + (2*Pi) } else a
    b - Pi
  }
}

// vim: set ts=4 sw=4 et:
