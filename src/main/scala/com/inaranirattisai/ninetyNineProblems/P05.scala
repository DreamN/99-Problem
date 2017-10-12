package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */


//P05 (*) Reverse a list.
//Example:
//scala> reverse(List(1, 1, 2, 3, 5, 8))
//res0: List[Int] = List(8, 5, 3, 2, 1, 1)

class P05[T] {
  def reverse(list: List[T]): List[T] = {
    def iter(oxs: List[T], nxs: List[T]): List[T] = oxs match {
      case Nil => nxs
      case head :: tail => iter(tail, head :: nxs )
    }
    iter(list, List.empty)
  }
}
