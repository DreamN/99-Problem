package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P04 (*) Find the number of elements of a list.
//Example:
//scala> length(List(1, 1, 2, 3, 5, 8))
//res0: Int = 6

class P04[T] {
  def length(list: List[T]): Int = {
    def iter(cnt: Int, xs: List[T]): Int = xs match {
      case Nil => cnt
      case head :: tail => iter(cnt+1, tail)
    }
    iter(0, list)
  }
}
