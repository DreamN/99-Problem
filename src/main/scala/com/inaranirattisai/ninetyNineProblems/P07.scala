package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P07 (**) Flatten a nested list structure.
//Example:
//scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//res0: List[Any] = List(1, 1, 2, 3, 5, 8)

class P07[T] {
  def flatten(list: List[Any]): List[T] = {
    list match {
      case Nil => List.empty
      case head :: tail => (head match{
        case xs: List[T] => flatten(xs)
        case x: T => List(x)
      }) ::: flatten(tail)
    }
  }
}
