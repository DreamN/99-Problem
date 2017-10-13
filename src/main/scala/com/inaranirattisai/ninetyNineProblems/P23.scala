package com.inaranirattisai.ninetyNineProblems

import scala.util.Random

/**
  * Created by inaraniratti on Oct, 2017
  */

//P23 (**) Extract a given number of randomly selected elements from a list.
//Example:
//scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
//res0: List[Symbol] = List('e, 'd, 'a)
//Hint: Use the solution to problem P20

class P23[T] {
  def randomSelect(n: Int, list: List[T]): List[T] = {
    if(n > (new P04[T]).length(list)) throw new Exception("N must be less than or equal the amount of elems in list")
    val p20 = new P20[T]
    val r = Random
    def iter(cnt: Int, xs: List[T], out: List[T]): List[T] = {
      if(n == cnt) out
      else p20.removeAt(r.nextInt((new P04[T]).length(xs)), xs) match {
        case (avail, elem) => iter(cnt+1, avail, elem :: out)
      }
    }
    iter(0, list, List.empty)
  }
}
