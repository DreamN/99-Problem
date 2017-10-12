package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//  From http://aperiodic.net/phil/scala/s-99/
//

//  P01 (*) Find the last element of a list.
//  Example:
//    scala> last(List(1, 1, 2, 3, 5, 8))
//  res0: Int = 8

class P01[T] {
  def last(xs: List[T]): Option[T] = xs match {
    case Nil => None
    case x :: Nil => Some(x)
    case x :: tail => last(tail)
  }
}