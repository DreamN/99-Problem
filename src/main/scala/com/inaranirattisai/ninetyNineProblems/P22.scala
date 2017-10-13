package com.inaranirattisai.ninetyNineProblems

/**
  * Created by inaraniratti on Oct, 2017
  */

//P22 (*) Create a list containing all integers within a given range.
//Example:
//scala> range(4, 9)
//res0: List[Int] = List(4, 5, 6, 7, 8, 9)

class P22 {
  def range(start: Int, stop: Int): List[Int] = {
    (start to stop).toList
  }
}
