package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P13 (**) Run-length encoding of a list (direct solution).
//Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
//Example:
//
//scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

class P13[T] {
  def encodeDirect(list: List[T]): List[(Int, T)] = {
    def iter(xs: List[T], uniqueList: List[(Int, T)], tmpList: List[T]): List[(Int, T)] = xs match {
      case Nil => uniqueList :+ ((new P04[T]).length(tmpList), tmpList.head)
      case head :: tail => {
        if(head == tmpList.head) iter(tail, uniqueList, head :: tmpList)
        else iter(tail, uniqueList :+ ((new P04[T]).length(tmpList), tmpList.head), List(head))
      }
    }
    if(list == List.empty) List.empty
    else iter(list.tail, List.empty, List(list.head))
  }
}
