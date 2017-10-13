package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P12 (**) Decode a run-length encoded list.
//Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
//Example:
//
//scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
//res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

class P12[T] {

  def multiply(x: Int, y: T, ls: List[T]): List[T] = if(x==0) ls else multiply(x-1, y, y :: ls)

  def decode(list: List[(Int, T)]): List[T] = {
    (new P07[T]).flatten(list.map(x => multiply(x._1, x._2, List.empty)))
  }
}
