package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P14 (*) Duplicate the elements of a list.
//Example:
//scala> duplicate(List('a, 'b, 'c, 'c, 'd))
//res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

class P14[T] {

  def duplicate(xs: List[T]): List[T] = {
    xs.flatMap(x => List(x, x))
  }

}
