package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//Find the Kth element of a list.
//By convention, the first element in the list is element 0.
//Example:
//
//scala> nth(2, List(1, 1, 2, 3, 5, 8))
//res0: Int = 2

class P03[T] {
  def nth(order: Int, list: List[T]): Option[T] = {
    def iter(cnt: Int, xs: List[T]): Option[T] = xs match {
        case Nil => None
        case head :: tail if cnt == order => Some(head)
        case _ if xs != List.empty => iter(cnt+1, xs.tail)
    }
    iter(0, list)
  }
}
