package com.meetup.indyscala

package object mathlib {
  def factorial(x: BigInt): BigInt = {
    x match {
      case i if i == 0 => 1
      case i => i * factorial(i - 1)
    }
  }
}

// vim: set ts=4 sw=4 et:
