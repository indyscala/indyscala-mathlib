package com.meetup.indyscala

package object mathlib {
  def factorial(x: BigInt) = {
    var acc: BigInt = 1
    var i = x
    while (i > 0) {
      acc *= i
      i -= 1
    }
    acc
  }
}

// vim: set ts=4 sw=4 et:
