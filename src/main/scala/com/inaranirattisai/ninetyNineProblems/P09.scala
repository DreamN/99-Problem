package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P09 (**) Pack consecutive duplicates of list elements into sublists.
//If a list contains repeated elements they should be placed in separate sublists.
//Example:
//
//scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

class P09[T] {
  def pack(list: List[T]): List[List[T]] = {

    def iter(xs: List[T], uniqueList: List[List[T]], tmpList: List[T]): List[List[T]] = xs match {
      case Nil => uniqueList ++ List(tmpList)
      case head :: tail => {
        if(head == tmpList.head) iter(tail, uniqueList, head :: tmpList)
        else iter(tail, uniqueList ++ List(tmpList), List(head))
      }
    }
    if(list == List.empty) List.empty
    else iter(list.tail, List.empty, List(list.head))
  }
}
