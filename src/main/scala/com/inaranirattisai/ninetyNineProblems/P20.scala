package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P20 (*) Remove the Kth element from a list.
//Return the list and the removed element in a Tuple. Elements are numbered from 0.
//Example:
//
//scala> removeAt(1, List('a, 'b, 'c, 'd))
//res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

class P20[T] {
  def removeAt(n: Int, list: List[T]): (List[T], T) = {
    def iter(cnt: Int, xs: List[T], pref: List[T]):(List[T], T) = {
      if(cnt == n) (pref ++ xs.tail, xs.head)
      else iter(cnt+1, xs.tail, pref :+ xs.head)
    }
    iter(0, list, List.empty)
  }
}
