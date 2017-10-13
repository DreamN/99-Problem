package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P18 (**) Extract a slice from a list.
//Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
//Example:
//
//scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: List[Symbol] = List('d, 'e, 'f, 'g)

class P18[T] {
  def slice(start: Int, stop: Int, list: List[T]): List[T] = {
    def iter(cnt: Int, xs: List[T], out: List[T]): List[T] = {
      if(cnt == stop) out
      else iter(cnt + 1, xs.tail, if(cnt >= start) out :+ xs.head else out)
    }
    iter(0, list, List.empty)
  }
}
