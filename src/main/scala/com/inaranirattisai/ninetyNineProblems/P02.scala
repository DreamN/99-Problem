package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P02 (*) Find the last but one element of a list.
//Example:
//scala> penultimate(List(1, 1, 2, 3, 5, 8))
//res0: Int = 5

class P02[T] {
  def penultimate(xs: List[T]): Option[T] = xs match {
    case Nil => None
    case x :: Nil => None
    case x1 :: x2 :: Nil => Some(x1)
    case head :: tail => penultimate(tail)
  }
}

