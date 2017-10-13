package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */
//P21 (*) Insert an element at a given position into a list.
//Example:
//scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
//res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

class P21[T] {
  def insertAt(newElem : T, pos: Int, xs: List[T]): List[T] = {
    val splited = (new P17).split(pos, xs)
    splited._1 ++ List(newElem) ++ splited._2
  }
}
