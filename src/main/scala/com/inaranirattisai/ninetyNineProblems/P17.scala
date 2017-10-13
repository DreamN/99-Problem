package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P17 (*) Split a list into two parts.
//The length of the first part is given. Use a Tuple for your result.
//Example:
//
//scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

class P17[T] {
  def split(n: Int, list: List[T]): (List[T], List[T]) = {
    def iter(cnt: Int, xs: List[T], out: List[T]): (List[T], List[T]) = {
      if(cnt == n) (out, xs)
      else iter(cnt + 1, xs.tail, out :+ xs.head)
    }
    iter(0, list, List.empty)
  }
}
