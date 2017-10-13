package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P25 (*) Generate a random permutation of the elements of a list.
//Hint: Use the solution of problem P23.
//Example:
//
//scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
//res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)

class P25[T] {
  def randomPermute(xs: List[T]): List[T] = {
    val p23 = new P23[T]
    p23.randomSelect((new P04).length(xs), xs)
  }
}
