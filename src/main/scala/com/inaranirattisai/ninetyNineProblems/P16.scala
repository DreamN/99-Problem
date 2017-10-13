package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P16 (**) Drop every Nth element from a list.
//Example:
//scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

class P16[T] {
  def drop(n: Int, list: List[T]): List[T] = {
    def iter(cnt: Int, xs: List[T], out: List[T]): List[T] = {
      if(xs == List.empty) out
      else if(cnt == n) iter(1, xs.tail, out)
      else iter(cnt + 1, xs.tail, out :+ xs.head)
    }
    iter(1, list, List.empty)
  }
}
