package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P15 (**) Duplicate the elements of a list a given number of times.
//Example:
//scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
//res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

class P15[T] {

  def multiply(x: Int, y: T, ls: List[T]): List[T] = if(x==0) ls else multiply(x-1, y, y :: ls)

  def duplicateN(amount: Int, xs: List[T]): List[T] = {
    xs.flatMap(x => multiply(amount, x, List.empty))
  }
}
