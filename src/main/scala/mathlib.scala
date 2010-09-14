package com.meetup.indyscala

import scala.annotation.tailrec

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
}

// vim: set ts=4 sw=4 et:
