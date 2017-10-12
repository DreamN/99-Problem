package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P08 (**) Eliminate consecutive duplicates of list elements.
//If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
//Example:
//
//scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

class P08[T] {
  def compress(list: List[T]): List[T] = {
    def iter(xs: List[T], prev: T, uniqueList: List[T]): List[T] = xs match {
      case Nil => uniqueList
      case head :: tail => {
        if(head == prev) iter(tail, prev, uniqueList)
        else iter(tail, head, uniqueList ::: List(head))
      }
    }
    if(list == List.empty) List.empty
    else iter(list.tail, list.head, List(list.head))
  }
}





//def compress(list: List[T]): List[T] = {

  //    def isExist(x: T, xs: List[T]): Boolean = xs match {
  //      case Nil => false
  //      case head :: tail => {
  //       if(x == head) true else isExist(x, tail)
  //      }
  //    }
  //    def iter(xs: List[T], uniqueList: List[T]): List[T] = xs match {
  //      case Nil => uniqueList
  //      case head :: tail => iter(tail, if(!isExist(head, uniqueList)) head :: uniqueList else uniqueList )
  //    }
  //    iter(list, List.empty)
//}