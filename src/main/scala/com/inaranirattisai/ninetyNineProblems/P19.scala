package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P19 (**) Rotate a list N places to the left.
//Examples:
//scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
//
//scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

class P19[T] {
  def rotate(n: Int, list: List[T]): List[T] = {
    val splited: (List[T], List[T]) = (new P17[T]).split(if(n < 0) (new P04[T]).length(list) + n else n, list)
    splited._2 ++ splited._1
  }
}
